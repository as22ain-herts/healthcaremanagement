/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Referral;
import service.ReferralManager;

import java.util.List;

public class ReferralController {

    private final ReferralManager referralManager;

    public ReferralController() {
        referralManager = ReferralManager.getInstance();
    }

    // CREATE (Singleton usage)
    public void createReferral(Referral referral) {
        referralManager.addReferral(referral);
    }

    // READ
    public List<Referral> getAllReferrals() {
        return referralManager.getAllReferrals();
    }

    // GENERATE REFERRAL CONTENT (mock email/EHR)
    public String generateReferralText(Referral referral) {
        return referralManager.generateReferralText(referral);
    }
}
