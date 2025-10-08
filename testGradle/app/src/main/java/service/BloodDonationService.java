package service;

import model.Donor;
import repository.DonorRepository;

public class BloodDonationService {
    private final DonorRepository donorRepository;

    public BloodDonationService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public void registerDonor(String name, String bloodType) {
        Donor donor = new Donor(name, bloodType);
        donorRepository.addDonor(donor);
        System.out.println("✅ Donor registered: " + donor.getName());
    }

    public void listDonors() {
        System.out.println("🩸 Registered donors:");
        donorRepository.getAllDonors().forEach(d ->
                System.out.println(" - " + d.getName() + " (" + d.getBloodType() + ")"));
    }}

