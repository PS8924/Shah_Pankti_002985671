/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Shah's
 */
public class PersonDirectory {
    
    ArrayList<Person> personDirectory;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonHistoryDirectory() {
        return personDirectory;
    }
    
    public void setPersonHistoryDirectory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }
    
    public Person newPerson(){
        Person person = new Person();
        //person.initializePerson();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public void uploadData() {
        Person person1 = new Person();
        person1.setPersonName("Ranjan");
        person1.setAge(38);
        person1.setHouse(2);
        person1.setCommunity("Huntington Avenue");
        person1.setCity("Boston");
        person1.setZipcode(21526);
        person1.setPatientID(1);
        personDirectory.add(person1);
        
        Person person2 = new Person();
        person2.setPersonName("Foram");
        person2.setAge(26);
        person2.setHouse(23);
        person2.setCommunity("Long wood");
        person2.setCity("Boston");
        person2.setZipcode(21578);
        person2.setPatientID(2);
        personDirectory.add(person2);
        
        Person person3 = new Person();
        person3.setPersonName("Nikita");
        person3.setAge(26);
        person3.setHouse(892);
        person3.setCommunity("City View");
        person3.setCity("Boston");
        person3.setZipcode(29078);
        person3.setPatientID(3);
        personDirectory.add(person3);
        
        Person person4 = new Person();
        person4.setPersonName("Pankti");
        person4.setAge(26);
        person4.setHouse(678);
        person4.setCommunity("Huntington Avenue");
        person4.setCity("Boston");
        person4.setZipcode(23456);
        person4.setPatientID(4);
        personDirectory.add(person4);
    }
}