package Module2HomeWork.Task1;

/**
 * Created by PC on ${DATA}.
 */
public class ActionArray {

    //------------------------------------------------------Calculated Sum of all elements the array-------------------------------------------
    static int calculateSum(int[] array) {
        int sum = 0;
        for (int valueOfArray : array) {

            sum += valueOfArray;
        }
        return sum;
    }

    static double calculateSumDouble(double[] arrayD) {
        double sum = 0;
        for (double valueOfArrayD : arrayD) {

            sum += valueOfArrayD;
        }
        return sum;
    }

    //------------------------------------------------------maximum element the array search method-------------------------------------------------
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

    //-------------------------------------------------------minimum element the array search method-------------------------------------------------
    static int minOfArray(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static double minOfArrayD(double[] arrayD) {

        double minD = arrayD[0];
        for (int i = 1; i < arrayD.length; i++) {
            if (minD > arrayD[i]) {
                minD = arrayD[i];
            }
        }
        return minD;
    }

//-------------------------------------------------------positive maximum element the array search method-------------------------------------------------

    static int positiveMaxOfArray(int[] array) {

        int posmax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (posmax < array[i] && array[i] > 0) {
                posmax = array[i];
            }

        }
        return posmax;
    }

    static double positiveMaxOfArrayD(double[] arrayD) {

        double posMaxD = arrayD[0];
        for (int i = 1; i < arrayD.length; i++) {
            if (posMaxD < arrayD[i] && arrayD[i] > 0) {
                posMaxD = arrayD[i];
            }

        }
        return posMaxD;
    }

    //-------------------------------------------------------miltiplication--------------------------------------------------------------

    static int multiplication(int[] array) {
        int mult = 1;
        for (int valueArray : array) {

            mult *= valueArray;

        }

        return mult;
    }

    static double multiplicationD(double[] array) {
        double multD = 1;
        for (double valueArray : array) {

            multD *= valueArray;

        }

        return multD;
    }

    //-------------------------------------------------------modulo the first and last element of array-------------------------------------------------
    static int modulo(int[] array) {

        int module;
        module = array[0] % array[array.length - 1];

        return module;
    }

    static double moduloD(double[] arrayD) {

        double moduloD;
        moduloD = arrayD[0] % arrayD[arrayD.length - 1];

        return moduloD;
    }

    //-------------------------------------------------------second largest element of the array-------------------------------------------------
    static int secondLargest(int[] array) {
        int secL = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    flag = true;
                }
            }
            if (!flag) break;

            //if(i==1) break;

        }

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < array[i]) {
                secL = array[i - 1];
                break;
            }
        }

        return secL;

    }

    static int secondLargestNew(int[] array) {

        int maxOfElement = maxOfArray(array);
        for (int i = 0; i < array.length; i++) {

        }
        return 0;
    }

    static double secondLargestD(double[] arrayD) {

        double secLD = 0;
        for (int i = 0; i < arrayD.length - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < arrayD.length - i - 1; j++) {

                if (arrayD[j] > arrayD[j + 1]) {
                    double temp = arrayD[j + 1];
                    arrayD[j + 1] = arrayD[j];
                    arrayD[j] = temp;

                    flag = true;
                }
            }
            if (!flag) break;

            //if(i==1) break;

        }
        for (int i = arrayD.length - 1; i > 0; i--) {
            if (arrayD[i - 1] < arrayD[i]) {
                secLD = arrayD[i - 1];
                break;
            }
        }

        return secLD;

    }






            public static void main (String[]args){

            int[] array = {1, 4, 4, 4, 5, 2, 1, 5, 2, 3};
            double[] arrayD = {3.12, 4.234, 5.322, 7.09, 6.89, 0.67, 1.765, 7.986, 9.432, 3.4};
            //Calculate sum of elements of the Array and ArrayD
            int sumArray = calculateSum(array);
            double sumArrayD = calculateSumDouble(arrayD);
            //the maximum element of the arrays (in array and double array) search method
            int max = maxOfArray(array);
            double maxD = maxOfArrayDouble(arrayD);
            //the minimum element of the array search method
            int min = minOfArray(array);
            double minD = minOfArrayD(arrayD);
            //positive maximum of element the Array search method
            int posMax = positiveMaxOfArray(array);
            double posMaxD = positiveMaxOfArrayD(arrayD);
            //multiplication
            int mult = multiplication(array);
            double multD = multiplicationD(arrayD);
            //calculate modulo method
            int modulo = modulo(array);
            double moduloD = moduloD(arrayD);
            //Second largest of element the array search method
            int secondLargest = secondLargest(array);
            double secondLargestD = secondLargestD(arrayD);

            // Output "Sum, Max, Min, Modulo, Second Largest element of the Array"
            System.out.println("Sum of int elements the array: " + sumArray);
            System.out.println("Sum of double elements the array: " + sumArrayD);
            System.out.println("Max int element of the array: " + max);
            System.out.println("Max double element of the array: " + maxD);
            System.out.println("Min int element of the array: " + min);
            System.out.println("Min double element of the array: " + minD);
            if (posMax > 0) System.out.println("Positive max int value of array: " + posMax);
            else System.out.println("array haven't positive value");

            if (posMax > 0) System.out.println("Positive max double value of array: " + posMaxD);
            else System.out.println("array haven't positive value");

            System.out.println("Multiplication of all int elements the array is: " + mult);
            System.out.println("Multiplication of all double elements the array is: " + multD);
            System.out.println("Modulo the int first and last element of array: " + modulo);
            System.out.println("Modulo the double first and last element of array: " + moduloD);

            System.out.println("Second largest int element of array: " + secondLargest);
            System.out.println("Second largest double element of array: " + secondLargestD);



    }
}
