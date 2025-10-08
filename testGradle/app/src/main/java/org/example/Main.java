package org.example;

import java.time.LocalDate;

import model.BloodBank;
import model.Donation;
import model.Donor;

public class Main {
    public static void main(String[] args) {
        Donor donor = new Donor(1, "Ana Petrova", "O+", LocalDate.of(1995, 5, 14), "071234567");
        Donation donation = new Donation(1, donor, LocalDate.now(), 0.45);
        BloodBank bank = new BloodBank("Red Cross Skopje", "Skopje");
        bank.addDonation(donation);

        System.out.println(bank);
        System.out.println(donation);
    }
}