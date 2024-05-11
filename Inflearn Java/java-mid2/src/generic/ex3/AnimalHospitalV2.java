package generic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T 타입을 메서드 정의하는 시점에는 알수 없음. Object 기능만 사용가능
        animal.toString();
        animal.equals(null);

//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
    }

    public T getBigger(T target) {
        return null;
//        return animal.getSize() > target.getSize() ? animal : target;
    }
}
