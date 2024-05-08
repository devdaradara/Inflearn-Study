package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        // 생성 시점에 T의 타입을 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
//        integerBox.set("hello") Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.6);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);
    }
}
