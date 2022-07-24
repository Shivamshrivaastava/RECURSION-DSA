All Indices Of Array
Sample Input
6
15
11
40
4
4
9
4
Sample Output
3
4




sol:-
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    int x = Integer.parseInt(br.readLine());
    int[] iarr = allIndices(arr, x, 0, 0);

    if (iarr.length == 0) {
      System.out.println();
      return;
    }

    for (int i = 0; i < iarr.length; i++) {
      System.out.println(iarr[i]);
    }
  }

  public static int[] allIndices(int[] arr, int x, int idx, int cnt) {
    if (idx == arr.length) {
      return new int[cnt];
    }
    if (arr[idx] == x) {
      int[]rec = allIndices(arr, x, idx + 1, cnt + 1);
      rec[cnt] = idx;
      return rec;
    } else {
      int[] rec = allIndices(arr, x, idx + 1, cnt);
      return rec;
    }

  }

}