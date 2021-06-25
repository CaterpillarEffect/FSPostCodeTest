package org.example.Pojos;

public class Codes
{
    private String ccg_id;

    private String lau2;

    private String ced;

    private String nuts;

    private String parish;

    private String ccg;

    private String admin_ward;

    private String parliamentary_constituency;

    private String admin_county;

    private String admin_district;

    private String lsoa;

    private String msoa;

    public String getCcg_id ()
    {
        return ccg_id;
    }

    public void setCcg_id (String ccg_id)
    {
        this.ccg_id = ccg_id;
    }

    public String getLau2 ()
    {
        return lau2;
    }

    public void setLau2 (String lau2)
    {
        this.lau2 = lau2;
    }

    public String getCed ()
    {
        return ced;
    }

    public void setCed (String ced)
    {
        this.ced = ced;
    }

    public String getNuts ()
    {
        return nuts;
    }

    public void setNuts (String nuts)
    {
        this.nuts = nuts;
    }

    public String getParish ()
    {
        return parish;
    }

    public void setParish (String parish)
    {
        this.parish = parish;
    }

    public String getCcg ()
    {
        return ccg;
    }

    public void setCcg (String ccg)
    {
        this.ccg = ccg;
    }

    public String getAdmin_ward ()
    {
        return admin_ward;
    }

    public void setAdmin_ward (String admin_ward)
    {
        this.admin_ward = admin_ward;
    }

    public String getParliamentary_constituency ()
    {
        return parliamentary_constituency;
    }

    public void setParliamentary_constituency (String parliamentary_constituency)
    {
        this.parliamentary_constituency = parliamentary_constituency;
    }

    public String getAdmin_county ()
    {
        return admin_county;
    }

    public void setAdmin_county (String admin_county)
    {
        this.admin_county = admin_county;
    }

    public String getAdmin_district ()
    {
        return admin_district;
    }

    public void setAdmin_district (String admin_district)
    {
        this.admin_district = admin_district;
    }

    public String getLsoa ()
    {
        return lsoa;
    }

    public void setLsoa (String lsoa)
    {
        this.lsoa = lsoa;
    }

    public String getMsoa ()
    {
        return msoa;
    }

    public void setMsoa (String msoa)
    {
        this.msoa = msoa;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ccg_id = "+ccg_id+", lau2 = "+lau2+", ced = "+ced+", nuts = "+nuts+", parish = "+parish+", ccg = "+ccg+", admin_ward = "+admin_ward+", parliamentary_constituency = "+parliamentary_constituency+", admin_county = "+admin_county+", admin_district = "+admin_district+", lsoa = "+lsoa+", msoa = "+msoa+"]";
    }
}

