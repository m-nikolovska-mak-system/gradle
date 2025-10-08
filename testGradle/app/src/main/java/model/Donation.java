package model;

import java.time.LocalDate;

public class Donation {
    private int id;
    private Donor donor;
    private LocalDate donationDate;
    private double quantityInLiters;

    public Donation(int id, Donor donor, LocalDate donationDate, double quantityInLiters) {
        this.id = id;
        this.donor = donor;
        this.donationDate = donationDate;
        this.quantityInLiters = quantityInLiters;
    }

    public int getId() { return id; }
    public Donor getDonor() { return donor; }
    public LocalDate getDonationDate() { return donationDate; }
    public double getQuantityInLiters() { return quantityInLiters; }

    @Override
    public String toString() {
        return "Donation{" +
                "donor=" + donor.getName() +
                ", date=" + donationDate +
                ", quantity=" + quantityInLiters + "L" +
                '}';
    }
}
