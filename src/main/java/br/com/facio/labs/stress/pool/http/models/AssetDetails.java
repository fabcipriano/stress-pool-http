package br.com.facio.labs.stress.pool.http.models;

import java.util.ArrayList;

public class AssetDetails {

    private String productName;
    private String productId;
    private String lineOfBusiness;
    private String paymentMode;
    private String assetId;
    private String assetNumber;
    private String contractNumber;
    private String accountId;
    private String serviceId;
    private String status;
    private String crmSystem;
    private String rootId;
    private String integrationId;
    private String billingAccountNumber;
    private String billingAccountEmail;
    private String billingDueDay;
    private String billingCompany;
    private String billingSystem;
    private String activationDate;
    private String disconnectDate;
    private String directDebit;
    private String linkedDocument;
    private String shippingDate;
    private String keyNumber;
    private String speed;
    private String antiDDoS;
    private String amountContracted;
    private String partiallyBlocked;

    private AddressAssetDetails address;
    private ArrayList<RelatedProductAssetDetails> relatedProduct;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCrmSystem() {
        return crmSystem;
    }

    public void setCrmSystem(String crmSystem) {
        this.crmSystem = crmSystem;
    }

    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    public void setBillingAccountNumber(String billingAccountNumber) {
        this.billingAccountNumber = billingAccountNumber;
    }

    public String getBillingAccountEmail() { return billingAccountEmail; }

    public void setBillingAccountEmail(String billingAccountEmail) { this.billingAccountEmail = billingAccountEmail; }

    public String getBillingDueDay() {
        return billingDueDay;
    }

    public void setBillingDueDay(String billingDueDay) {
        this.billingDueDay = billingDueDay;
    }

    public String getBillingCompany() {
        return billingCompany;
    }

    public void setBillingCompany(String billingCompany) {
        this.billingCompany = billingCompany;
    }

    public String getBillingSystem() {
        return billingSystem;
    }

    public void setBillingSystem(String billingSystem) {
        this.billingSystem = billingSystem;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getDisconnectDate() {
        return disconnectDate;
    }

    public void setDisconnectDate(String disconnectDate) {
        this.disconnectDate = disconnectDate;
    }

    public String getDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(String directDebit) {
        this.directDebit = directDebit;
    }

    public String getLinkedDocument() {
        return linkedDocument;
    }

    public void setLinkedDocument(String linkedDocument) {
        this.linkedDocument = linkedDocument;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getAntiDDoS() {
        return antiDDoS;
    }

    public void setAntiDDoS(String antiDDoS) {
        this.antiDDoS = antiDDoS;
    }

    public String getAmountContracted() {
        return amountContracted;
    }

    public void setAmountContracted(String amountContracted) {
        this.amountContracted = amountContracted;
    }

    public String getPartiallyBlocked() {
        return partiallyBlocked;
    }

    public void setPartiallyBlocked(String partiallyBlocked) {
        this.partiallyBlocked = partiallyBlocked;
    }

    public AddressAssetDetails getAddress() {
        return address;
    }

    public void setAddress(AddressAssetDetails address) {
        this.address = address;
    }

    public ArrayList<RelatedProductAssetDetails> getRelatedProduct() {
        return relatedProduct;
    }

    public void setRelatedProduct(ArrayList<RelatedProductAssetDetails> relatedProduct) {
        this.relatedProduct = relatedProduct;
    }

}
