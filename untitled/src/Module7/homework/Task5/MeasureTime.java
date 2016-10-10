package Module7.homework.Task5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.lang.*;

/**
 * Created by PC on ${DATA}.
 */
public class  MeasureTime<T> {
    private List<T> list = new ArrayList<>();
    private List<T> linkedlist = new LinkedList<>();
    private long start1, start2, finish1, finish2, delta;

   // ******fill the list********
    public MeasureTime(T el) {

        for (int i = 0; i < 1000; i++){
            list.add(i, el);
            linkedlist.add(i, el);
        }
    }



    public void measureTimeByAdd (int quantityLoops, T element){

        start1 = System.currentTimeMillis();
        for(int i = 0; i < quantityLoops; i++){
            list.add(element);
        }
        finish1 = System.currentTimeMillis();
        delta = finish1 - start1;
        System.out.println("Time to add the elements to arraylist "+ delta);
        System.out.println();

        start2 = System.currentTimeMillis();
        for(int i = 0; i < quantityLoops; i++){
            linkedlist.add(element);
        }
        finish2 = System.currentTimeMillis();
        delta = finish2 - start2;
        System.out.println("Time to add the elements to Linkedlist " + delta);
        System.out.println();
    }

    public void measureTimeByGet (){

        start1 = System.currentTimeMillis();
        for(int i = 0; i < list.size(); i++){
            list.get(i);
        }
        finish1 = System.currentTimeMillis();
        delta = finish1 - start1;
        System.out.println("*****************************************************");
        System.out.println("Time while using the method Get in arrayList " + delta);
        System.out.println();

        start2 = System.currentTimeMillis();
        for(int i = 0; i < linkedlist.size(); i++){
            linkedlist.get(i);
        }
        finish2 = System.currentTimeMillis();
        delta = finish2 - start2;
        System.out.println("Time while using the method Get in linkedList " + delta);
    }


    public void measureTimeBySet (int quantityLoops, T element){

        start1 = System.currentTimeMillis();
        for(int i = 0; i < quantityLoops; i++){
            list.set(i, element);
        }
        finish1 = System.currentTimeMillis();
        delta = finish1 - start1;
        System.out.println("*****************************************************");
        System.out.println("Time while using the method Set in arrayList " + delta);
        System.out.println();

        start2 = System.currentTimeMillis();
        for(int i = 0; i < quantityLoops; i++){
            linkedlist.set(i, element);
        }
        finish2 = System.currentTimeMillis();
        delta = finish2 - start2;
        System.out.println("Time while using the method Set in linkedList " + delta);
    }

    public void measureTimeByRemove (){

        start1 = System.currentTimeMillis();
        for(int i = 0; i < list.size(); i++){
            list.remove(i);
        }
        finish1 = System.currentTimeMillis();
        delta = finish1 - start1;
        System.out.println("*****************************************************");
        System.out.println("Time while using the method Remove in arrayList " + delta);
        System.out.println();

        start2 = System.currentTimeMillis();
        for(int i = 0; i < linkedlist.size(); i++){
            linkedlist.remove(i);
        }
        finish2 = System.currentTimeMillis();
        delta = finish2 - start2;
        System.out.println("Time while using the method Remove in linkedList " + delta);
    }







}
