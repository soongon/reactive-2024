package org.example.rxjava;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class RxJavaDemo03 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("삼성 갤럭시 S21", 999000, 10, 5));
        products.add(new Product("LG OLED TV", 1500000, 20, 10));
        products.add(new Product("애플 맥북 프로", 2300000, 15, 7));
        products.add(new Product("소니 헤드폰", 299000, 25, 12));
        products.add(new Product("다이슨 청소기", 450000, 30, 20));
        products.add(new Product("샤오미 로봇 청소기", 220000, 5, 3));
        products.add(new Product("블랙야크 등산화", 189000, 35, 8));
        products.add(new Product("나이키 운동화", 129000, 40, 15));
        products.add(new Product("애플 아이패드", 890000, 10, 10));
        products.add(new Product("삼성 냉장고", 1200000, 20, 25));
        products.add(new Product("한샘 책상", 350000, 15, 9));
        products.add(new Product("루이비통 가방", 2500000, 30, 13));
        products.add(new Product("샤넬 향수", 150000, 25, 11));
        products.add(new Product("버버리 코트", 2000000, 10, 14));
        products.add(new Product("LG 공기청정기", 500000, 20, 18));
        products.add(new Product("브라운 면도기", 110000, 35, 22));
        products.add(new Product("비츠 이어폰", 220000, 5, 4));
        products.add(new Product("에스프레소 머신", 650000, 40, 17));
        products.add(new Product("HP 프린터", 130000, 30, 6));
        products.add(new Product("삼성 모니터", 400000, 25, 19));


    }
}
