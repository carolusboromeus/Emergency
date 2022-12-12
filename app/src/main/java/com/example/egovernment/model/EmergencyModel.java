package com.example.egovernment.model;

public class EmergencyModel {
    private int imageEmergency;
    private String titleEmergency, subEmergency;

    public int getImageEmergency(){
        return imageEmergency;
    }

    public void setImageEmergency(int imageEmergency) {
        this.imageEmergency = imageEmergency;
    }

    public String getTitleEmergency(){
        return titleEmergency;
    }

    public void setTitleEmergency(String titleEmergency) {
        this.titleEmergency = titleEmergency;
    }

    public String getSubEmergency(){
        return subEmergency;
    }

    public void setSubEmergency(String subEmergency) {
        this.subEmergency = subEmergency;
    }
}
