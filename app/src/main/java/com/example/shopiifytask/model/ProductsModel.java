package com.example.shopiifytask.model;

public class ProductsModel {
   private int id;
   private String title;
   private double price;
   private String description;
   private String category;
   private int image;
   private Rating rating;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public int getImage() {
      return image;
   }

   public void setImage(int image) {
      this.image = image;
   }

   public Rating getRating() {
      return rating;
   }

   public void setRating(Rating rating) {
      this.rating = rating;
   }
}
