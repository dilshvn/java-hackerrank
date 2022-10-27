import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int b = scanner.nextInt();
        scanner.nextLine();
        String c = scanner.next();
        int d = scanner.nextInt();
        scanner.nextLine();
        String e = scanner.next();
        int f = scanner.nextInt();

        System.out.println("================================");
        System.out.printf("%-15s%03d%n",a,b);
        System.out.printf("%-15s%03d%n",c,d);
        System.out.printf("%-15s%03d%n",e,f);
        System.out.println("================================");
    }
}
