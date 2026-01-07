/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.AppointmentController;
import model.Appointment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AppointmentPanel extends JPanel {

    private final AppointmentController controller;
    private final DefaultTableModel tableModel;

    public AppointmentPanel() {
        controller = new AppointmentController();
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"ID", "Patient", "Clinician", "Date", "Status"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton createBtn = new JButton("Create");
        JButton cancelBtn = new JButton("Cancel");

        createBtn.addActionListener(e -> createAppointment());
        cancelBtn.addActionListener(e -> cancelAppointment(table));

        JPanel bottom = new JPanel();
        bottom.add(createBtn);
        bottom.add(cancelBtn);
        add(bottom, BorderLayout.SOUTH);
    }

    private void createAppointment() {
        String id = JOptionPane.showInputDialog("Appointment ID:");
        String patient = JOptionPane.showInputDialog("Patient ID:");
        String clinician = JOptionPane.showInputDialog("Clinician ID:");
        String date = JOptionPane.showInputDialog("Date:");

        Appointment a = new Appointment(id, patient, clinician, "",
                date, "", 30, "Consultation",
                "Scheduled", "", "", "", "");

        controller.createAppointment(a);
        tableModel.addRow(new Object[]{id, patient, clinician, date, "Scheduled"});
    }

    private void cancelAppointment(JTable table) {
        int row = table.getSelectedRow();
        if (row >= 0) {
            String id = tableModel.getValueAt(row, 0).toString();
            controller.cancelAppointment(id);
            tableModel.setValueAt("Cancelled", row, 4);
        }
    }
}
