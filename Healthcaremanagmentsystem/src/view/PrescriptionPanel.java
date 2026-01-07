package view;

import controller.PrescriptionController;
import model.Prescription;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PrescriptionPanel extends JPanel {

    private final PrescriptionController controller;
    private final DefaultTableModel tableModel;

    public PrescriptionPanel() {
        controller = new PrescriptionController();
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"ID", "Patient", "Medication", "Dosage"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addBtn = new JButton("Create Prescription");
        addBtn.addActionListener(e -> createPrescription());

        JPanel bottom = new JPanel();
        bottom.add(addBtn);
        add(bottom, BorderLayout.SOUTH);
    }

    private void createPrescription() {
        String id = JOptionPane.showInputDialog("Prescription ID:");
        String patient = JOptionPane.showInputDialog("Patient ID:");
        String med = JOptionPane.showInputDialog("Medication:");
        String dose = JOptionPane.showInputDialog("Dosage:");

        Prescription p = new Prescription(id, patient, "", "",
                "", med, dose, "", 0,
                "", "", "", "Issued", "", "");

        controller.createPrescription(p);
        tableModel.addRow(new Object[]{id, patient, med, dose});
    }
}
