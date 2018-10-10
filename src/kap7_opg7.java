package com.company;

public class Kap7_Opg7 {

    /*  write a program that generates 200 random integers between 0 and 9 and display the count for each
        number. HINT! use an array of 10 integers, say counts, to store the counts of number of 0s, 1s... 9s.
     */

    public static void main(String[] args) {
        int [] count = new int [10];                // laver array med 10 tomme pladser, der har navnet count

        for (int i = 1; i >= 200; i++);
        count[(int)(Math.random() * 10)]++;         // randomværdierne sættes ind i arrayet count

        for (int i = 0; i < count.length; i++ ) {
            System.out.println(i + count[i]);       // indtil der er kørt 200 heltal som er længden for array´et, count,
            //vil tallene heri arrayet blive printet
        }
    }


}
