package edu.uc.bearcatid.Domain;

import android.location.Address;
import android.media.Image;
import android.media.Rating;

import java.util.List;

public class Restaurant implements IRestaurant {

    private int ID;
    private String name;
    private Address address;
    private Rating rating;
    private String description;
    private String catagory;
    private List<String> notes;
    private List<Image> pictures;

    public Restaurant()
    {
        ID = 0;
        name = "";
        address = null;
        rating = null;
        description = "";
        catagory = "";
        notes = null;
        pictures = null;
    }


    public int getID()
    {
        return ID;
    }
    public String getName()
    {
        return name;
    }
    public Address getAddress()
    {
        return address;
    }
    public Rating getRestaurantRating()
    {
        return rating;
    }
    public String getDescription()
    {
        return description;
    }
    public String getCatagory()
    {
        return catagory;
    }
    public List<String> getNotes()
    {
        return notes;
    }
    public List<Image> getPhotos()
    {
        return pictures;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public void setRestaurantRating(Rating rating)
    {
        this.rating = rating;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setCatagory(String category)
    {
        this.catagory = category;
    }
    public void addNotes(String notes)
    {
        this.notes.add(notes);
    }
    public void addPhotos(Image photo)
    {
        this.pictures.add(photo);
    }
}
