import java.util.*;

public class breakable_solve {
    public static void main(String args[]) {
        String fl = "ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã";
        String flag = "k33p_1t_in_pl41n";

        char[] arr = new char[flag.length()];

        int current = fl.length()-1;
        for (int i = flag.length()-1; i >= 2; i--) {
            arr[i-2] = (char)((int)fl.charAt(current)-(int)flag.charAt(i));
            current--;
        }

        for (int i = flag.length()-3; i >= 0; i--) {
            arr[i+2] = (char)((int)fl.charAt(current)-(int)flag.charAt(i));
            current--;
        }
        System.out.println(new String(arr));
    }
}
