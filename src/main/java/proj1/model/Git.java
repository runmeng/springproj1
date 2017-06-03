package model;


import java.time.LocalDate;

public class Git {
  private  String name;
  private  LocalDate dateUpdated;
  private  String username;
  private  boolean favorite;

    public Git(String name, LocalDate dateUpdated, String username, boolean favorite) {
        this.name = name;
        this.dateUpdated = dateUpdated;
        this.username = username;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
