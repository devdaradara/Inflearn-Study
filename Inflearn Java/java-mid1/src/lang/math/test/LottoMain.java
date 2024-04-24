package lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        int[] lottoNumbers = lottoGenerator.createLottoNumber();

        System.out.print("로또 번호: ");
        for (int num : lottoNumbers) {
            System.out.print(num + " ");
        }
    }
}
