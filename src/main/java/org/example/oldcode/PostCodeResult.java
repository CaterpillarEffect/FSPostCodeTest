package org.example.oldcode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PostCodeResult  {
    @SerializedName("postcode")
    @Expose

    private String Postcode;
    @SerializedName("country")
    @Expose
    private String Country;
    @SerializedName("region")
    @Expose
    private String Region;

    PostCodeResult() {
    }

    PostCodeResult(String postcode, String country, String region) {
        super();
        this.Postcode = postcode;
        this.Country = country;
        this.Region = region;
    }

    public String getPostcode() {
        return Postcode;
    }

    public String getCountry() {
        return Country;
    }

    public String getRegion() {
        return Region;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setRegion(String region) {
        Region = region;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Postcode", Postcode).append("id", Region).append("status", Country).toString();
    }
}