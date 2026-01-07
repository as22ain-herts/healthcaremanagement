/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // fallback to default if something fails
        }

        setTitle("Healthcare Management System");
        setSize(1100, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        tabs.addTab("Patients", new PatientPanel());
        tabs.addTab("Clinicians", new ClinicianPanel());
        tabs.addTab("Appointments", new AppointmentPanel());
        tabs.addTab("Prescriptions", new PrescriptionPanel());
        tabs.addTab("Referrals", new ReferralPanel());

        add(tabs, BorderLayout.CENTER);
    }
}
