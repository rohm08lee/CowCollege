import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] cost = new long[N];
        for (int i = 0; i < N; i++) {
            cost[i] = sc.nextLong();
        }
        Arrays.sort(cost);
        long max = 0;
        long p = 0;
        for (int i = 0; i <  cost.length; i++) {
            long money = (long) cost[i] * (cost.length - i);
            long tempprice = cost[i];
            if (money > max) {
                max = money;
                p = tempprice;
            }
            else if (money == max) {
                if (p > tempprice) {
                    p = tempprice;
                }
            }
        }
        System.out.print(max);
        System.out.print(" ");
        System.out.print(p);
    }
}