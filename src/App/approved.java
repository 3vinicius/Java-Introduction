package App;

public class approved {
    public static void main(String[] args){
        int nota = -1;
        String notaL = "";


        if(nota >= 80 ){
            notaL = "A";
        } else if (nota < 80 && nota >=70) {
            notaL = "B";
        } else if (nota < 70 && nota>=60) {
            notaL = "C";
        } else if (nota < 60 && nota>=0){
            notaL = "D";
        }

        switch (notaL){
            case "A":
            case "B":
                System.out.println("student is approved. note is ");
                break;
            case "C":
            case "D":
                System.out.println("student is not approved, should do make-up work. note is ");
                break;
            default:
                System.out.println("note is invalid");
        }
    }
}
