package oop.labor01;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 2. - print name by chars\n");
        String name = "Kadar Akos Gergo";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println("\nProblem 3. - split by spaces\n");
        String[] splitName = name.split(" ");
        for (String s:splitName) {
            System.out.println(s);
        }
        System.out.println("\nProblem 4. - word in pyramid\n");
        String word = "object";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0,i+1));
        }

        System.out.println("\nStatic functions\nProblem 5. - maximum value of an array\n");
        double[] array = {12, 56, 567, 2, -42, 8};
        System.out.printf("MAX: %6.2f\n",maxElement(array));
        System.out.println("\nProblem 6. - getbits\n");
        System.out.println(getBit(15, 3));

        System.out.println("\nProblem 7. - countbits\n");
        System.out.println(countBits(16));

        System.out.println("Array:");
        double[] array1 = {1,5.3,2,8.6,2,6.78,12.6,76,1,4,8};
        //System.out.println(Arrays.toString(max2(array1)));

        System.out.println("One million");
        //oneMillion();

        System.out.println("\nStandard devitation");
        System.out.println(sDevitation(array1));
    }
    public static double maxElement(double[] array){
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<array.length;++i){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static byte getBit(int number, int order){
        if (order < 0 || order > 32){
            return -1;
        }
        else
            return (byte) (number>>order & 1);
    }
    public static int countBits(int number){
        int numOf1Bits = 0;
        int len = (int) (Math.log(number) + 1);
        for (int i = 0; i < len; i++) {
            if ((number & 1) == 1) numOf1Bits++;
            number = number>>1;
        }

        return numOf1Bits+1;
    }
    public static double mean(double array[]){
        double n=0;
        if(array.length == 0){
            return Double.NaN;
        }
        else{
            for (int i = 0; i < array.length; i++) {
                n += array[i];
            }
            double avg = (double) n / array.length;
            return avg;
        }
    }
    public static double sDevitation(double[] array){
        if(array.length == 0)
            return Double.NaN;
        else {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            double standardDevitation = 0;
            for (int i = 0; i < array.length; i++) {
                double devitation = array[i] - mean(array);
                standardDevitation += devitation * devitation;
            }
            return Math.sqrt(standardDevitation / array.length);
        }
    }
    public static double[] max2(double array[]){
        double[] max ={Double.NEGATIVE_INFINITY,
                Double.NEGATIVE_INFINITY};
        if( array.length == 0 ){
            return max;
        }
        else{
            Arrays.sort(array);
            max[0] = array[array.length-2];
            max[1] = array[array.length-1];
        }
        return max;
    }
    public static void oneMillion(){
        Random random = new Random();
        int duplicates = 0;
        int[] array = new int[1000000];
        int[] array2 = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            array[i] = random.nextInt(1000000);
            array2[array[i]]++;
        }
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        for (int i = 0; i < 1000000; i++) {
            if(array2[i] > 1){
                duplicates++;
            }
        }
        System.out.println("Number of duplicates is: " + duplicates);
    }
}
