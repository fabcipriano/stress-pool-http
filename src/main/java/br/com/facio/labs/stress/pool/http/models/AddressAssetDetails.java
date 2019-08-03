package br.com.facio.labs.stress.pool.http.models;

import java.io.Serializable;
import java.util.ArrayList;

public class AddressAssetDetails implements Serializable {

    private String id;
    private String country;
    private StreetAssetDetails street;
    private CityAssetDetails city;
    private StateAssetDetails state;
    private ArrayList<ComplementAssetDetails> complement;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public StreetAssetDetails getStreet() {
        return street;
    }

    public void setStreet(StreetAssetDetails street) {
        this.street = street;
    }

    public CityAssetDetails getCity() {
        return city;
    }

    public void setCity(CityAssetDetails city) {
        this.city = city;
    }

    public StateAssetDetails getState() {
        return state;
    }

    public void setState(StateAssetDetails state) {
        this.state = state;
    }

    public ArrayList<ComplementAssetDetails> getComplementAssetDetails() {
        return complement;
    }

    public void setComplement(ArrayList<ComplementAssetDetails> complement) {
        this.complement = complement;
    }
}
