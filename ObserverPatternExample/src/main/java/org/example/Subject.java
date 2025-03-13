package org.example;

// Lớp này quản lý danh sách các Observer và thông báo khi có thay đổi.
// Chứa danh sách các Observer (observers).
// Khi state thay đổi, gọi notifyObservers() để gửi thông báo.
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    // Thêm Observer vào danh sách
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Xóa Observer khỏi danh sách
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Thay đổi trạng thái và thông báo đến các Observer
    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }

    // Gửi thông báo đến tất cả Observer
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Trạng thái mới: " + state);
        }
    }
}
