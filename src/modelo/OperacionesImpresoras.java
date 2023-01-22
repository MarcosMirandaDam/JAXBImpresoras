package modelo;

import PaqueteImpresorasBinding.ObjectFactory;
import PaqueteImpresorasBinding.SistemasImpresion;
import PaqueteImpresorasBinding.SistemasImpresion.Cartuchos;
import PaqueteImpresorasBinding.SistemasImpresion.Cartuchos.Cartucho;
import PaqueteImpresorasBinding.SistemasImpresion.Cartuchos.Cartucho.Marca;
import PaqueteImpresorasBinding.SistemasImpresion.Impresoras.Impresora;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Marcos Miranda
 */
public class OperacionesImpresoras {

    ObjectFactory fabrica = new ObjectFactory();

    /**
     * metodo unmarshalizar
     *
     * @param ficheroXML
     * @return
     * @throws JAXBException
     */
    public JAXBElement unmarshalizar(File ficheroXML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("PaqueteImpresorasBinding");
        //Objeto unmarshall instanciado 
        Unmarshaller unmarshall = jaxbContext.createUnmarshaller();
        //
        JAXBElement jaxbElement = unmarshall.unmarshal(new StreamSource(ficheroXML), SistemasImpresion.class);
        return jaxbElement;
    }

