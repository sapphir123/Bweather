package com.example.administrator.weather.db;

import org.litepal.crud.DataSupport;

public class Coundy extends DataSupport{
    private int id;
    private String coundyName;
    private int coundyCode;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCoundyName() {
        return coundyName;
    }
    public void setCoundyName(String coundyName){
        this.coundyName = coundyName;
    }
    public String getWeatherId() {
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
