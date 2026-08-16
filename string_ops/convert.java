package string_ops;

import java.util.Arrays;

public class convert {
    public static void main(String[] args) {
        String s = "Hello I am Trying To Impove My logic building";
        char arr[] = s.toCharArray();

        for(int i =0; i < arr.length; i++) {
            char ch = arr[i];
            if(ch >= 'a' && ch <= 'z'){
                arr[i] = (char)(arr[i]-32); 
            }else if (ch >= 'A' && ch <= 'Z'){
                arr[i] = (char)(arr[i]+32);
            }
        }
        System.out.println(new String(arr));




        // for(char ch: s.toCharArray()) {
        //     if (Character.isLowerCase(ch)) {
        //         ch = Character.toUpperCase(ch);
        //     }else if (Character.isUpperCase(ch)) {
        //         ch = Character.toLowerCase(ch);
        //     }
        // }
        // System.out.println();
    }
}
