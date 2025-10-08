package org.example;

import java.time.LocalDate;

import model.BloodBank;
import model.Donation;
import model.Donor;
import repository.DonorRepository;
import service.BloodDonationService;

public class Main {
    public static void main(String[] args) {
    	  DonorRepository repo = new DonorRepository();
          BloodDonationService service = new BloodDonationService(repo);

          service.registerDonor("Elena Petrova", "A+");
          service.registerDonor("Milan Jovanov", "O-");
          service.listDonors();
    }
}