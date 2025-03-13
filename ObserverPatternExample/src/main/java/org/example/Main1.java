package org.example;

public class Main1 {
    public static void main(String[] args) {
        Subscriber s = new Subscriber(1, "hau");
        Subscriber s2 = new Subscriber(2, "phong");
        Subscriber s3 = new Subscriber(3, "tung");

        Music music = new Music(1, "MTP Music", true);

        music.add(s);
        music.add(s2);
        music.add(s3);

        music.changeState();

    }
}
