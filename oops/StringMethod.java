package oops;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[]args) {
        String word = "i Am tarun RAj Gaur";

        System.out.println(word.length());
        System.out.println(word.charAt(5));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.indexOf('G'));
        System.out.println(word.lastIndexOf('r'));


        char arr[] = word.toCharArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(word.substring(2,11));


        String splitt[]= word.split(" ");
        System.out.println(Arrays.toString(splitt));

        StringCompare obj = new StringCompare("abc", "xyz");
        obj.print();
    }
    static class StringCompare {
        String s1;
        String s2;

        StringCompare(String s1, String s2) {
            this.s1 = s1;
            this.s2 = s2;
        }

        public void print() {
            System.out.println(s1.compareTo(s2));
        }

    }
}