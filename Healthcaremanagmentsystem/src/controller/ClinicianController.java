/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Clinician;
import java.util.ArrayList;
import java.util.List;

public class ClinicianController {

    private final List<Clinician> clinicians;

    public ClinicianController() {
        clinicians = new ArrayList<>();
    }

    // CREATE
    public void addClinician(Clinician clinician) {
        clinicians.add(clinician);
    }

    // READ
    public List<Clinician> getAllClinicians() {
        return clinicians;
    }

    public Clinician getClinicianById(String clinicianId) {
        for (Clinician c : clinicians) {
            if (c.getClinicianId().equals(clinicianId)) {
                return c;
            }
        }
        return null;
    }

    // DELETE
    public void removeClinician(String clinicianId) {
        clinicians.removeIf(c -> c.getClinicianId().equals(clinicianId));
    }
}
