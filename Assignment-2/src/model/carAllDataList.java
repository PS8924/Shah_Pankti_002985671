/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Shah's
 */
public class carAllDataList {
    
    private ArrayList<carfleet> alldata;
    private LocalDateTime lastUpdateTime;
    
    public carAllDataList(){
        this.alldata = new ArrayList<carfleet>();
    }

    public ArrayList<carfleet> getAlldata() {
        return alldata;
    }

    public void setAlldata(ArrayList<carfleet> alldata) {
        this.alldata = alldata;
    }
    
    public carfleet addNewCarData(){
        carfleet newCarfl = new carfleet();
        alldata.add(newCarfl);
        return newCarfl;
    }
    
    public void deleteCarData(carfleet cf){
        alldata.remove(cf);
    }
    
    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
