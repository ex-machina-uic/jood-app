package com.google.testadroid.Models;

import com.google.android.gms.maps.model.LatLng;

public class NamedLocation {

    public final String name;
    public final String date;
    public final LatLng location;
    public final String pid;
    public final String profileImgUri;
    public final String adresse;

    public NamedLocation(String name, LatLng location, String date, String pid, String profileImgUri, String adresse) {

        this.name = name;
        this.location = location;
        this.date = date;
        this.pid = pid;
        this.profileImgUri = profileImgUri;
        this.adresse = adresse;
    }
}
