/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.healthcare.hms.model;

public class Facility {

    private String facilityId;
    private String facilityName;
    private String facilityType;
    private String address;
    private String postcode;
    private String phoneNumber;
    private String email;
    private String openingHours;
    private String managerName;
    private int capacity;
    private String specialtiesOffered;

    public Facility() {}

    public Facility(String facilityId, String facilityName, String facilityType,
                    String address, String postcode, String phoneNumber,
                    String email, String openingHours, String managerName,
                    int capacity, String specialtiesOffered) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.facilityType = facilityType;
        this.address = address;
        this.postcode = postcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.openingHours = openingHours;
        this.managerName = managerName;
        this.capacity = capacity;
        this.specialtiesOffered = specialtiesOffered;
    }

    public String getFacilityId() { return facilityId; }
}
