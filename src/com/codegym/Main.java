package com.codegym;

import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal cat = new Cat();
        Animal mouse = new Mouse();

        cat.speak();
        mouse.speak();

        cat.show();
        mouse.show();

        Cat cat1 = (Cat) cat;
        cat1.go();

        cat.show();

        AccessDatabase accessDatabase = new AccessDatabase() {
            @Override
            public String getUser() {
                return AccessDatabase.USER;
            }

            @Override
            public String getPass() {
                return AccessDatabase.PASS;
            }

            @Override
            public String getDbName() {
                return AccessDatabase.DBNAME;
            }
        };

        String dbName = accessDatabase.getDbName();
        String pass = accessDatabase.getPass();
        String user = accessDatabase.getUser();

        System.out.println(dbName + "-" + pass + "-" + user);


    }
}
