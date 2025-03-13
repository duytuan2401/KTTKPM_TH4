package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tạo công việc
        Task task1 = new Task("Phát triển giao diện", "Chưa bắt đầu");

        // Tạo thành viên nhóm
        Observer member1 = new TeamMember("Nguyễn Văn A");
        Observer member2 = new TeamMember("Trần Thị B");

        // Đăng ký thành viên theo dõi công việc
        task1.addObserver(member1);
        task1.addObserver(member2);

        // Cập nhật trạng thái công việc
        task1.setStatus("Đang thực hiện");
        task1.setStatus("Hoàn thành");
    }
}