package br.com.facio.labs.stress.pool.http.models;

import java.io.Serializable;

public class CityAssetDetails implements Serializable {

    private String id;
    private String code;
    private String name;
    private String areaCode;
    private String ibge;
    private LocalityAssetDetails locality;

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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public LocalityAssetDetails getLocality() {
        return locality;
    }

    public void setLocality(LocalityAssetDetails locality) {
        this.locality = locality;
    }
}
