/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Shah's
 */
public class carfleet {
    public Boolean displayViewPanel;
    public Boolean displaySearchPanel;
    public Boolean updateBtn; // update button clicked
    private int carId;
    private String carName;
    private String carManufacturer;
    private String manuYear;
    private String totalSeat;
    private int serialNum;
    private String modelNum;
    private String uber; //boolean later part
    private String carAvailability; //boolean later part
    private String carCity;
    private String carManDate;

    public Boolean getDisplayViewPanel() {
        return displayViewPanel;
    }

    public void setDisplayViewPanel(Boolean displayViewPanel) {
        this.displayViewPanel = displayViewPanel;
    }

    public Boolean getDisplaySearchPanel() {
        return displaySearchPanel;
    }

    public void setDisplaySearchPanel(Boolean displaySearchPanel) {
        this.displaySearchPanel = displaySearchPanel;
    }

    public Boolean getUpdateBtn() {
        return updateBtn;
    }

    public void setUpdateBtn(Boolean updateBtn) {
        this.updateBtn = updateBtn;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getManuYear() {
        return manuYear;
    }

    public void setManuYear(String manuYear) {
        this.manuYear = manuYear;
    }

    public String getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(String totalSeat) {
        this.totalSeat = totalSeat;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getUber() {
        return uber;
    }

    public void setUber(String uber) {
        this.uber = uber;
    }

    public String getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getCarCity() {
        return carCity;
    }

    public void setCarCity(String carCity) {
        this.carCity = carCity;
    }

    public String getCarManDate() {
        return carManDate;
    }

    public void setCarManDate(String carManDate) {
        this.carManDate = carManDate;
    }
    @Override
        public String toString(){
        return carName;
    }
}