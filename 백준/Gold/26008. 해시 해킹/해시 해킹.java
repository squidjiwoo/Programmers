import java.util.Scanner;

public class Main {
    public static void solution(int n, int m){
        long result = 1;
        for(int i = 0 ; i<n-1; i++){
            result = (result * m) % 1000000007 ;
        }
        long ans = result % 1000000007;
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int a= sc.nextInt();
        int h= sc.nextInt();
        solution(n,m);
    }
}