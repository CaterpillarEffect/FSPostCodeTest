package org.example.oldcode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.example.Pojos.Result;

import java.util.ArrayList;
import java.util.List;

public class PostcodePojo {
    @SerializedName("status")
    @Expose

    String status;
    @SerializedName("result")
    @Expose
    List<Object> result;


    PostcodePojo(){}

    PostcodePojo( String status, ArrayList result){
        super();
        this.status =status;
        this.result=result;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getResult() {
        return result;
    }

    public void setResult(ArrayList<Object> result) {
        this.result = result;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", Result.class).append("status", status).toString();
    }
}

