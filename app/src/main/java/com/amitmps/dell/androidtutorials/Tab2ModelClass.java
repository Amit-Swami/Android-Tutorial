package com.amitmps.dell.androidtutorials;

public class Tab2ModelClass {
    private String Name;
    private int Image;

    public Tab2ModelClass() {
    }

    public Tab2ModelClass(String name, int image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
