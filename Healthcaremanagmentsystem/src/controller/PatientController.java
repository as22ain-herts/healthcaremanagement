/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientController {

    private final List<Patient> patients;

    public PatientController() {
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void updatePatientContact(String patientId, String phone, String email) {
        for (Patient p : patients) {
            if (p.getPatientId().equals(patientId)) {
                p.setPhoneNumber(phone);
                p.setEmail(email);
                break;
            }
        }
    }

    public void removePatient(String patientId) {
        patients.removeIf(p -> p.getPatientId().equals(patientId));
    }

    public List<Patient> getAllPatients() {
        return patients;
    }
}
