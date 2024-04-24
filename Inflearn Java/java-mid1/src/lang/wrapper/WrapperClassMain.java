package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);// 곧 삭제 예정, valueOf() 대신 사용 권장
//        Integer newInteger = Integer.valueOf(10); //미리 해싱해서 좋음
        Integer integerObject = Integer.valueOf(10); //미리 해싱해서 좋음
        System.out.println("new Integer = " + newInteger);
        System.out.println("integerObject = " + integerObject);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObject.intValue();
        System.out.println("intValue = " + intValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObject));
        System.out.println("equals: " + newInteger.equals(integerObject));
    }
}
