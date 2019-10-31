import java.io.*;
import java.util.*;

public class KamaliExtraCredit {
    public static void main(String[] args) throws IOException{
        String inFile = "test/KamaliExtraCredit.txt";
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        HashMap<Character, Integer> map = new HashMap<>();
        // or map = new HashMap<Character, Integer> if you are using something before Java 7.
        map.put('a', 13);
        map.put('b', 14);
        map.put('c', 15);
        map.put('d', 16);
        map.put('e', 17);
        map.put('f', 18);
        map.put('g', 19);
        map.put('h', 20);
        map.put('i', 21);
        map.put('j', 22);
        map.put('k', 23);
        map.put('l', 24);
        map.put('m', 25);
        map.put('n', 26);
        map.put('o', 1);
        map.put('p', 2);
        map.put('q', 3);
        map.put('r', 4);
        map.put('s', 5);
        map.put('t', 6);
        map.put('u', 7);
        map.put('v', 8);
        map.put('w', 9);
        map.put('x', 10);
        map.put('y', 11);
        map.put('z', 12);

        for (int j=0;j<58111;j++){
            String word = null;
            word = br.readLine();
            int total = 0;
            for (int i = 0; i < word.length(); i++) {
                if (i == 0) {
                    total = 0;
                }
                total += map.get(word.charAt(i));

            }
            if (total == 31){
                System.out.println("31: " + word);
            }
            else if (total == 64){
                System.out.println("64: " + word);
            }

        }
    }
}
