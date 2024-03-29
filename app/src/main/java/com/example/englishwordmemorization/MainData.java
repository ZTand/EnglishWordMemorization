package com.example.englishwordmemorization;

import androidx.annotation.Nullable;

public class MainData {
    private String category;

    String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(obj instanceof MainData) {
            MainData tmp = (MainData)obj;
            return category.equals(tmp.category);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return category.hashCode();
    }
}
