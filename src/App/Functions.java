package App;

public class Functions {
    public static void main(String[] args){
        int num = 20;
        System.out.println(fatorial(num));
    }

    public static long fatorial(int num){
        long result = 1;
        for(int i = 1; i <= num; i++ ){
            result *= i;
        }
        return result;
    }
}
