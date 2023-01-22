//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.23 a las 12:33:26 AM CET 
//


package PaqueteImpresorasBinding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="impresoras"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="impresora" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="marca"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="modelo"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="descatalogado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                             &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="cartuchosCompatibles"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="cartuchos" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="marca"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="modeloCartucho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                           &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cartuchos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cartucho" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="marca"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="marcas"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="marca" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "impresoras",
    "cartuchos",
    "marcas"
})
@XmlRootElement(name = "sistemasImpresion")
public class SistemasImpresion {

    @XmlElement(required = true)
    protected SistemasImpresion.Impresoras impresoras;
    @XmlElement(required = true)
    protected SistemasImpresion.Cartuchos cartuchos;
    @XmlElement(required = true)
    protected SistemasImpresion.Marcas marcas;

    /**
     * Obtiene el valor de la propiedad impresoras.
     * 
     * @return
     *     possible object is
     *     {@link SistemasImpresion.Impresoras }
     *     
     */
    public SistemasImpresion.Impresoras getImpresoras() {
        return impresoras;
    }

    /**
     * Define el valor de la propiedad impresoras.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemasImpresion.Impresoras }
     *     
     */
    public void setImpresoras(SistemasImpresion.Impresoras value) {
        this.impresoras = value;
    }

    /**
     * Obtiene el valor de la propiedad cartuchos.
     * 
     * @return
     *     possible object is
     *     {@link SistemasImpresion.Cartuchos }
     *     
     */
    public SistemasImpresion.Cartuchos getCartuchos() {
        return cartuchos;
    }

    /**
     * Define el valor de la propiedad cartuchos.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemasImpresion.Cartuchos }
     *     
     */
    public void setCartuchos(SistemasImpresion.Cartuchos value) {
        this.cartuchos = value;
    }

    /**
     * Obtiene el valor de la propiedad marcas.
     * 
     * @return
     *     possible object is
     *     {@link SistemasImpresion.Marcas }
     *     
     */
    public SistemasImpresion.Marcas getMarcas() {
        return marcas;
    }

