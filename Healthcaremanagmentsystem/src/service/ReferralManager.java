/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Referral;
import java.util.ArrayList;
import java.util.List;

public class ReferralManager {

    private static ReferralManager instance;
    private final List<Referral> referrals;

    private ReferralManager() {
        referrals = new ArrayList<>();
    }

    public static synchronized ReferralManager getInstance() {
        if (instance == null) {
            instance = new ReferralManager();
        }
        return instance;
    }

    public void addReferral(Referral referral) {
        referrals.add(referral);
    }

    public List<Referral> getAllReferrals() {
        return referrals;
    }

    public String generateReferralText(Referral referral) {
        return "REFERRAL DOCUMENT\n"
                + "-----------------\n"
                + "Urgency Level: " + referral.getUrgencyLevel() + "\n"
                + "Reason: " + referral.getReferralReason() + "\n"
                + "Clinical Summary: " + referral.getClinicalSummary() + "\n"
                + "Status: " + referral.getStatus();
    }
}
