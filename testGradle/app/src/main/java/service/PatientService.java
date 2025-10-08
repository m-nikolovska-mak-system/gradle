package service;


import model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
 private List<Patient> patients = new ArrayList<>();

 public void registerPatient(Patient patient) {
     patients.add(patient);
     System.out.println("Patient registered: " + patient);
 }

 public List<Patient> getAllPatients() {
     return patients;
 }

 public Patient findByName(String name) {
     return patients.stream()
             .filter(p -> p.getName().equalsIgnoreCase(name))
             .findFirst()
             .orElse(null);
 }
}