package com.example.awtSample;

import com.example.awtSample.model.DataSource;

public class Main {

    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        datasource.close();
    }
}
