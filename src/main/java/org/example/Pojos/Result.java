package org.example.Pojos;

public class Result {
    private String country;

    private Codes codes;

    private String ced;

    private String ccg;

   // private String latitude;

    private String postcode;

   // private String european_electoral_region;

    private String parliamentary_constituency;

    private String admin_ward;

    private String eastings;

    private String admin_county;

    private String lsoa;

    private String msoa;

    private String admin_district;

    private String quality;

    private String primary_care_trust;

    private String nuts;

    private String parish;

    private String outcode;

    private String northings;

    private String nhs_ha;

    private String incode;

    private String region;

    private String longitude;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Codes getCodes() {
        return codes;
    }

    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getCcg() {
        return ccg;
    }

    public void setCcg(String ccg) {
        this.ccg = ccg;
    }

   // public String getLatitude() {
    //    return latitude;
   // }

   /// public void setLatitude(String latitude) {
   //     this.latitude = latitude;
  //  }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

   // public String getEuropean_electoral_region() {
  //      return european_electoral_region;
  //  }

  //  public void setEuropean_electoral_region(String european_electoral_region) {
  //      this.european_electoral_region = european_electoral_region;
  //  }

    public String getParliamentary_constituency() {
        return parliamentary_constituency;
    }

    public void setParliamentary_constituency(String parliamentary_constituency) {
        this.parliamentary_constituency = parliamentary_constituency;
    }

    public String getAdmin_ward() {
        return admin_ward;
    }

    public void setAdmin_ward(String admin_ward) {
        this.admin_ward = admin_ward;
    }

    public String getEastings() {
        return eastings;
    }

    public void setEastings(String eastings) {
        this.eastings = eastings;
    }

    public String getAdmin_county() {
        return admin_county;
    }

    public void setAdmin_county(String admin_county) {
        this.admin_county = admin_county;
    }

    public String getLsoa() {
        return lsoa;
    }

    public void setLsoa(String lsoa) {
        this.lsoa = lsoa;
    }

    public String getMsoa() {
        return msoa;
    }

    public void setMsoa(String msoa) {
        this.msoa = msoa;
    }

    public String getAdmin_district() {
        return admin_district;
    }

    public void setAdmin_district(String admin_district) {
        this.admin_district = admin_district;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getPrimary_care_trust() {
        return primary_care_trust;
    }

    public void setPrimary_care_trust(String primary_care_trust) {
        this.primary_care_trust = primary_care_trust;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public String getOutcode() {
        return outcode;
    }

    public void setOutcode(String outcode) {
        this.outcode = outcode;
    }

    public String getNorthings() {
        return northings;
    }

    public void setNorthings(String northings) {
        this.northings = northings;
    }

    public String getNhs_ha() {
        return nhs_ha;
    }

    public void setNhs_ha(String nhs_ha) {
        this.nhs_ha = nhs_ha;
    }

    public String getIncode() {
        return incode;
    }

    public void setIncode(String incode) {
        this.incode = incode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Postcode = " + postcode  +"\n"+
                "Region = "+region +"\n"+
                "Country = " + country +"\n";
    }
}