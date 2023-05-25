package App;

public class Progam {

    public static void main(String[] args) {
        int a,b,c,d,e;
        int soma,sub;
        float div;

        a=3;
        b=5;
        c=8;
        d=9;
        e=15;

        soma = a+b+c+d+e;
        sub = a-b-c-d-e;
        div = ((a%2)+c)/( (float) d/e);

        System.out.println("Soma, "+soma);
        System.out.println("Sub, "+sub);
        System.out.println("result = "+div);
    }
}
