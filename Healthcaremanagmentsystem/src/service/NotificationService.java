/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

public class NotificationService {

    public String generateNotification(String recipient, String message) {
        return "TO: " + recipient + "\n\n"
             + message + "\n\n"
             + "This is an automated notification.";
    }
}
