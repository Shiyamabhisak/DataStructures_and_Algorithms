package basics.patterns;

public class Patterns {
    public void pattern1(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public void pattern5(int n){
        for(int i = 1;i <= n;i++){
            for(int j = n - i;j >= 0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern6(int n){
        for(int i = 0;i < n;i++){
            for(int j = 1;j <= n-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void pattern7(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print(" ");
            }

            for(int k = 0;k < (2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern8(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i;j++){
                System.out.print(" ");
            }

            for(int k = 0;k < (2*(n-i))-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern9(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print(" ");
            }

            for(int k = 0;k < (2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < i;j++){
                System.out.print(" ");
            }

            for(int k = 0;k < (2*(n-i))-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern10(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = n-1;i > 0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern11(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
    public void pattern12(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + " ");
            }

            for(int j = 1;j <= n-i;j++){
                System.out.print(" ");
            }

            for(int j = i;j > 0;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void pattern13(int n){
        int x = 1;
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
    public void pattern14(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print((char)(65+j) + " ");
            }
            System.out.println();
        }
    }
    public void pattern15(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print((char)(65+j) + " ");
            }
            System.out.println();
        }
    }
    public void pattern16(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print((char)(65+i) + " ");
            }
            System.out.println();
        }
    }
    public void pattern17(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print(" ");
            }
            char ch = '@';
            for(int k = 0;k < (2*i)-1;k++){
                if(k < i){
                    ch = (char)(ch + 1);
                    System.out.print(ch);
                }
                else{
                    ch = (char)(ch - 1);
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
    public void pattern18(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print((char)(65+n-1-j) + " ");
            }
            System.out.println();
        }
    }
    public void pattern19(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print("*");
            }

            for(int j = 0;j < i;j++){
                System.out.print(" ");
            }

            for(int j = 0;j < n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }

            for(int j = n-1-i;j > 0;j--){
                System.out.print(" ");
            }

            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern20(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }

            for(int j = 1;j <= n-i;j++){
                System.out.print(" ");
            }

            for(int j = i;j > 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1;i < n;i++){
            for(int j = n-i;j > 0;j--){
                System.out.print("*");
            }

            for(int j = 1;j <= i;j++){
                System.out.print(" ");
            }

            for(int j = n-i;j > 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern21(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern22(int n){
        for(int i = 0;i < (2*n)-1;i++){
            for(int j = 0;j < (2*n)-1;j++){
                int x = Math.min(Math.min(Math.min(i,j),(2*n)-2-i),(2*n)-2-j);
                System.out.print(n-x);
            }
            System.out.println();
        }
    }
}
