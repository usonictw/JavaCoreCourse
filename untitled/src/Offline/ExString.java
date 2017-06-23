package Offline;

import java.util.Scanner;

public class ExString {
    //vuut
//vuuuuu
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int k = in.nextInt();
        in.close();
        String[] subString;
        String minSubstring = "";
        String maxSubstring = "";
        if (k <= S.length()) {
            subString = new String[S.length() - k + 1];
            for (int i = 0; i < S.length() - k + 1; i++) {
                subString[i] = S.substring(i, k + i);
            }
            int max = 0;
            int min = 0;
            for (int j = 0; j < subString.length; j++) {
                for (int p = 0; p < subString.length; p++) {
                    int flag = subString[p].compareTo(subString[j]);
                    if (flag > max) {
                        max = flag;
                        minSubstring = subString[j];
                    } else if (flag < min) {
                        min = flag;
                        maxSubstring = subString[j];
                    }else if (flag == 0 && min == 0 && max == 0){
                        minSubstring = subString[j];
                        maxSubstring = subString[j];
                    }
                }
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);

     
    }
}
