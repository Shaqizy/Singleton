package com.gmail.shayzeq;

public class Singleton {

    private Singleton(){
    }

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if(instance == null){
            return instance;
        }
        return instance;
    }
}
