/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentController {

    private final List<Appointment> appointments;

    public AppointmentController() {
        appointments = new ArrayList<>();
    }

    // CREATE
    public void createAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // READ
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    public Appointment getAppointmentById(String appointmentId) {
        for (Appointment a : appointments) {
            if (a.getAppointmentId().equals(appointmentId)) {
                return a;
            }
        }
        return null;
    }

    // UPDATE
    public void cancelAppointment(String appointmentId) {
        Appointment a = getAppointmentById(appointmentId);
        if (a != null) {
            a.setStatus("Cancelled");
        }
    }

    public void rescheduleAppointment(String appointmentId, String newDate, String newTime) {
        Appointment a = getAppointmentById(appointmentId);
        if (a != null) {
            a.setAppointmentDate(newDate);
            a.setAppointmentTime(newTime);
            a.setStatus("Rescheduled");
        }
    }
}
