package com.example.timewithkid;

import java.util.ArrayList;

public class Activity {
    int logoImgSrc;
    int descriptionImgView;
    String taskName;
    String materials;
    String description;
    String explanation;

    public Activity(int logoImgSrc, int descriptionImgView, String taskName, String materials, String description, String explanation) {
        this.logoImgSrc = logoImgSrc;
        this.descriptionImgView = descriptionImgView;
        this.taskName = taskName;
        this.materials = materials;
        this.description = description;
        this.explanation = explanation;
    }

    public int getLogoImgSrc() {
        return logoImgSrc;
    }

    public void setLogoImgSrc(int logoImgSrc) {
        this.logoImgSrc = logoImgSrc;
    }

    public int getDescriptionImgView() {
        return descriptionImgView;
    }

    public void setDescriptionImgView(int descriptionImgView) {
        this.descriptionImgView = descriptionImgView;
    }
    public String getTaskName() {
        return taskName;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
