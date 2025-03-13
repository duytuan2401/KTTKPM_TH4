package org.example;

// ConcreteObserver.java
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        //(name) để phân biệt các đối tượng.
        // Khi trạng thái thay đổi, update() sẽ được gọi để in thông báo.
        System.out.println(name + " nhận được thông báo: " + message);
    }
}