    /**
     * metodo marshalizar
     *
     * @param jaxbElement
     * @param ficheroXMLsalida
     * @throws JAXBException
     */
    public void marshalizar(JAXBElement jaxbElement, File ficheroXMLsalida) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("PaqueteImpresorasBinding");  //<-----nombre del paquete creado							
        Marshaller m = jaxbContext.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(jaxbElement, ficheroXMLsalida);
    }

    /**
     * Retorna una HashMap con el nombre del modelo de la impresora y su lista
     * de cartuchos compatibles.
     *
     * @param jaxbElement
     * @return
     */
    public Map<String, List<String>> hashMapModeloCartuchosCompatibles(JAXBElement jaxbElement) {
        SistemasImpresion raizSistemasImpresion = fabrica.createSistemasImpresion();
        raizSistemasImpresion = (SistemasImpresion) jaxbElement.getValue();
        Map<String, List<String>> mapaModeloCartuchosCompatibles = new HashMap<>();
        List<Impresora> listaImpresoras = raizSistemasImpresion.getImpresoras().getImpresora();
        List<String> cartuchosListados = new ArrayList<>();
        for (Impresora impresora : listaImpresoras) {
            List<Impresora.CartuchosCompatibles.Cartuchos> listaCartuchos = impresora.getCartuchosCompatibles().getCartuchos();
            for (Impresora.CartuchosCompatibles.Cartuchos cartucho : listaCartuchos) {
                 cartuchosListados.add(cartucho.getModelo());
                  mapaModeloCartuchosCompatibles.put(impresora.getModelo().getValue(), cartuchosListados);
            }
           
                       
        }
        return mapaModeloCartuchosCompatibles;
    }

    /**
     * Borra todos los cartuchos de una determinada marca (atención que aparece
     * en varias ramas)
     *
     * @param jaxbElement
     * @param nombreMarcaBorrar
     * @return
     */
    public boolean eliminarMarcaCartucho(JAXBElement jaxbElement, String nombreMarcaBorrar) {
        boolean eliminada = false;
        SistemasImpresion raizSistemasImpresion = fabrica.createSistemasImpresion();
        raizSistemasImpresion = (SistemasImpresion) jaxbElement.getValue();
        //rama cartuchos
        List<Cartucho> listaCartuchos = raizSistemasImpresion.getCartuchos().getCartucho();
        for (Iterator<Cartucho> iterator = listaCartuchos.iterator(); iterator.hasNext();) {
            Cartucho next = iterator.next();
            if (next.getMarca().getNombre().equalsIgnoreCase(nombreMarcaBorrar)) {
                iterator.remove();
                eliminada = true;
            }
            
        }

        //rama impresoras
        List<Impresora> listaImpresoras = raizSistemasImpresion.getImpresoras().getImpresora();
        for (Iterator<Impresora> iterator = listaImpresoras.iterator(); iterator.hasNext();) {
            Impresora next = iterator.next();
            if(next.getMarca().getNombre().equalsIgnoreCase(nombreMarcaBorrar)){
                iterator.remove();
                eliminada=true;
            }
        }
        return eliminada;
    }

    /**
     * Retorna una lista de las impresoras que se pueden utilizar con un
     * determinado modelo de cartucho.
     */
    public ArrayList<String> impresorasDeterminadoCartucho(JAXBElement jaxbElement, String modeloCartuchoDeseado) {
        SistemasImpresion raizSistemasImpresion = fabrica.createSistemasImpresion();
        raizSistemasImpresion = (SistemasImpresion) jaxbElement.getValue();
        ArrayList<String> listaCompatibles = new ArrayList<>();
        List<Cartucho> listaCartuchos = raizSistemasImpresion.getCartuchos().getCartucho();
        for (Cartucho cartucho : listaCartuchos) {
            if(cartucho.getModelo().equalsIgnoreCase(modeloCartuchoDeseado)){
                List<Impresora> impresoras = raizSistemasImpresion.getImpresoras().getImpresora();
                for (Impresora impresora : impresoras) {
                    listaCompatibles.add(impresora.getMarca().getNombre());
                }
                
            }
        }
        return listaCompatibles;
    }

    /**
     * Retorna los 3 cartuchos que imprimen mas páginas para un modelo de
     * impresora determinado. (Comparator)
     */
    public List<CartuchoImpresiones> cartuchosMasPaginas(JAXBElement jaxbElement, String modeloCartuchoDeseado) {
        SistemasImpresion raizSistemasImpresion = fabrica.createSistemasImpresion();
        raizSistemasImpresion = (SistemasImpresion) jaxbElement.getValue();
        List<CartuchoImpresiones> listaImpresionesPaginas = new ArrayList<>();
        List<Impresora> listaImpresoras = raizSistemasImpresion.getImpresoras().getImpresora();
        for (Impresora impresora : listaImpresoras) {
            List<Impresora.CartuchosCompatibles.Cartuchos> listaCartuchos = impresora.getCartuchosCompatibles().getCartuchos();
            for (Impresora.CartuchosCompatibles.Cartuchos cartucho : listaCartuchos) {
                listaImpresionesPaginas.add(new CartuchoImpresiones(cartucho.getModelo(), cartucho.getMaxPaginas()));
            }
             
            Comparator<CartuchoImpresiones> comparator = (CartuchoImpresiones c1, CartuchoImpresiones c2) -> c2.getMaxPaginas() - c1.getMaxPaginas();
            {

            };
            Collections.sort(listaImpresionesPaginas, comparator);
        }
        listaImpresionesPaginas = new ArrayList<CartuchoImpresiones>(listaImpresionesPaginas.subList(0, 3));

        return listaImpresionesPaginas;
    }
    
    /**
     * Retorna una lista de impresoras de una determinada marca(nombre) ordenadas por precio. (Comparator)
     */

    
    
    
    /**
     * Modifica la dirección de una determinada marca( por nombre).
     */
    
    
    
    /**
     * Añade un cartucho compatible nuevo a una impresora (modelo)
     */
 
    public boolean aniadirCartuchoCompatibleDeterminado(JAXBElement jaxbElement, String nombreImpresoraDeseada){
        boolean aniadido=false;
        SistemasImpresion raizSistemasImpresion = fabrica.createSistemasImpresion();
        raizSistemasImpresion = (SistemasImpresion) jaxbElement.getValue();
        List<Impresora> listaImpresoras = raizSistemasImpresion.getImpresoras().getImpresora();
        for (Impresora impresora : listaImpresoras) {
            if(impresora.getMarca().getNombre().equalsIgnoreCase(nombreImpresoraDeseada)){
                Impresora.CartuchosCompatibles.Cartuchos cartuchoNuevo = fabrica.createSistemasImpresionImpresorasImpresoraCartuchosCompatiblesCartuchos();
                cartuchoNuevo.setMaxPaginas(25000);
                cartuchoNuevo.setModelo("MinimalExpression");
                List<Impresora.CartuchosCompatibles.Cartuchos> listaCartuchos = impresora.getCartuchosCompatibles().getCartuchos();
                listaCartuchos.add(cartuchoNuevo);
                    aniadido=true;
                }
            }
        
        return aniadido;
        
        
    }
    
    /**
     * Retorna las impresoras que  al menos con algunos de los cartuchos se pueden imprimir más de 1000 hojas. 
     */
    
    
}
