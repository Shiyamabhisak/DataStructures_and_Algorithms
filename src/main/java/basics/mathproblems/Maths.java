package basics.mathproblems;

import java.util.ArrayList;
import java.util.List;

public class Maths {
    public static int countDigits(int n){
        return (int)Math.log10(n) + 1;
    }

    public void reverse(int x) {
        int n = x;
        long reversedNum = 0;
        while(n != 0){
            reversedNum = (reversedNum * 10) + n % 10;;
            n /= 10;
        }
        reversedNum = (reversedNum >= Integer.MIN_VALUE && reversedNum <= Integer.MAX_VALUE) ? (int)reversedNum : 0;
        System.out.println(reversedNum);
    }

    public void printIsPalindromeNumber(int x){
        int num = 0, n = x;
        while(n > 0){
            int rem = n % 10;
            num = (num * 10) + rem;
            n /= 10;
        }
        if(x == num) {
            System.out.println(x + "is a Palindrome number.");
        }
        else{
            System.out.println(x + "is not a Palindrome number.");
        }
    }

    public void printIsArmstrong(int n){
        int count = (int)Math.log10(n) + 1;

        int num = 0, temp = count, x = n;
        while(count-- > 0){
            num += Math.pow(x % 10, temp);
            x /= 10;
        }
        if(n == num){
            System.out.println(n + "is an Armstrong number.");
        }
        else{
            System.out.println(n + "is not an Armstrong number.");
        }
    }

    public void printDivisors(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i == 0)list.add(i);
        }
        list.add(n);
        System.out.println(list);
    }

    public void printIsPrime(int num){
        for(int i = 2;i <= Math.sqrt(num);i++){
            if(num%i == 0) System.out.println(num + "is not a prime number.");;
        }
        System.out.println(num + "is a PRIME number.");
    }
    public int gcd(int a,int b) {
        if(b == 0)return a;
        return gcd(b,a % b);
    }
}
