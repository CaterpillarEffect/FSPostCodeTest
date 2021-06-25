package org.example.Pojos;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NearestPostcodes {


//    @SerializedName("status")
//    @Expose
//    private Integer status;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;

//    public Integer getStatus() {
//
//        Integer status = this.status;
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NearestPostcodes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
      //  sb.append("status");
       // sb.append('=');
       // sb.append(((this.status == null) ? "<null>" : this.status));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null) ? "<null>" : this.result));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}



