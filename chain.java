import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.nextInt() > 0 ) {
            // дописать код
            ++count;
        }
        System.out.println(count);
        // я чуть не умер со смеху когда понял что это так просто делается.
        // я сначала пытался придумать что-нибудь через num >=1 потом if ++count else if
    }
}
