package org.example;

import java.util.ArrayList;
import java.util.List;

public class Music {
    private int id;
    private String name;
    private boolean state;

    List<Subscriber> subscribers;

    public Music(int id, String name, boolean state) {
        this.id = id;
        this.name = name;
        this.state = state;
        subscribers = new ArrayList<>();
    }
    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void changeState() {
        state = !state;
        System.out.println(state);
        notification();
    }

    private void notification(){
        for (Subscriber subscriber : subscribers) {
            subscriber.receiverNotification(" Status change!");
        }
    }
}
