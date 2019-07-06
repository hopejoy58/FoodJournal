package edu.uc.bearcatid.Domain;

import android.location.Address;
import android.media.Rating;
import android.media.Image;

import java.util.List;

public interface IRestaurant {
    int getID();
    String getName();
    Address getAddress();
    Rating getRestaurantRating();
    String getDescription();
    String getCatagory();
    List<String> getNotes();
    List<Image> getPhotos();

    void setName(String name);
    void setAddress(Address address);
    void setRestaurantRating(Rating rating);
    void setDescription(String string);
    void setCatagory(String category);
    void addNotes(String notes);
    void addPhotos(Image photo);
}
