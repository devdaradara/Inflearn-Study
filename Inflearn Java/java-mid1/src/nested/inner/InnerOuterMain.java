package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // 인스턴스 자체의 참조값을 알아야함
        InnerOuter.Inner inner = outer.new Inner();

        inner.print();
        System.out.println(inner.getClass());
    }
}
