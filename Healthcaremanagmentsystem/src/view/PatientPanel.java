/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.PatientController;
import model.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PatientPanel extends JPanel {

    private final PatientController controller;
    private final DefaultTableModel tableModel;

    public PatientPanel() {
        controller = new PatientController();
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"ID", "First Name", "Last Name", "Phone", "Email"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addBtn = new JButton("Add Patient");
        addBtn.addActionListener(e -> addPatient());

        JPanel bottom = new JPanel();
        bottom.add(addBtn);
        add(bottom, BorderLayout.SOUTH);
    }

    private void addPatient() {
        String id = JOptionPane.showInputDialog("Patient ID:");
        String fn = JOptionPane.showInputDialog("First Name:");
        String ln = JOptionPane.showInputDialog("Last Name:");
        String phone = JOptionPane.showInputDialog("Phone:");
        String email = JOptionPane.showInputDialog("Email:");

        Patient p = new Patient(id, fn, ln, "", "", "", phone, email,
                "", "", "", "", "", "");

        controller.addPatient(p);
        tableModel.addRow(new Object[]{id, fn, ln, phone, email});
    }
}
