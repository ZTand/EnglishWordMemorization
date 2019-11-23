package com.example.englishwordmemorization;

import androidx.annotation.Nullable;

public class SubClassData {
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(obj instanceof SubClassData) {
            SubClassData tmp = (SubClassData)obj;
            return className.equals(tmp.className);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return className.hashCode();
    }
}
