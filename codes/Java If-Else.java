import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n%2 != 0) {
            System.out.println("Weird");
        }
        else if (2 < n && n <= 5) {
            System.out.println("Not Weird");
        }
        else if (6 < n && n <= 20) {
            System.out.println("Weird");
        }
        else if (n > 20 && n <= 100) {
            System.out.println("Not Weird");
        }
    }
}
