package view;

import controller.ReferralController;
import model.Referral;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ReferralPanel extends JPanel {

    private final ReferralController controller;
    private final DefaultTableModel tableModel;

    public ReferralPanel() {
        controller = new ReferralController();
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"Urgency", "Reason", "Status"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addBtn = new JButton("Create Referral");
        addBtn.addActionListener(e -> createReferral());

        JPanel bottom = new JPanel();
        bottom.add(addBtn);
        add(bottom, BorderLayout.SOUTH);
    }

    private void createReferral() {
        String urgency = JOptionPane.showInputDialog("Urgency Level:");
        String reason = JOptionPane.showInputDialog("Referral Reason:");

        Referral r = new Referral("", "", "", "",
                urgency, reason, "",
                "", "New", "", "", "", "");

        controller.createReferral(r);
        tableModel.addRow(new Object[]{urgency, reason, "New"});
    }
}
