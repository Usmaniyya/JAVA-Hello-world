package com.dufuna.berlin.usmanYahaya.lekki;

import com.dufuna.berlin.usmanYahaya.lekki.model.LekkiProperty;
import com.dufuna.berlin.usmanYahaya.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import com.dufuna.berlin.usmanYahaya.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.usmanYahaya.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {


    public static void main(String args[]) {

        LekkiPropertyService mock = new MockLekkiPropertyService();

        LekkiProperty lekki = new LekkiProperty();

        lekki.property_id = 1;
        lekki.property_address = "Lekki, Lagos";
        lekki.property_type = "House";

        mock.saveProperty(lekki);

        mock.getProperty();

        };
    }
