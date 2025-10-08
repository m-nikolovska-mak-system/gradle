package repository;


import java.util.ArrayList;
import java.util.List;

import model.Donor;

public class DonorRepository {
    private final List<Donor> donors = new ArrayList<>();

    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    public List<Donor> getAllDonors() {
        return donors;
    }
}
