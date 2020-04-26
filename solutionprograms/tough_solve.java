import java.util.*;

public class tough_solve {
    public static int[] realflag = {9,4,23,8,17,1,18,0,13,7,2,20,16,10,22,12,19,6,15,21,3,14,5,11};
    public static int[] therealflag = {20,16,12,9,6,15,21,3,18,0,13,7,1,4,23,8,17,2,10,22,19,11,14,5};
    public static HashMap<Integer, Character> theflags = new HashMap<>();
    public static HashMap<Integer, Character> theflags0 = new HashMap<>();
    public static HashMap<Integer, Character> theflags1 = new HashMap<>();
    public static HashMap<Integer, Character> theflags2 = new HashMap<>();
    public static boolean m = true;
    public static boolean g = false;

    public static void main(String args[]) {
        int[] unicode = {157, 157, 236, 168, 160, 162, 171, 162, 165, 199, 169, 169, 160, 194, 235, 207, 227, 210, 157, 203, 227, 104, 212, 202};

        String thefinalflag = "";
        for (int i = 0; i < 24; i++) {
            if (unicode[i] > 155 && unicode[i] < 167 /* && (i != 5 && i != 8) */ ) {
                thefinalflag += (char)(unicode[i]-10);
            } else {
                thefinalflag += (char)(unicode[i]);
            }
        }

        String flag = "ow0_wh4t_4_h4ckr_y0u_4r3";
        createMap(theflags0, flag, g);
        createMap(theflags2, flag, m);

        String theflag = "";
        for (int i = thefinalflag.length()-1; i >= 0; i--) {
            theflag = (char)(((int)thefinalflag.charAt(i))-((int)theflags0.get(i))) + theflag;
        }

        for (int i = theflag.length()-1; i >= theflag.length()-3; i--) {
            theflags1.put(i, theflag.charAt(i));
        }

        for (int i = theflag.length()-4; i >= 0; i--) {
            theflags.put(i, theflag.charAt(i));
        }

        char[] answer= new char[24];
        for (int i = 0; i < 24; i++) {
            answer[i] = '?';
        }

        for (int i = 0; i < 24; i++) {
            if (realflag[i] < 21) {
                answer[i] = theflags.get(realflag[i]);
            }
        }

        for (int i = 0; i < 24; i++) {
            if (therealflag[i] > 20) {
                answer[i] = theflags1.get(therealflag[i]);
            }
        }

        System.out.println(new String(answer));
    }

    public static void createMap(HashMap owo, String input, boolean uwu){
        if(uwu){
            for(int i = 0; i < input.length(); i++){
                owo.put(realflag[i],input.charAt(i));
            }
        } else{
            for(int i = 0; i < input.length(); i++){
                owo.put(therealflag[i],input.charAt(i));
            }
        }
    }
}