//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
         int k = 0;
    while (k < arr.length) {
      if (arr[k] == 0) {

        break;
      } else {
        k = k + 1;
      }
    }

    //finding zeros and immediate non-zero elements and swapping them
    int i = k, j = k + 1;

    while (i < arr.length && j < arr.length) {
      if (arr[j] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;

      }

      j++;

    }
}
}