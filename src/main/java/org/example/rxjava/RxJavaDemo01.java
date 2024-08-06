package org.example.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.Arrays;
import java.util.List;

public class RxJavaDemo01 {
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
        Observable<String> stringObservable = Observable.fromIterable(colors);
        // 3. 5글자 이상인 색깔을 대문자로 바꿔서 출력한다.
        stringObservable
                .filter(color -> color.length() >= 5)
                .map(color -> color.toUpperCase())
                .subscribe(new MyObserver());

    }
}

class MyObserver implements Observer<String> {

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        System.out.println("onSubscribe 함수를 콜백한다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onNext(@NonNull String s) {
        System.out.println("옵저버블 님이 데이터를 주시네요.. " + s);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onError(@NonNull Throwable e) {

    }

    @Override
    public void onComplete() {
        System.out.println("데이터 끝났어요.. 구독 종료됩니다.");
    }
}
