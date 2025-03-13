package org.example;

public class Main {
    public static void main(String[] args) {
        // Tao co phieu
        Stock appleStock = new Stock("AAPL", 150.0);

        // Tao nha dau tu
        Observer investor1 = new Investor("Nguyễn Văn A");
        Observer investor2 = new Investor("Trần Thị B");

        // Dang ky nha dau tu vao co phieu
        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        // Thay doi gia co phieu va thong bao
        appleStock.setPrice(155.0);
        appleStock.setPrice(160.5);

        // Xóa một nhà đầu tư
        appleStock.removeObserver(investor1);

        // Thay đổi giá cổ phiếu lần nữa
        appleStock.setPrice(165.0);
    }
}
