import java.io.*;
import java.util.*;

public class Hackerrankday7Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float percentage = ((b/a)*(100));
        if (percentage>=75)
        {
            System.out.println((int)percentage);
            System.out.println("Yes");
        }
        else
        {
            System.out.println((int)percentage);
            System.out.println("No");
        }
    }
}