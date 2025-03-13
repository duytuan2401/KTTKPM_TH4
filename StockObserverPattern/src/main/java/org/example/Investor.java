package org.example;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("Nhà đầu tư " + name + " nhận thông báo: Cổ phiếu "
                + stockSymbol + " thay đổi giá: " + newPrice);
    }
}

