package App;

public class Fibonacci {
    public static void main(String[] args){
        long current = 1;
        long prev = 1;
        long res = 1;
        for (int i = 0; i<=89;i++){
            current = res;
            res += prev;
            prev = current;
            System.out.println(res);
        }
    }
}
