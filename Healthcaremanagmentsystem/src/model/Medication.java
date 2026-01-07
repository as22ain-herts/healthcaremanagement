/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.healthcare.hms.model;

public class Medication {

    private String drugId;
    private String name;
    private String dosage;

    public Medication(String drugId, String name, String dosage) {
        this.drugId = drugId;
        this.name = name;
        this.dosage = dosage;
    }

    public String getName() { return name; }
}
