package edu.uc.bearcatid.Domain;

import android.media.Image;
import android.media.Rating;

import java.util.Date;

public interface IDish {
    int getID();
    String getName();
    Date getDate();
    String getDescription();
    Image getPicture();
    Rating getRating();
    double getPrice();
    IRestaurant getRestraunt();

    void setName(String name);
    void setDate(Date date);
    void setDescription(String description);
    void setPicture(Image picture);
    void setRating(Rating rating);
    void setPrice(double price);
    void setRestraunt(IRestaurant restraunt);
}
