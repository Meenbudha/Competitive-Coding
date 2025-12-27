import java.util.*;


public class StringAscii {

    //     static {
    //     for (int i = 0; i < 333; i++) {
    //         main(""); /* The first few calls of a method in Java run on the interpreter (slow)    By calling scoreOfString("")333 times in a static initializer, you’re basically “warming up” the JIT before LeetCode runs the real test cases. */
    //     }
    // }

    public static void main(String[] args) {
        String s = "hello";
        int diff = 0;
        int sum=0;
        StringBuilder binary = new StringBuilder();

        for(int i = 0; i< s.length()-1; i++){
            int ch1 = (int)s.charAt(i);
            int ch2 = (int)s.charAt(i + 1);
            diff = Math.abs(ch1 - ch2);
            sum += diff;
            System.out.println(diff);
        }
        System.out.println("Sum of all Ascii value : "+sum);
                 

    }
}