package org.example.Pojos;

public class getRegionCountryPostcodePcodepojo {


    public String getPostcode(pcodepojo pojo){
        if(pojo.getResult().getPostcode()!=null) {

            return pojo.getResult().getPostcode().toString();
        }else return "";

    }
    public String getRegion(pcodepojo pojo){
        if(pojo.getResult().getRegion()==null){
            return "";
        }
        return pojo.getResult().getRegion().toString();
    }
    public String getCountry(pcodepojo pojo){
        if(pojo.getResult().getCountry()==null){
            return "";
        }
        return pojo.getResult().getCountry().toString();
    }
}

