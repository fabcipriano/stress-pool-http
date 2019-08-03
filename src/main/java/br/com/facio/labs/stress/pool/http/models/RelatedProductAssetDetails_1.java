package br.com.facio.labs.stress.pool.http.models;

import java.io.Serializable;

public class RelatedProductAssetDetails_1 implements Serializable {

    private String status;
    private String value;
    private String name;
    private String id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
