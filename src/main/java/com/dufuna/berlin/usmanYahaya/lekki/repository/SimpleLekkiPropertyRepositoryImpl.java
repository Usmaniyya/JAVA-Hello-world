package com.dufuna.berlin.usmanYahaya.lekki.repository;

import com.dufuna.berlin.usmanYahaya.lekki.model.LekkiProperty;
import com.dufuna.berlin.usmanYahaya.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.usmanYahaya.lekki.service.MockLekkiPropertyService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository{

    LekkiPropertyService mock = new MockLekkiPropertyService();

    LekkiProperty property = new LekkiProperty();
    Map<Integer, LekkiProperty> properties = new HashMap<>();
    List<LekkiProperty> lists = new ArrayList<>();


     @Override
    public LekkiProperty save(LekkiProperty property)
    {
        mock.saveProperty(property);

        return mock.getProperty();
    }

    @Override
    public LekkiProperty findById(int propertyId) {
        return properties.get(propertyId);
    }

    @Override
    public List<LekkiProperty> findAll() {

        return (List<LekkiProperty>) lists.listIterator();
    }

    @Override
    public void update(int propertyId, LekkiProperty property) {
       System.out.println("Updated sucessfully" + properties.replace(propertyId, property));
    }
}
