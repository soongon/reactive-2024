package org.example.model;

public class Product {
    // 상품명
    private String name;
    // 가격
    private long price;
    // 할인율
    private int discountRate;
    // 상품 좋아요 갯수
    private int likes;

    public Product() {}
    public Product(String name, long price, int discountRate, int likes) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                ", likes=" + likes +
                '}';
    }
}
