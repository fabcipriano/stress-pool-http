
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
 *         &lt;element name="Asset" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS}Asset">
 *                 &lt;sequence>
 *                   &lt;element name="AssetDetails" type="{http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS}AssetDetails"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlRootElement(name = "QueryAssetDetailsResponseMessage")
public class QueryAssetDetailsResponseMessage {

    @XmlElement(name = "Asset")
    protected QueryAssetDetailsResponseMessage.Asset asset;
    @XmlElement(name = "ServiceState", required = true)
    protected ServiceState serviceState;

    /**
     * Obtém o valor da propriedade asset.
     * 
     * @return
     *     possible object is
     *     {@link QueryAssetDetailsResponseMessage.Asset }
     *     
     */
    public QueryAssetDetailsResponseMessage.Asset getAsset() {
        return asset;
    }

    /**
     * Define o valor da propriedade asset.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryAssetDetailsResponseMessage.Asset }
     *     
     */
    public void setAsset(QueryAssetDetailsResponseMessage.Asset value) {
        this.asset = value;
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


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS}Asset">
     *       &lt;sequence>
     *         &lt;element name="AssetDetails" type="{http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS}AssetDetails"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "assetDetails"
    })
    public static class Asset
        extends br.com.facio.labs.stress.pool.http.models.Asset
    {

        @XmlElement(name = "AssetDetails", required = true)
        protected AssetDetails assetDetails;

        /**
         * Obtém o valor da propriedade assetDetails.
         * 
         * @return
         *     possible object is
         *     {@link AssetDetails }
         *     
         */
        public AssetDetails getAssetDetails() {
            return assetDetails;
        }

        /**
         * Define o valor da propriedade assetDetails.
         * 
         * @param value
         *     allowed object is
         *     {@link AssetDetails }
         *     
         */
        public void setAssetDetails(AssetDetails value) {
            this.assetDetails = value;
        }

    }

}
