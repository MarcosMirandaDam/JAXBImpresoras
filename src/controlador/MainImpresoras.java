package controlador;

import PaqueteImpresorasBinding.ObjectFactory;
import PaqueteImpresorasBinding.SistemasImpresion;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import modelo.OperacionesImpresoras;

/**
 *
 * @author Marcos Miranda
 */
public class MainImpresoras {

    public static void main(String[] args) {

        
            OperacionesImpresoras operacion = new OperacionesImpresoras();

            //archivo de entrada
            File ficheroXML = new File("impresoras.xml");
            // archivo de salida
            File ficheroXMLsalida = new File("impresorasSalida.xml");
        try {
            //unmarshalizar
            JAXBElement jaxbElement = operacion.unmarshalizar(ficheroXML);

            ObjectFactory fabrica = new ObjectFactory();
            
            SistemasImpresion raizSistemasImpresion = fabrica.createSistemasImpresion();
            
            raizSistemasImpresion = (SistemasImpresion) jaxbElement.getValue();

            /////////////////////////////////////////////////////////////////////////////////
            //////////////////////////  OPERACIONES /////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////
            
            
            //Retorna una HashMap con el nombre del modelo de la impresora y su lista de cartuchos compatibles.
            System.out.println(operacion.hashMapModeloCartuchosCompatibles(jaxbElement));
            
           // Borra todos los cartuchos de una determinada marca (atención que aparece en varias ramas)
           System.out.println(operacion.eliminarMarcaCartucho(jaxbElement, "String"));
            
           // Retorna una lista de las impresoras que se pueden utilizar con un determinado modelo de cartucho.
            System.out.println(operacion.impresorasDeterminadoCartucho(jaxbElement, "PowerLink"));
           
            //Retorna los 3 cartuchos que imprimen mas páginas para un modelo de impresora determinado. (Comparator)
            System.out.println(operacion.cartuchosMasPaginas(jaxbElement, "1234"));
            
            //Añade un cartucho compatible nuevo a una impresora (modelo)
            System.out.println(operacion.aniadirCartuchoCompatibleDeterminado(jaxbElement, "canon"));
            
            //marshalizar
            operacion.marshalizar(jaxbElement, ficheroXMLsalida);

        } catch (JAXBException ex) {
            Logger.getLogger(MainImpresoras.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
