package App;

public class Vetor {
    public static void main(String[] args){
        // init vetor how default tam 5 and values empy
        // String[] numbers = new String[5]

        int[] numbers = {9,2,5,6,7,3,5,7,8,4,2,5,8,9,5,124,35658,789,345,56,4325,76};

        int min = 100;
        int max = 0;
        int sum = 0;
        int med;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
            sum += numbers[i];

        }
        med = sum/numbers.length;

        System.out.printf(
                "MIN = %d \n" +
                "MAX = %d \n" +
                "SUM = %d\n" +
                "MED = %d \n",
                min,max,sum,med);


    }
}
