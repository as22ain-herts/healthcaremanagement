/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;

public class DrugInteractionService {

    public List<String> checkInteractions(List<String> medications) {
        List<String> warnings = new ArrayList<>();

        if (medications.contains("Ibuprofen") && medications.contains("Aspirin")) {
            warnings.add("Warning: Ibuprofen and Aspirin may increase bleeding risk.");
        }

        if (medications.contains("Simvastatin") && medications.contains("Amiodarone")) {
            warnings.add("Warning: Simvastatin interaction detected.");
        }

        return warnings;
    }
}
