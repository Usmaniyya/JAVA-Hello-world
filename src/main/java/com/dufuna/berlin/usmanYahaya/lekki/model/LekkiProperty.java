package com.dufuna.berlin.usmanYahaya.lekki.model;

import java.util.Date;
import java.util.Objects;

public class LekkiProperty {

   public int property_id;
   public String property_address;
    public String property_type;
    public int number_of_bedrooms;
    public int number_of_sitting_rooms;
    public int number_of_kitchens;
    public int number_of_bathrooms;
    public int number_of_toilets;
    public String property_owner;
    public String description;
    public Date valid_from;
    public Date valid_to;

//getters


    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    public String getProperty_address() {
        return property_address;
    }

    public void setProperty_address(String property_address) {
        this.property_address = property_address;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public int getNumber_of_bedrooms() {
        return number_of_bedrooms;
    }

    public void setNumber_of_bedrooms(int number_of_bedrooms) {
        this.number_of_bedrooms = number_of_bedrooms;
    }

    public int getNumber_of_sitting_rooms() {
        return number_of_sitting_rooms;
    }

    public void setNumber_of_sitting_rooms(int number_of_sitting_rooms) {
        this.number_of_sitting_rooms = number_of_sitting_rooms;
    }

    public int getNumber_of_kitchens() {
        return number_of_kitchens;
    }

    public void setNumber_of_kitchens(int number_of_kitchens) {
        this.number_of_kitchens = number_of_kitchens;
    }

    public int getNumber_of_bathrooms() {
        return number_of_bathrooms;
    }

    public void setNumber_of_bathrooms(int number_of_bathrooms) {
        this.number_of_bathrooms = number_of_bathrooms;
    }

    public int getNumber_of_toilets() {
        return number_of_toilets;
    }

    public void setNumber_of_toilets(int number_of_toilets) {
        this.number_of_toilets = number_of_toilets;
    }

    public String getProperty_owner() {
        return property_owner;
    }

    public void setProperty_owner(String property_owner) {
        this.property_owner = property_owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValid_from() {
        return valid_from;
    }

    public void setValid_from(Date valid_from) {
        this.valid_from = valid_from;
    }

    public Date getValid_to() {
        return valid_to;
    }

    public void setValid_to(Date valid_to) {
        this.valid_to = valid_to;
    }

    @Override
    public String toString() {
        return "LekkiProperty{" +
                "property_id=" + property_id +
                ", property_address='" + property_address + '\'' +
                ", property_type='" + property_type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LekkiProperty)) return false;
        LekkiProperty that = (LekkiProperty) o;
        return getProperty_id() == that.getProperty_id();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProperty_id());
    }

}
