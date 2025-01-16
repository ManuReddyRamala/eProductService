package com.example.fakestore.Model;

import lombok.Data;

@Data
public class Category {
    private long id;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
