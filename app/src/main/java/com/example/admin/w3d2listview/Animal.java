package com.example.admin.w3d2listview;

/**
 * Created by Luis Aguirre on 9/6/2017.
 */

class Animal {
    String name;
    int imageId;
    String description;

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    int layout;

    public Animal(String name, int imageId, String description, int layout) {
        this.name = name;
        this.imageId = imageId;
        this.description = description;
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
