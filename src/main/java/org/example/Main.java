package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String name = "Name";
        String lastName = "Last Name";

        Gson gson = new Gson();
        String json = gson.toJson(new NameObject(name, lastName));
        System.out.println(json);

    }

    static class NameObject{
        private String name;
        private String lastName;

        public NameObject(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }
    }
}