package com.sidimes.data.models;

public abstract class BaseModel {

    public String id;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

}
