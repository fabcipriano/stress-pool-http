package br.com.facio.labs.stress.pool.http.models;

import java.io.Serializable;

public class ComplementAssetDetails implements Serializable {

    private String type;
    private String value;
    private String level;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
