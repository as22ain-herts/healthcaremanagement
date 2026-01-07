/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ClinicianController;
import model.Clinician;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ClinicianPanel extends JPanel {

    private final ClinicianController controller;
    private final DefaultTableModel tableModel;

    public ClinicianPanel() {
        controller = new ClinicianController();
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"ID", "Name", "Specialty", "Email"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addBtn = new JButton("Add Clinician");
        addBtn.addActionListener(e -> addClinician());

        JPanel bottom = new JPanel();
        bottom.add(addBtn);
        add(bottom, BorderLayout.SOUTH);
    }

    private void addClinician() {
        String id = JOptionPane.showInputDialog("Clinician ID:");
        String fn = JOptionPane.showInputDialog("First Name:");
        String ln = JOptionPane.showInputDialog("Last Name:");
        String spec = JOptionPane.showInputDialog("Specialty:");
        String email = JOptionPane.showInputDialog("Email:");

        Clinician c = new Clinician(id, fn, ln, "", spec,
                "", "", email, "", "", "", "");

        controller.addClinician(c);
        tableModel.addRow(new Object[]{id, fn + " " + ln, spec, email});
    }
}
