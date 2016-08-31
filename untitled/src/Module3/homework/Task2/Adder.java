package Module3.homework.Task2;

public class Adder extends Arithmetic {


    public boolean check (Integer a, Integer b){

        boolean check;
        if (a>=b) check = true;
        else check = false;

        /*int c;
        boolean check;

        c = a.compareTo(b);

        if(c==0 || c==1){
            check = true;
        }
        else{
            check = false;
        }*/

        return check;
    }

}
