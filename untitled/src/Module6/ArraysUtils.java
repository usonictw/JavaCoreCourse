package Module6;

import Module5.homework.Room;

/**
 * Created by PC on ${DATA}.
 */
public final class ArraysUtils {

    //------------------------------------------------------Calculated Sum of all elements the array-------------------------------------------
    static int calculateSum(int[] array) {
        int sum = 0;
        for (int valueOfArray : array) {

            sum += valueOfArray;
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

   //-------------------------------------------------------miltiplication--------------------------------------------------------------

    static int multiplication(int[] array) {
        int mult = 1;
        for (int valueArray : array) {

            mult *= valueArray;

        }

        return mult;
    }


    //-------------------------------------------------------modulo the first and last element of array-------------------------------------------------
    static int modulo(int[] array) {

        int module;
        module = array[0] % array[array.length - 1];

        return module;
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

        int max1 = array[0];
        for (int i = 1; i < array.length/2; i++) {
            if (max1 < array[i]) {
                max1 = array[i];
            }
        }
        int max2 = array[array.length/2];
        for (int i = array.length/2 + 1; i < array.length; i++) {
            if (max2 < array[i]) {
                max2 = array[i];
            }
        }

        int secondLargestNew;

        if (max1 < max2){
            secondLargestNew = max1;
        } else {
            secondLargestNew = max2;
        }
        return secondLargestNew;
    }

    //---------------------------------------------Reverse array-------------------------------------------------------------------------

  static int[] reverse(int array[]){

      int reverseArray[] = new int[array.length];
      int k = array.length-1;
      for (int i : array){

          reverseArray[k] = i;
          k--;

      }
      return reverseArray;
  }

    //-------------------------------------------------Founding even elements-------------------------------------------------------------------
    static int [] findEvenElements(int[] array){

        int evenElements[] = new int[array.length];
        int index =0;
        for(int i : array){

            if(i%2==0) evenElements[index] = i;
            index++;
        }
        return  evenElements;
    }


}


