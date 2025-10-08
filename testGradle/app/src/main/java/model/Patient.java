package model;

import java.time.LocalDate;

public class Patient {
    private int id;
    private String name;
    private String bloodType;
    private LocalDate dateOfBirth;
    private String hospitalName;
    private String contactNumber;

    public Patient(int id, String name, String bloodType, LocalDate dateOfBirth, String hospitalName, String contactNumber) {
        this.id = id;
        this.name = name;
        this.bloodType = bloodType;
        this.dateOfBirth = dateOfBirth;
        this.hospitalName = hospitalName;
        this.contactNumber = contactNumber;
    }

    public Patient(String name, String bloodType) {
        this.name = name;
        this.bloodType = bloodType;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBloodType() { return bloodType; }
    public void setBloodType(String bloodType) { this.bloodType = bloodType; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    @Override
    public String toString() {
        return name + " (" + bloodType + ") - " + hospitalName;
    }
}