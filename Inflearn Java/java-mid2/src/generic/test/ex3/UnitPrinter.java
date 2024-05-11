package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        shuttle.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        shuttle.showInfo();
    }
}
