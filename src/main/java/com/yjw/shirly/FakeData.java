package com.yjw.shirly;

import java.util.ArrayList;

public class FakeData {
    public ArrayList<String> getList() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(String.format("====第%s条目====",i));
        }
        return strings;
    }
}
