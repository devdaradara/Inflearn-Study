package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {

        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        //default 호출 불가능
//        data.defaultField = 2;
//        data.defaultMethod();

        // private 불가능
//        data.privateField = 3;
//        data.privateMethod();

        // 내부 호출은 모두 가능
        data.innerAccess();
    }
}
