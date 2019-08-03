
package br.com.facio.labs.stress.pool.http.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Asset complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementDocumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNLAcronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNLCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="circuit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "productId",
    "agreementId",
    "contractNumber",
    "agreementDocumentCode",
    "accountId",
    "cnlAcronym",
    "cnlCode",
    "productName",
    "serviceId",
    "lineOfBusiness",
    "status",
    "paymentMode",
    "system",
    "circuit"
})
@XmlSeeAlso({
    br.com.facio.labs.stress.pool.http.models.QueryAssetDetailsResponseMessage.Asset.class
})
public class Asset {

    protected String productId;
    protected String agreementId;
    protected String contractNumber;
    protected String agreementDocumentCode;
    protected String accountId;
    @XmlElement(name = "CNLAcronym")
    protected String cnlAcronym;
    @XmlElement(name = "CNLCode")
    protected String cnlCode;
    protected String productName;
    protected String serviceId;
    protected String lineOfBusiness;
    protected String status;
    protected String paymentMode;
    @XmlElement(required = true)
    protected String system;
    @XmlElement(required = true)
    protected String circuit;

    /**
     * Obtém o valor da propriedade productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define o valor da propriedade productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obtém o valor da propriedade agreementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementId() {
        return agreementId;
    }

    /**
     * Define o valor da propriedade agreementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementId(String value) {
        this.agreementId = value;
    }

    /**
     * Obtém o valor da propriedade contractNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Define o valor da propriedade contractNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Obtém o valor da propriedade agreementDocumentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementDocumentCode() {
        return agreementDocumentCode;
    }

    /**
     * Define o valor da propriedade agreementDocumentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementDocumentCode(String value) {
        this.agreementDocumentCode = value;
    }

    /**
     * Obtém o valor da propriedade accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Define o valor da propriedade accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Obtém o valor da propriedade cnlAcronym.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNLAcronym() {
        return cnlAcronym;
    }

    /**
     * Define o valor da propriedade cnlAcronym.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNLAcronym(String value) {
        this.cnlAcronym = value;
    }

    /**
     * Obtém o valor da propriedade cnlCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNLCode() {
        return cnlCode;
    }

    /**
     * Define o valor da propriedade cnlCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNLCode(String value) {
        this.cnlCode = value;
    }

    /**
     * Obtém o valor da propriedade productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define o valor da propriedade productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtém o valor da propriedade serviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Define o valor da propriedade serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Obtém o valor da propriedade lineOfBusiness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Define o valor da propriedade lineOfBusiness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusiness(String value) {
        this.lineOfBusiness = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade paymentMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Define o valor da propriedade paymentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

    /**
     * Obtém o valor da propriedade system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Define o valor da propriedade system.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Obtém o valor da propriedade circuit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuit() {
        return circuit;
    }

    /**
     * Define o valor da propriedade circuit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuit(String value) {
        this.circuit = value;
    }

}
