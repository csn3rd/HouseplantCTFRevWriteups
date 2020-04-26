import java.util.*;

public class bendy_solve {
    public static void main(String args[]) {
        String fl = "ÄÑÓ¿ÂÒêáøz§è§ñy÷¦";
        String theflag = "";

        int current = fl.length()-1;

        char[] flags = new char[fl.length()/2];
        for (int i = fl.length()/2-1; i >= 0; i--) {
            flags[i] = fl.charAt(current);
            current--;
        }

        for (int i = fl.length()/2-1; i >= 0; i--) {
            flags[i] = (char)((int)flags[i]-20);
        }

        theflag += String.valueOf(flags);
        theflag += fl.substring(0, fl.length()/2);

        String flag = "r34l_g4m3rs_eXclus1v3";

        char[] arr = new char[flag.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = '?';
        }

        current = theflag.length()-1;
        for (int i = flag.length()-1; i >= flag.length()-6; i--) {
            arr[i] = (char)((int)theflag.charAt(current)-(int)flag.charAt(i-3));
            current--;
        }

        for (int i = flag.length()-7; i>= 10; i--) {
            arr[i-8] = (char)((int)theflag.charAt(current)-(int)flag.charAt(i));
            current--;
        }

        for (int i = flag.length()-15; i>= 0; i--) {
            arr[i+8] = (char)((int)theflag.charAt(current)-(int)flag.charAt(i));
            current--;
        }

        System.out.println(new String(arr));
    }
}
