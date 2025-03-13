package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private String name;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, status);
        }
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Công việc '" + name + "' đã cập nhật trạng thái: " + newStatus);
        notifyObservers();
    }
}