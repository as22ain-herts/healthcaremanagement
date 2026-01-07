/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {

    private String patientId;
    private List<String> recordEntries;

    public MedicalRecord(String patientId) {
        this.patientId = patientId;
        this.recordEntries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        recordEntries.add(entry);
    }

    public List<String> getRecordEntries() {
        return recordEntries;
    }
}

