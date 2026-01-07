/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Clinician {

    private String clinicianId;
    private String firstName;
    private String lastName;
    private String title;
    private String specialty;
    private String gmcNumber;
    private String phoneNumber;
    private String email;
    private String workplaceId;
    private String workplaceType;
    private String employmentStatus;
    private String startDate;

    public Clinician() {}

    public Clinician(String clinicianId, String firstName, String lastName, String title,
                     String specialty, String gmcNumber, String phoneNumber, String email,
                     String workplaceId, String workplaceType, String employmentStatus,
                     String startDate) {
        this.clinicianId = clinicianId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.specialty = specialty;
        this.gmcNumber = gmcNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.workplaceId = workplaceId;
        this.workplaceType = workplaceType;
        this.employmentStatus = employmentStatus;
        this.startDate = startDate;
    }

    public String getClinicianId() { return clinicianId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSpecialty() { return specialty; }
    public String getEmail() { return email; }
}
