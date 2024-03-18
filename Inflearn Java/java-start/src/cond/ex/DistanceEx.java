package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 25;
        String vi;

        if (distance <= 1) {
            vi = "도보";
        } else if (distance <= 10) {
            vi = "자전거";
        } else if (distance <= 100) {
            vi = "자동차";
        } else {
            vi = "비행기";
        }

        System.out.println("distance: " + distance);
        System.out.println("출력: " + vi + "를 이용하세요.");
    }
}
