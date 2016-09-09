package com.tesseract.decision_tree_analysis;

/**
 * Created by BlackFlag on 9/8/2016.
 */
public class Weather {
    private String Outlook;
    private Double Humidity;
    private Boolean Windy;


    public Weather() {
    }
    public Boolean getPlayStatus(){
        if(getOutlook()==AppUtil.SUNNY)
        {

            if(getHumidity()>75)
            {

                return true;
            }
            else{
                return  false;
            }

        }
        else if(getOutlook()==AppUtil.RAINY)
        {

            if(getWindy()==Boolean.TRUE)
            {

                return  false;
            }
            else return true;
        }

        else
        {
            return  true;
        }




    }

    public Weather(String outlook, Double humidity, Boolean windy) {
        Outlook = outlook;
        Humidity = humidity;
        Windy = windy;

    }

    public String getOutlook() {
        return Outlook;
    }

    public void setOutlook(String outlook) {
        Outlook = outlook;
    }

    public Double getHumidity() {
        return Humidity;
    }

    public void setHumidity(Double humidity) {
        Humidity = humidity;
    }

    public Boolean getWindy() {
        return Windy;
    }

    public void setWindy(Boolean windy) {
        Windy = windy;
    }
}
