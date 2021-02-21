package com.google.joodapp.Models;

public class User {

    private String name;
    private String email;
    private String imageurl;
    private String provider;
    private String uid;
    private String datecreation;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setImageurl(String imageurl){
        this.imageurl = imageurl;
    }

    public String getImageurl(){
        return imageurl;
    }

    public void setProvider(String provider){
        this.provider = provider;
    }

    public String getProvider(){
        return provider;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setDatecreation(String datecreation) {
        this.datecreation = datecreation;
    }

    public String getDatecreation() {
        return datecreation;
    }
}
