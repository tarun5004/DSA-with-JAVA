package string_ops;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        String word = "I love you baby";
        char rev[] = word.toCharArray();

        int left = 0;
        int right = rev.length - 1;

        while(left < right) {
            char temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;

            right --;
            left ++;
        }

        // check palindrome or not 
        String s = new String(rev); // hum esa bhi karskte hai becuse alredy hum 
        // for(char ch: rev) {
        //     s += ch;
        // }
        System.out.println(word.equals(s) ? "palindrome" : "not palidrome");


    // for(int i = word.length()- 1; i >= 0; i--){
    //     System.out.print(word.charAt(i)); //cause hume charAt use nahi karege too humne only index value milegei 
    // }

    }
}
