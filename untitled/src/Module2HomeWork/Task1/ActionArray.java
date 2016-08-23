package Module2HomeWork.Task1;

/**
 * Created by PC on ${DATA}.
 */
public class ActionArray {

    static int calculateSum(int[] array) {
        int sum = 0;
        for (int valueOfArray : array) {

            sum += valueOfArray;
        }
        return sum;
    }

    static double calculateSumDouble(double[] arrayD) {
        double sum = 0;
        for (double valueOfArray : arrayD) {

            sum += valueOfArray;
        }
        return sum;
    }

    static int maxOfArray(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static double maxOfArrayDouble(double[] arrayD) {

        double maxD = arrayD[0];
        for (int i = 1; i < arrayD.length; i++) {
            if (maxD < arrayD[i]) {
                maxD = arrayD[i];
            }
        }
        return maxD;
    }

    static int minOfArray(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int positiveMaxOfArray(int[] array) {

        int posmax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (posmax < array[i] && array[i] > 0) {
                posmax = array[i];
            }

        }
        return posmax;
    }

    // module by dividing the first and last element of array
    static int modulus(int[] array) {

        int module;
        module = array[0] % array[array.length - 1];

        return module;
    }

  static int secondLargest(int[] array){

        for(int i=0; i<array.length-1; i++){
            //boolean flag=false;

            for(int j=0; j<array.length-i-1; j++){

                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;

                   // flag=true;
                }
            }
           //if(!flag) break;

            if(i==1) break;

        }
        int secL=array[array.length-2];
        return secL;

    }

    public static void main(String[] args) {

        int[] array = {3, 7, 4, 34, 78, 76, 32, 87, 12, 5};
        double[] arrayD={3.12, 4.234, 5.322, 7.09, 6.89, 32.67, 12.765, 7.986, 9,432, 13.872};
        //Calculate sum of elements of the Array and ArrayD
        int sumArray = calculateSum(array);
        double sumArrayD=calculateSumDouble(arrayD);
        //the maximum element of the arrays (in array and double array) search method
        int max = maxOfArray(array);
        double maxD=maxOfArrayDouble(arrayD);
        //the minimum element of the array search method
        int min = minOfArray(array);
        //positive maximum of element the Array search method
        int posMax = positiveMaxOfArray(array);
        //calculate modulo method
        int module = modulus(array);
        //Second largest of element the array search method
        int secondLargest=secondLargest(array);

       // Output "Sum, Max, Min, Modulo, Second Largest element of the Array"
        System.out.println("Sum of int elements the array: " + sumArray);
        System.out.println("Sum of double elements the array: " + sumArrayD);
        System.out.println("Max of array: " + max);
        System.out.println("Min of array: " + min);
        if (posMax > -1) System.out.println("Positive max value of array: " + posMax);
        else System.out.println("array haven't positive value");

        System.out.println("Module by dividing the first and last elrment of array: " + module);

        System.out.println("Second largest element of array: "+secondLargest);




    }
}
