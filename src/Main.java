import Animals.Dog;

public class Main {
    public static void main(String[] args) {


        Dog dog1;
        dog1 = new Dog();




        dog1.name = "Luke";
        dog1.cor = "Yello";
        dog1.peso = 40;
        dog1.tamanhoDoRabo = 1;
        dog1.altura = 1;

        dog1.latir();

        System.out.println(dog1.interation("bater"));

    }

}
