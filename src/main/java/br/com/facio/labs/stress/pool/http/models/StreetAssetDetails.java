package br.com.facio.labs.stress.pool.http.models;

import java.io.Serializable;

public class StreetAssetDetails implements Serializable {

    private String id;
    private String code;
    private String name;
    private String type;
    private String title;

    private String typeCode;
    private String titleCode;
    private String addressNumber;
    private String postCode;
    private NeighbourhoodAssetDetails neighbourhood;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public NeighbourhoodAssetDetails getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(NeighbourhoodAssetDetails neighbourhood) {
        this.neighbourhood = neighbourhood;
    }
}
