package com.tesseract.decision_tree_analysis;

/**
 * Created by BlackFlag on 9/9/2016.
 */
public class Iris {
    private Double sepallength;
    private Double petallength;
    private Double petalwidth;
    private Double sepalwidth;

    public String getIrisResult(){


        if(petalwidth<=0.6)
        {
            return  AppUtil.IRIS_SETOSA;
        }
        else{
            if(petalwidth>1.7) return  AppUtil.IRIS_VIRGINICA;
            else {
                if(petallength<=4.9) return AppUtil.IRIS_VERSICOLOR;
                else
                {
                    if(petalwidth<=1.5) return AppUtil.IRIS_VIRGINICA;
                    else return  AppUtil.IRIS_VERSICOLOR;
                }
            }
        }


    }

    public Double getSepallength() {
        return sepallength;
    }

    public void setSepallength(Double sepallength) {
        this.sepallength = sepallength;
    }

    public Double getPetallength() {
        return petallength;
    }

    public void setPetallength(Double petallength) {
        this.petallength = petallength;
    }

    public Double getPetalwidth() {
        return petalwidth;
    }

    public void setPetalwidth(Double petalwidth) {
        this.petalwidth = petalwidth;
    }

    public Double getSepalwidth() {
        return sepalwidth;
    }

    public void setSepalwidth(Double sepalwidth) {
        this.sepalwidth = sepalwidth;
    }

    public Iris(Double sepallength, Double petallength, Double petalwidth, Double sepalwidth) {

        this.sepallength = sepallength;
        this.petallength = petallength;
        this.petalwidth = petalwidth;
        this.sepalwidth = sepalwidth;
    }

    public Iris() {

    }


}
