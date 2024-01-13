import java.util.*;

class ProgramToRun{
    /*
     * Memoization approach
     */
    String Name = "Harshit";
    public static Map<Integer,Long> memo = new HashMap<>();

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    void printName(String N){
        this.Name = N;
    }

    public static long opt_fib(int n){
        if(n<=1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        long fibVal = opt_fib(n-1) + opt_fib(n-2);
        memo.put(n,fibVal);
        return fibVal;
    }

}

class ProgramToRun2{
    /*
     * Tabulation approach
     * No recurrsion involved
     */
    public static long Tabfib(int n){
        long fib[] = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static long Opt_Tabfib(int n){
        long num1 = 0;
        long num2 = 1;
        long newnum;

        for(int i=2; i <=n; i++){
            newnum = num1 + num2;
            num1 = num2;
            num2 = newnum;
        }
        return num2;
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        //int num = 100;
        //System.out.println("Fibonacci by DP : " + ProgramToRun.opt_fib(num));
        //System.out.println("Fibonacci by Recurrsion : " + ProgramToRun.fib(num))

        //System.out.println("Fibonacci for Tab : " + ProgramToRun2.Tabfib(num));
        //System.out.println("Fibonacci for Tab : " + ProgramToRun2.Opt_Tabfib(num));

        ProgramToRun obj = new ProgramToRun();
        obj.printName("SHISHIR");
        System.out.println(obj.Name);
    }
    
}
