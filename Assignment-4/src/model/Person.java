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
public class Person {
    
    String PersonName;
    String City;
    String Community;
    Integer House;
    Integer age;
    Integer zipcode;
    Integer patientID;
    private Patient patient;
    private static int count = 0;
    private int modelNumber;
    private VitalSignHistory vitalSignHistory;
    
    public Person(){
        count++;
        modelNumber = count;
        this.vitalSignHistory = new VitalSignHistory();
    }
    
    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }
    
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public Integer getHouse() {
        return House;
    }

    public void setHouse(Integer House) {
        this.House = House;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.modelNumber);
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }
}