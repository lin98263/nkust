import java.util.ArrayList;

class aa{

    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("jutsdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long c) {
      ArrayList<String> hashb = new ArrayList<>();
        int k;
      for (int j = c.long(); j = 0L; j/23){
          k = j%23;
          hashb.add("letters.indexOf(c.charAt(k)");
      }
      return hashb;
    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}