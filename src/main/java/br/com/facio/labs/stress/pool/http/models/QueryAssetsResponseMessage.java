
package br.com.facio.labs.stress.pool.http.models;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Asset" type="{http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS}Asset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceState" type="{http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS}ServiceState"/>
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
    "asset",
    "serviceState"
})
@XmlRootElement(name = "QueryAssetsResponseMessage")
public class QueryAssetsResponseMessage {

    @XmlElement(name = "Asset")
    protected List<Asset> asset;
    @XmlElement(name = "ServiceState", required = true)
    protected ServiceState serviceState;

    /**
     * Gets the value of the asset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asset }
     * 
     * 
     */
    public List<Asset> getAsset() {
        if (asset == null) {
            asset = new ArrayList<Asset>();
        }
        return this.asset;
    }

    /**
     * Obtém o valor da propriedade serviceState.
     * 
     * @return
     *     possible object is
     *     {@link ServiceState }
     *     
     */
    public ServiceState getServiceState() {
        return serviceState;
    }

    /**
     * Define o valor da propriedade serviceState.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceState }
     *     
     */
    public void setServiceState(ServiceState value) {
        this.serviceState = value;
    }

}
