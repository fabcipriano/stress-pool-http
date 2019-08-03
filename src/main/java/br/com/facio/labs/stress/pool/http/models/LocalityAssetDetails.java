package br.com.facio.labs.stress.pool.http.models;

import java.io.Serializable;

public class LocalityAssetDetails implements Serializable {

    private String cnlCode;
    private String code;
    private String name;
    private String internalCode;
    private String externalCode;

    public String getCnlCode() {
        return cnlCode;
    }

    public void setCnlCode(String cnlCode) {
        this.cnlCode = cnlCode;
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

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }
}
