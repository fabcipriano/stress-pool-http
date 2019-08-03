
package br.com.facio.labs.stress.pool.http.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetCRM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="option" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentNumber",
    "targetCRM",
    "option"
})
@XmlRootElement(name = "QueryAssetsRequestMessage")
public class QueryAssetsRequestMessage {

    @XmlElement(required = true)
    protected String documentNumber;
    @XmlElement(required = true)
    protected String targetCRM;
    @XmlElement(required = true)
    protected String option;

    /**
     * Obtém o valor da propriedade documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define o valor da propriedade documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obtém o valor da propriedade targetCRM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCRM() {
        return targetCRM;
    }

    /**
     * Define o valor da propriedade targetCRM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCRM(String value) {
        this.targetCRM = value;
    }

    /**
     * Obtém o valor da propriedade option.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOption() {
        return option;
    }

    /**
     * Define o valor da propriedade option.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOption(String option) {
        this.option = option;
    }
}
