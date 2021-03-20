package com.google.joodapp.Models;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Report {

    private Boolean adolescent;
    private Boolean alcoolique;
    private Boolean sousDrogue;
    private Boolean blessures;
    private Boolean couple;
    private Boolean coupleAvecEnfant;
    private Boolean depressive;
    private Boolean deshydrate;
    private Boolean enfant;
    private List<Object> favoris;
    private String heure;
    private String jour;
    private String annee;
    private String minute;
    private String mois;
    private String seconde;
    private Boolean femmeAvecEnfant;
    private Boolean femmeEnceinte;
    private Boolean handicapMentale;
    private Boolean handicapPhysique;
    private Boolean needChaussures;
    private Boolean needCouverture;
    private Boolean needEau;
    private Boolean needLogement;
    private Boolean needMedicament;
    private Boolean needNourriture;
    private Boolean needSoinsMedicaux;
    private Boolean needVetement;
    private Boolean souriante;
    private Boolean triste;
    private Boolean anxieuse;
    private Boolean colerique;
    private String provider;
    private String ville;
    private String pid;
    private String displayNameUserPost;
    private String userId;
    private String postDescription;
    private double latitude;
    private double longitude;
    private MapLocation mapLocation;
    private List<String> needs;
    private List<String> ageOfHomeLess;
    private List<String> psychoState;
    private String publishedAt;
    private String photoProfile;
    private String adresse;


    public Report() {
    }

    public Report(Boolean adolescent, Boolean alcoolique, Boolean sousDrogue, Boolean blessures, Boolean couple, Boolean coupleAvecEnfant, Boolean depressive, Boolean deshydrate, Boolean enfant, List<Object> favoris, String heure, String jour, String annee, String minute, String mois, String seconde, Boolean femmeAvecEnfant, Boolean femmeEnceinte, Boolean handicapMentale, Boolean handicapPhysique, Boolean needChaussures, Boolean needCouverture, Boolean needEau, Boolean needLogement, Boolean needMedicament, Boolean needNourriture, Boolean needSoinsMedicaux, Boolean needVetement, Boolean souriante, Boolean triste, Boolean anxieuse, Boolean colerique, String provider, String ville, String pid, String displayNameUserPost, String userId, String postDescription, double latitude, double longitude, MapLocation mapLocation, List<String> needs, List<String> ageOfHomeLess, List<String> psychoState, String publishedAt, String photoProfile, String adresse) {
        this.adolescent = adolescent;
        this.alcoolique = alcoolique;
        this.sousDrogue = sousDrogue;
        this.blessures = blessures;
        this.couple = couple;
        this.coupleAvecEnfant = coupleAvecEnfant;
        this.depressive = depressive;
        this.deshydrate = deshydrate;
        this.enfant = enfant;
        this.favoris = favoris;
        this.heure = heure;
        this.jour = jour;
        this.annee = annee;
        this.minute = minute;
        this.mois = mois;
        this.seconde = seconde;
        this.femmeAvecEnfant = femmeAvecEnfant;
        this.femmeEnceinte = femmeEnceinte;
        this.handicapMentale = handicapMentale;
        this.handicapPhysique = handicapPhysique;
        this.needChaussures = needChaussures;
        this.needCouverture = needCouverture;
        this.needEau = needEau;
        this.needLogement = needLogement;
        this.needMedicament = needMedicament;
        this.needNourriture = needNourriture;
        this.needSoinsMedicaux = needSoinsMedicaux;
        this.needVetement = needVetement;
        this.souriante = souriante;
        this.triste = triste;
        this.anxieuse = anxieuse;
        this.colerique = colerique;
        this.provider = provider;
        this.ville = ville;
        this.pid = pid;
        this.displayNameUserPost = displayNameUserPost;
        this.userId = userId;
        this.postDescription = postDescription;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mapLocation = mapLocation;
        this.needs = needs;
        this.ageOfHomeLess = ageOfHomeLess;
        this.psychoState = psychoState;
        this.publishedAt = publishedAt;
        this.photoProfile = photoProfile;
        this.adresse = adresse;
    }


    public Boolean getFemmeAvecEnfant() {
        return femmeAvecEnfant;
    }

    public void setFemmeAvecEnfant(Boolean femmeAvecEnfant) {
        this.femmeAvecEnfant = femmeAvecEnfant;
    }

    public Boolean getFemmeEnceinte() {
        return femmeEnceinte;
    }

    public void setFemmeEnceinte(Boolean femmeEnceinte) {
        this.femmeEnceinte = femmeEnceinte;
    }

    public Boolean getHandicapMentale() {
        return handicapMentale;
    }

    public void setHandicapMentale(Boolean handicapMentale) {
        this.handicapMentale = handicapMentale;
    }

    public Boolean getHandicapPhysique() {
        return handicapPhysique;
    }

    public void setHandicapPhysique(Boolean handicapPhysique) {
        this.handicapPhysique = handicapPhysique;
    }

    public Boolean getNeedChaussures() {
        return needChaussures;
    }

    public void setNeedChaussures(Boolean needChaussures) {
        this.needChaussures = needChaussures;
    }

    public Boolean getNeedCouverture() {
        return needCouverture;
    }

    public void setNeedCouverture(Boolean needCouverture) {
        this.needCouverture = needCouverture;
    }

    public Boolean getNeedEau() {
        return needEau;
    }

    public void setNeedEau(Boolean needEau) {
        this.needEau = needEau;
    }

    public Boolean getNeedLogement() {
        return needLogement;
    }

    public void setNeedLogement(Boolean needLogement) {
        this.needLogement = needLogement;
    }

    public Boolean getNeedMedicament() {
        return needMedicament;
    }

    public void setNeedMedicament(Boolean needMedicament) {
        this.needMedicament = needMedicament;
    }

    public Boolean getNeedNourriture() {
        return needNourriture;
    }

    public void setNeedNourriture(Boolean needNourriture) {
        this.needNourriture = needNourriture;
    }

    public Boolean getNeedSoinsMedicaux() {
        return needSoinsMedicaux;
    }

    public void setNeedSoinsMedicaux(Boolean needSoinsMedicaux) {
        this.needSoinsMedicaux = needSoinsMedicaux;
    }

    public Boolean getNeedVetement() {
        return needVetement;
    }

    public void setNeedVetement(Boolean needVetement) {
        this.needVetement = needVetement;
    }

    public Boolean getSouriante() {
        return souriante;
    }

    public void setSouriante(Boolean souriante) {
        this.souriante = souriante;
    }

    public Boolean getTriste() {
        return triste;
    }

    public void setTriste(Boolean triste) {
        this.triste = triste;
    }

    public Boolean getAnxieuse() {
        return anxieuse;
    }

    public void setAnxieuse(Boolean anxieuse) {
        this.anxieuse = anxieuse;
    }

    public Boolean getColerique() {
        return colerique;
    }

    public void setColerique(Boolean colerique) {
        this.colerique = colerique;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Boolean getSousDrogue() {
        return sousDrogue;
    }

    public void setSousDrogue(Boolean sousDrogue) {
        this.sousDrogue = sousDrogue;
    }

    public Boolean getBlessures() {
        return blessures;
    }

    public void setBlessures(Boolean blessures) {
        this.blessures = blessures;
    }

    public Boolean getCouple() {
        return couple;
    }

    public void setCouple(Boolean couple) {
        this.couple = couple;
    }

    public Boolean getCoupleAvecEnfant() {
        return coupleAvecEnfant;
    }

    public void setCoupleAvecEnfant(Boolean coupleAvecEnfant) {
        this.coupleAvecEnfant = coupleAvecEnfant;
    }

    public Boolean getDepressive() {
        return depressive;
    }

    public void setDepressive(Boolean depressive) {
        this.depressive = depressive;
    }

    public Boolean getDeshydrate() {
        return deshydrate;
    }

    public void setDeshydrate(Boolean deshydrate) {
        this.deshydrate = deshydrate;
    }

    public Boolean getEnfant() {
        return enfant;
    }

    public void setEnfant(Boolean enfant) {
        this.enfant = enfant;
    }

    public List<Object> getFavoris() {
        return favoris;
    }

    public void setFavoris(List<Object> favoris) {
        this.favoris = favoris;
    }


    public Boolean getAdolescent() {
        return adolescent;
    }

    public void setAdolescent(Boolean adolescent) {
        this.adolescent = adolescent;
    }

    public Boolean getAlcoolique() {
        return alcoolique;
    }

    public void setAlcoolique(Boolean alcoolique) {
        this.alcoolique = alcoolique;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getSeconde() {
        return seconde;
    }

    public void setSeconde(String seconde) {
        this.seconde = seconde;
    }

    public MapLocation getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(MapLocation mapLocation) {
        this.mapLocation = mapLocation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDisplayNameUserPost() {
        return displayNameUserPost;
    }

    public void setDisplayNameUserPost(String displayNameUserPost) {
        this.displayNameUserPost = displayNameUserPost;
    }

    public List<String> getAgeOfHomeLess() {
        return ageOfHomeLess;
    }

    public void setAgeOfHomeLess(List<String> ageOfHomeLess) {
        this.ageOfHomeLess = ageOfHomeLess;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public List<String> getNeeds() {
        return needs;
    }

    public void setNeeds(List<String> needs) {
        this.needs = needs;
    }

    public List<String> getPsychoState() {
        return psychoState;
    }

    public void setPsychoState(List<String> psychoState) {
        this.psychoState = psychoState;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getPhotoProfile() {
        return photoProfile;
    }

    public void setPhotoProfile(String photoProfile) {
        this.photoProfile = photoProfile;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("adolescent", adolescent)
                .append("alcoolique", alcoolique)
                .append("sousDrogue", sousDrogue)
                .append("blessures", blessures)
                .append("couple", couple)
                .append("coupleAvecEnfant", coupleAvecEnfant)
                .append("depressive", depressive)
                .append("deshydrate", deshydrate)
                .append("enfant", enfant)
                .append("favoris", favoris)
                .append("heure", heure)
                .append("jour", jour)
                .append("annee", annee)
                .append("minute", minute)
                .append("mois", mois)
                .append("seconde", seconde)
                .append("femmeAvecEnfant", femmeAvecEnfant)
                .append("femmeEnceinte", femmeEnceinte)
                .append("handicapMentale", handicapMentale)
                .append("handicapPhysique", handicapPhysique)
                .append("needChaussures", needChaussures)
                .append("needCouverture", needCouverture)
                .append("needEau", needEau)
                .append("needLogement", needLogement)
                .append("needMedicament", needMedicament)
                .append("needNourriture", needNourriture)
                .append("needSoinsMedicaux", needSoinsMedicaux)
                .append("needVetement", needVetement)
                .append("souriante", souriante)
                .append("triste", triste)
                .append("anxieuse", anxieuse)
                .append("colerique", colerique)
                .append("provider", provider)
                .append("ville", ville)
                .append("pid", pid)
                .append("displayNameUserPost", displayNameUserPost)
                .append("userId", userId)
                .append("postDescription", postDescription)
                .append("latitude", latitude)
                .append("longitude", longitude)
                .append("mapLocation", mapLocation)
                .append("needs", needs)
                .append("ageOfHomeLess", ageOfHomeLess)
                .append("psychoState", psychoState)
                .append("publishedAt", publishedAt)
                .append("photoProfile", photoProfile)
                .append("adresse", adresse)
                .toString();
    }
}
