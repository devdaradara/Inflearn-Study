package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 시작");
        dog.sound();
        System.out.println("동물 소리 종료");

        soundCat(cat);

        soundCaw(caw);
    }

    public static void soundCaw(Caw caw) {
        System.out.println("동물 소리 시작");
        caw.sound();
        System.out.println("동물 소리 종료");
    }

    public static void soundCat(Cat cat) {
        System.out.println("동물 소리 시작");
        cat.sound();
        System.out.println("동물 소리 종료");
    }
}
