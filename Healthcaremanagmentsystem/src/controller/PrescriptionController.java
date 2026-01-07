/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Prescription;
import service.DrugInteractionService;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionController {

    private final List<Prescription> prescriptions;
    private final DrugInteractionService drugInteractionService;

    public PrescriptionController() {
        prescriptions = new ArrayList<>();
        drugInteractionService = new DrugInteractionService();
    }

    // CREATE
    public void createPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    // READ
    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    // BUSINESS LOGIC
    public List<String> checkDrugInteractions(List<String> medications) {
        return drugInteractionService.checkInteractions(medications);
    }

    // UPDATE
    public void markAsCollected(String prescriptionId) {
        for (Prescription p : prescriptions) {
            if (p.getPrescriptionId().equals(prescriptionId)) {
                p.setStatus("Collected");
                break;
            }
        }
    }
}
