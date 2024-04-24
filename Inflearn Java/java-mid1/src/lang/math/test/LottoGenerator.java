package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private Random random;
    private int[] lottoNumber;

    public int[] createLottoNumber() {
        random = new Random();
        lottoNumber = new int[6];

        int idx = 0;

        while (idx < 6) {
            int num = random.nextInt(44) + 1;

            if (isUnique(lottoNumber, num)) {
                lottoNumber[idx] = num;
                idx++;
            }
        }

        return lottoNumber;
    }

    public boolean isUnique(int[] arr, int num) {
        for (int a : arr) {
            if (num == a) {
                return false;
            }
        }
        return true;
    }
}