    /**
     * Define el valor de la propiedad marcas.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemasImpresion.Marcas }
     *     
     */
    public void setMarcas(SistemasImpresion.Marcas value) {
        this.marcas = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="cartucho" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="marca"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cartucho"
    })
    public static class Cartuchos {

        protected List<SistemasImpresion.Cartuchos.Cartucho> cartucho;

        /**
         * Gets the value of the cartucho property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cartucho property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCartucho().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SistemasImpresion.Cartuchos.Cartucho }
         * 
         * 
         */
        public List<SistemasImpresion.Cartuchos.Cartucho> getCartucho() {
            if (cartucho == null) {
                cartucho = new ArrayList<SistemasImpresion.Cartuchos.Cartucho>();
            }
            return this.cartucho;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="marca"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "marca",
            "modelo",
            "maxPaginas"
        })
        public static class Cartucho {

            @XmlElement(required = true)
            protected SistemasImpresion.Cartuchos.Cartucho.Marca marca;
            @XmlElement(required = true)
            protected String modelo;
            protected int maxPaginas;

            /**
             * Obtiene el valor de la propiedad marca.
             * 
             * @return
             *     possible object is
             *     {@link SistemasImpresion.Cartuchos.Cartucho.Marca }
             *     
             */
            public SistemasImpresion.Cartuchos.Cartucho.Marca getMarca() {
                return marca;
            }

            /**
             * Define el valor de la propiedad marca.
             * 
             * @param value
             *     allowed object is
             *     {@link SistemasImpresion.Cartuchos.Cartucho.Marca }
             *     
             */
            public void setMarca(SistemasImpresion.Cartuchos.Cartucho.Marca value) {
                this.marca = value;
            }

            /**
             * Obtiene el valor de la propiedad modelo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModelo() {
                return modelo;
            }

            /**
             * Define el valor de la propiedad modelo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModelo(String value) {
                this.modelo = value;
            }

            /**
             * Obtiene el valor de la propiedad maxPaginas.
             * 
             */
            public int getMaxPaginas() {
                return maxPaginas;
            }

            /**
             * Define el valor de la propiedad maxPaginas.
             * 
             */
            public void setMaxPaginas(int value) {
                this.maxPaginas = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nombre",
                "telefono",
                "correoE"
            })
            public static class Marca {

                @XmlElement(required = true)
                protected String nombre;
                @XmlElement(required = true)
                protected String telefono;
                @XmlElement(required = true)
                protected String correoE;

                /**
                 * Obtiene el valor de la propiedad nombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombre() {
                    return nombre;
                }

                /**
                 * Define el valor de la propiedad nombre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombre(String value) {
                    this.nombre = value;
                }

                /**
                 * Obtiene el valor de la propiedad telefono.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTelefono() {
                    return telefono;
                }

                /**
                 * Define el valor de la propiedad telefono.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTelefono(String value) {
                    this.telefono = value;
                }

                /**
                 * Obtiene el valor de la propiedad correoE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCorreoE() {
                    return correoE;
                }

                /**
                 * Define el valor de la propiedad correoE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCorreoE(String value) {
                    this.correoE = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="impresora" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="marca"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="modelo"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="descatalogado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *                   &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="cartuchosCompatibles"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="cartuchos" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="marca"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="modeloCartucho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                                 &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "impresora"
    })
    public static class Impresoras {

        protected List<SistemasImpresion.Impresoras.Impresora> impresora;

        /**
         * Gets the value of the impresora property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the impresora property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImpresora().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SistemasImpresion.Impresoras.Impresora }
         * 
         * 
         */
        public List<SistemasImpresion.Impresoras.Impresora> getImpresora() {
            if (impresora == null) {
                impresora = new ArrayList<SistemasImpresion.Impresoras.Impresora>();
            }
            return this.impresora;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="marca"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="modelo"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="descatalogado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
         *         &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="cartuchosCompatibles"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="cartuchos" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="marca"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="modeloCartucho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                                       &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "marca",
            "modelo",
            "precio",
            "fechaSalida",
            "cartuchosCompatibles"
        })
        public static class Impresora {

            @XmlElement(required = true)
            protected SistemasImpresion.Impresoras.Impresora.Marca marca;
            @XmlElement(required = true)
            protected SistemasImpresion.Impresoras.Impresora.Modelo modelo;
            protected short precio;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaSalida;
            @XmlElement(required = true)
            protected SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles cartuchosCompatibles;

            /**
             * Obtiene el valor de la propiedad marca.
             * 
             * @return
             *     possible object is
             *     {@link SistemasImpresion.Impresoras.Impresora.Marca }
             *     
             */
            public SistemasImpresion.Impresoras.Impresora.Marca getMarca() {
                return marca;
            }

            /**
             * Define el valor de la propiedad marca.
             * 
             * @param value
             *     allowed object is
             *     {@link SistemasImpresion.Impresoras.Impresora.Marca }
             *     
             */
            public void setMarca(SistemasImpresion.Impresoras.Impresora.Marca value) {
                this.marca = value;
            }

            /**
             * Obtiene el valor de la propiedad modelo.
             * 
             * @return
             *     possible object is
             *     {@link SistemasImpresion.Impresoras.Impresora.Modelo }
             *     
             */
            public SistemasImpresion.Impresoras.Impresora.Modelo getModelo() {
                return modelo;
            }

            /**
             * Define el valor de la propiedad modelo.
             * 
             * @param value
             *     allowed object is
             *     {@link SistemasImpresion.Impresoras.Impresora.Modelo }
             *     
             */
            public void setModelo(SistemasImpresion.Impresoras.Impresora.Modelo value) {
                this.modelo = value;
            }

            /**
             * Obtiene el valor de la propiedad precio.
             * 
             */
            public short getPrecio() {
                return precio;
            }

            /**
             * Define el valor de la propiedad precio.
             * 
             */
            public void setPrecio(short value) {
                this.precio = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaSalida.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaSalida() {
                return fechaSalida;
            }

            /**
             * Define el valor de la propiedad fechaSalida.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaSalida(XMLGregorianCalendar value) {
                this.fechaSalida = value;
            }

            /**
             * Obtiene el valor de la propiedad cartuchosCompatibles.
             * 
             * @return
             *     possible object is
             *     {@link SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles }
             *     
             */
            public SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles getCartuchosCompatibles() {
                return cartuchosCompatibles;
            }

            /**
             * Define el valor de la propiedad cartuchosCompatibles.
             * 
             * @param value
             *     allowed object is
             *     {@link SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles }
             *     
             */
            public void setCartuchosCompatibles(SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles value) {
                this.cartuchosCompatibles = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="cartuchos" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="marca"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="modeloCartucho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                             &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cartuchos"
            })
            public static class CartuchosCompatibles {

                protected List<SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos> cartuchos;

                /**
                 * Gets the value of the cartuchos property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cartuchos property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCartuchos().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos }
                 * 
                 * 
                 */
                public List<SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos> getCartuchos() {
                    if (cartuchos == null) {
                        cartuchos = new ArrayList<SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos>();
                    }
                    return this.cartuchos;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="marca"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="modeloCartucho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *                   &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="maxPaginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "marca",
                    "modelo",
                    "maxPaginas"
                })
                public static class Cartuchos {

                    @XmlElement(required = true)
                    protected SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos.Marca marca;
                    @XmlElement(required = true)
                    protected String modelo;
                    protected int maxPaginas;

                    /**
                     * Obtiene el valor de la propiedad marca.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos.Marca }
                     *     
                     */
                    public SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos.Marca getMarca() {
                        return marca;
                    }

                    /**
                     * Define el valor de la propiedad marca.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos.Marca }
                     *     
                     */
                    public void setMarca(SistemasImpresion.Impresoras.Impresora.CartuchosCompatibles.Cartuchos.Marca value) {
                        this.marca = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad modelo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getModelo() {
                        return modelo;
                    }

                    /**
                     * Define el valor de la propiedad modelo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setModelo(String value) {
                        this.modelo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad maxPaginas.
                     * 
                     */
                    public int getMaxPaginas() {
                        return maxPaginas;
                    }

                    /**
                     * Define el valor de la propiedad maxPaginas.
                     * 
                     */
                    public void setMaxPaginas(int value) {
                        this.maxPaginas = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="modeloCartucho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                     *         &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "modeloCartucho",
                        "nombre",
                        "telefono",
                        "correoE"
                    })
                    public static class Marca {

                        protected String modeloCartucho;
                        protected String nombre;
                        protected int telefono;
                        @XmlElement(required = true)
                        protected String correoE;

                        /**
                         * Obtiene el valor de la propiedad modeloCartucho.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModeloCartucho() {
                            return modeloCartucho;
                        }

                        /**
                         * Define el valor de la propiedad modeloCartucho.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModeloCartucho(String value) {
                            this.modeloCartucho = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad nombre.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNombre() {
                            return nombre;
                        }

                        /**
                         * Define el valor de la propiedad nombre.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNombre(String value) {
                            this.nombre = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad telefono.
                         * 
                         */
                        public int getTelefono() {
                            return telefono;
                        }

                        /**
                         * Define el valor de la propiedad telefono.
                         * 
                         */
                        public void setTelefono(int value) {
                            this.telefono = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad correoE.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCorreoE() {
                            return correoE;
                        }

                        /**
                         * Define el valor de la propiedad correoE.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCorreoE(String value) {
                            this.correoE = value;
                        }

                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nombre",
                "telefono",
                "correoE",
                "direccion"
            })
            public static class Marca {

                @XmlElement(required = true)
                protected String nombre;
                protected int telefono;
                @XmlElement(required = true)
                protected String correoE;
                protected String direccion;

                /**
                 * Obtiene el valor de la propiedad nombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombre() {
                    return nombre;
                }

                /**
                 * Define el valor de la propiedad nombre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombre(String value) {
                    this.nombre = value;
                }

                /**
                 * Obtiene el valor de la propiedad telefono.
                 * 
                 */
                public int getTelefono() {
                    return telefono;
                }

                /**
                 * Define el valor de la propiedad telefono.
                 * 
                 */
                public void setTelefono(int value) {
                    this.telefono = value;
                }

                /**
                 * Obtiene el valor de la propiedad correoE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCorreoE() {
                    return correoE;
                }

                /**
                 * Define el valor de la propiedad correoE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCorreoE(String value) {
                    this.correoE = value;
                }

                /**
                 * Obtiene el valor de la propiedad direccion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccion() {
                    return direccion;
                }

                /**
                 * Define el valor de la propiedad direccion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccion(String value) {
                    this.direccion = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="descatalogado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Modelo {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "descatalogado")
                protected String descatalogado;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad descatalogado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescatalogado() {
                    return descatalogado;
                }

                /**
                 * Define el valor de la propiedad descatalogado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescatalogado(String value) {
                    this.descatalogado = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="marca" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "marca"
    })
    public static class Marcas {

        protected List<SistemasImpresion.Marcas.Marca> marca;

        /**
         * Gets the value of the marca property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marca property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarca().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SistemasImpresion.Marcas.Marca }
         * 
         * 
         */
        public List<SistemasImpresion.Marcas.Marca> getMarca() {
            if (marca == null) {
                marca = new ArrayList<SistemasImpresion.Marcas.Marca>();
            }
            return this.marca;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="correoE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nombre",
            "telefono",
            "correoE"
        })
        public static class Marca {

            @XmlElement(required = true)
            protected String nombre;
            @XmlElement(required = true)
            protected String telefono;
            @XmlElement(required = true)
            protected String correoE;

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad telefono.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelefono() {
                return telefono;
            }

            /**
             * Define el valor de la propiedad telefono.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelefono(String value) {
                this.telefono = value;
            }

            /**
             * Obtiene el valor de la propiedad correoE.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorreoE() {
                return correoE;
            }

            /**
             * Define el valor de la propiedad correoE.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorreoE(String value) {
                this.correoE = value;
            }

        }

    }

}
