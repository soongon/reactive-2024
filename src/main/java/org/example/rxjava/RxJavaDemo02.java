package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

import java.util.Arrays;
import java.util.List;

public class RxJavaDemo02 {
    public static void main(String[] args) {
        // 1. 데이터 확보 .. 색깔(스트링) 데이터 10개를 리스트로
        List<String> colors = Arrays.asList(
                "Red",    // 3 letters
                "Blue",   // 4 letters
                "Green",  // 5 letters
                "Yellow", // 6 letters
                "Purple", // 6 letters
                "Orange", // 6 letters
                "Violet", // 6 letters
                "Pink",   // 4 letters
                "Brown",  // 5 letters
                "White"   // 5 letters
        );
        // 2. Observable 로 생성
        // 3. 5글자 이상인 색깔을 대문자로 바꿔서 출력한다.
        Disposable dis = Observable.fromIterable(colors)
                //.filter(color -> color.length() >= 5)
                //.map(String::toUpperCase)
                .subscribe(
                        color -> System.out.println(color), // onNext
                        error -> System.out.println(error), // onError
                        () -> System.out.println("데이터 다 에밋했어요. 구독 끝..") // onComplete
                );
    }
}
