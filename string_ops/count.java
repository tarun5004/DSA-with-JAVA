package string_ops;

public class count {
    public static void main(String[]args) {
        String s = "hello i am trying to impove my logic building";

        int vowels = 0;
        int space = 0;
        int constant = 0;

        for(char ch: s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels ++;
            }
            else if(ch == ' ') {
                space ++;
            }
            else{
                constant ++;
            }
        }
        System.out.println(
            "space cout:" + space +
            ",vowels count:" + vowels +
            ",constant count:" + constant 
        );
    }
}
