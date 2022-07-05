package com.dufuna.berlin.usmanYahaya.lekki.service;


import com.dufuna.berlin.usmanYahaya.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService{
    List<LekkiProperty> properties = new ArrayList<LekkiProperty>();

    @Override
    public void saveProperty(LekkiProperty lekki) {
        System.out.println("Property saved!" + properties.add(lekki));
    }
    @Override
    public LekkiProperty getProperty() {
        return (LekkiProperty) lekki;
    }

}
