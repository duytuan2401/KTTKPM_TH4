package org.example;

public class Main {
    public static void main(String[] args) {
        // Tạo Subject (chủ thể quan sát)
        Subject subject = new Subject();

        // Tạo các Observer (người quan sát)
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Đăng ký Observer vào Subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Thay đổi trạng thái của Subject
        subject.setState("Hoạt động");
        subject.setState("Dừng lại");

        // Xóa một Observer và thử thay đổi trạng thái lần nữa
//        subject.removeObserver(observer1);
//        subject.setState("Khởi động lại");
    }
}
