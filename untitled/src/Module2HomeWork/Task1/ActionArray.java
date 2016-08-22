package Module2HomeWork.Task1;

/**
 * Created by PC on ${DATA}.
 */
public class ActionArray {

    static int calculateSum(int[] array){
        int sum=0;
        for(int valueOfArray : array){

            sum+=valueOfArray;
        }
        return sum;
    }

    static int maxOfArray(int[] array){

        int max=array[0];
        for(int i=1; i<array.length-1; i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    static int minOfArray(int[] array){

        int min=array[0];
        for(int i=1; i<array.length-1; i++){
            if (min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

    static int positiveMaxOfArray(int[] array){

        int posmax=array[0];
        for(int i=1; i<array.length-1; i++){
            if (posmax<array[i] && array[i]>0){
                posmax=array[i];
            }

        }
        return posmax;
    }

    public static void main(String[] args) {

        int[] array={3,7,-4,-34,-78,-76,-32,-87,-12,-43};
        int sumArray=calculateSum(array);
        int max=maxOfArray(array);
        int min=minOfArray(array);
        int posMax=positiveMaxOfArray(array);
        System.out.println("Sum of array: "+sumArray);
        System.out.println("Max of array: "+max);
        System.out.println("Min of array: "+min);
        if(posMax>-1) System.out.println("Positive max value of array: "+posMax);
        else System.out.println("array haven't positive value");
    }
}
