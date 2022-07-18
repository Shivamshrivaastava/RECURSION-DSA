                           Factorial
  1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.
Input Format        
A number n
Output Format
factorial of n

Constraints
0 <= n <= 10
Sample Input
5

Sample Output
120






soloution:-




import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
    int f = factorial(n);
    System.out.println(f);
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int fm1 = factorial(n - 1);
    int f = fm1 * n;
    return f;
  }

}
