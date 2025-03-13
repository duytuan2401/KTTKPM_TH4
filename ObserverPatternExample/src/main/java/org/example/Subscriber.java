package org.example;

public class Subscriber {
    private int id;
    private String name;

    public Subscriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void receiverNotification(String message){
        System.out.println(id + ": " + name + " receiver" + message);
    }
}
