import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isAnagram(String a, String b) {

        char[] first = a.toLowerCase().toCharArray();
        Arrays.sort(first);

        char[] second = b.toLowerCase().toCharArray();
        Arrays.sort(second);

        a = new String(first);
        b = new String(second);

        return a.equals(b);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
