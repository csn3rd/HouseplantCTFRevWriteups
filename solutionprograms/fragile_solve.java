import java.util.*;

public class fragile_solve {
    public static void main(String args[]) {
    	String a = "ÐdØÓ§åÍaèÒÁ¡";
    	String b = "h1_th3r3_1ts_m3";
    	String c = "";
        for (int i = 0; i < 15; i++) {
        	c += (char)((int)a.charAt(i)-(int)b.charAt(i));
        }
        System.out.println((c));
    }
}
