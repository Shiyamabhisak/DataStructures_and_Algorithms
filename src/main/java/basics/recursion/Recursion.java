package basics.recursion;

import java.util.LinkedList;
import java.util.List;

public class Recursion {
    final String str = "Coding Ninjas";
    public void printNTimes(int n){
        if(n == 0)return;
        System.out.print(str + " ");
        printNTimes(--n);
    }

    public int[] print1ToNWithoutLoop(int n) {
        int arr[] = new int[n];
        getNos(arr,n);
        return arr;
    }

    public int getNos(int[] arr, int n){
        if(n == 0){
            return 0;
        }
        int x = getNos(arr,--n);
        arr[x] = x+1;
        return x + 1;
    }

    public int[] printNTo1WithoutLoop(int x) {
        int arr[] = new int[x];
        getNos(arr,x, 0);
        return arr;
    }

    public void getNos(int[] arr, int n, int x){
        if(n == 0)return;
        arr[x] = n;
        getNos(arr, --n, ++x);
    }

    public long sumFirstN(long n) {
        if(n == 0)return 0;
        return n + sumFirstN(n-1);
    }

    public List<Long> factorialNumbers(long n) {
        List<Long> list = new LinkedList<>();
        factorialHelper(list,1,1,n);
        return list;
    }

    public List<Long> factorialHelper(List<Long> list, long i, long f, long n){
        if(f * i > n)return list;
        f *= i;
        list.add(f);
        factorialHelper(list,i+1,f,n);
        return list;
    }

    public int[] reverseArray(int n, int []nums) {
        reverseHelper(nums,0,nums.length-1);
        return nums;
    }

    public void reverseHelper(int[] arr, int i, int x){
        if(i>=x)return;
        arr[i] = arr[i] + arr[x];
        arr[x] = arr[i] - arr[x];
        arr[i] = arr[i] - arr[x];
        reverseHelper(arr,i+1,x-1);
    }

    public void isPalindrome(String str) {
        if(checkPalindrome(str, 0, str.length()-1)) System.out.println(str + " is a palindrome.");
        else System.out.println(str + " is not a palindrome.");
    }

    public boolean checkPalindrome(String str, int i, int x){
        if(i>=x)return true;
        if(str.charAt(i) != str.charAt(x))return false;
        return checkPalindrome(str, i+1, x-1);
    }

    public int[] generateFibonacciNumbersTillN(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        if (n > 1) {
            arr[1] = 1;
            fibonacciHelper(arr, 2, n);
        }
        return arr;
    }

    public int[] fibonacciHelper(int[] arr,int i, int n){
        if (i < n) {
            arr[i] = arr[i - 1] + arr[i - 2];
            return fibonacciHelper(arr, i + 1, n);
        }
        else if (i >= n) return arr;
        return fibonacciHelper(arr, i + 1, n);
    }
}
