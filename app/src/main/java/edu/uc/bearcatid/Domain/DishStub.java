package edu.uc.bearcatid.Domain;


import android.media.Image;
import android.media.Rating;

import java.util.Date;

public class DishStub implements IDish {
    
    private int ID;
    private String name;
    private String description;
    private double price;
    private Date date;
    private Image picture;
    private Rating rating;
    private IRestaurant restaraunt;

    public DishStub()
    {
        ID = 0;
        name = "dumb";
        description = "";
        price = 0.1;
        date = null;
        picture = null;
        rating =null;
        restaraunt = null;
    }

    public int getID()
{
    return ID;
}
    public String getName()
{
    return name;
}
    public Date getDate()
{
    return date;
}
    public String getDescription()
{
    return description;
}
    public Image getPicture()
{
    return picture;
}
    public Rating getRating()
{
    return rating;
}
    public double getPrice()
{
    return price;
}
    public IRestaurant getRestraunt()
{
    return restaraunt;
}

    public void setName(String name)
{
    this.name = name;
}
    public void setDate(Date date)
{
    this.date =date;
}
    public void setDescription(String description)
{
    this.description = description;
}
    public void setPicture(Image picture)
{
    this.picture = picture;
}
    public void setRating(Rating rating)
{
    this.rating = rating;
}
    public void setPrice(double price)
{
    this.price = price;
}
    public void setRestraunt(IRestaurant restraunt)
{
    this.restaraunt = restraunt;
}
}
