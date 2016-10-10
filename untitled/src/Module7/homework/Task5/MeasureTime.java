package Module7.homework.Task5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.lang.*;

/**
 * Created by PC on ${DATA}.
 */
public class  MeasureTime<T> {




    public void measureTimeByAdd (int quantityLoops, T element){

        List<T> list = new ArrayList<T>();
        List<T> linkedlist = new LinkedList<T>();
        long start1, start2, finish1, finish2;

        start1 = System.currentTimeMillis();
        for(int i = 0; i < quantityLoops; i++){
            list.add(element);
        }
        finish1 = System.currentTimeMillis();
        System.out.println(finish1 - start1);
        System.out.println();

        start2 = System.currentTimeMillis();
        for(int i = 0; i < quantityLoops; i++){
            list.add(element);
        }
        finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2);
    }






}
