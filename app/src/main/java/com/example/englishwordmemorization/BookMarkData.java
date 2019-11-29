package com.example.englishwordmemorization;

import androidx.annotation.Nullable;

public class BookMarkData {
    private String english;
    private String korean;
    private Boolean check;

    public String getEnglish() {
        return english;
    }

    public String getKorean() {
        return korean;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setKorean(String korean) {
        this.korean = korean;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof BookMarkData) {
            BookMarkData tmp = (BookMarkData) obj;
            return english.equals(tmp.english) && korean.equals(tmp.korean) && check.equals(tmp.check);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (english + korean).hashCode();
    }
}
