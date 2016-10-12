package Module7.homework.Task5;

/**
 * Created by PC on ${DATA}.
 */
public class Main {

    public static void main(String[] args) {



        MeasureTime<Integer> measureTime = new MeasureTime<>(1);
        measureTime.measureTimeByAdd(10000, 1);
        measureTime.measureTimeByGet();
        measureTime.measureTimeBySet(1000, 2);
        measureTime.measureTimeByRemove();

    }
}
