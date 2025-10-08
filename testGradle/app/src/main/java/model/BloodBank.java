package model;

import java.util.ArrayList;
import java.util.List;

public class BloodBank {
    private String name;
    private String location;
    private List<Donation> donations;

    public BloodBank(String name, String location) {
        this.name = name;
        this.location = location;
        this.donations = new ArrayList<>();
    }

    public void addDonation(Donation donation) {
        donations.add(donation);
    }

    public List<Donation> getDonations() {
        return donations;
    }

    @Override
    public String toString() {
        return "BloodBank{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", donations=" + donations.size() +
                '}';
    }
}
