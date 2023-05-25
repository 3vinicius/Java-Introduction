package App;

public class MutTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.printf("\n===== Table Mult %d ====\n",i);
            for (int j = 0; j <=10 ; j++){
                int result = i*j;
                System.out.printf("%d X %d = %d \n",i,j,result);
            }
        }
    }
}
