import Animals.Brid;
import Animals.Cat;
import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog2 = new Dog("jose","red",30,9.5,2);

        Dog dog1 = new Dog("jose","red",30,9.5,2);

        Brid pap = new Brid("papa","black",0,0,0);

        Cat juju = new Cat("lulu","blue",450,3.5,3);

        System.out.println(pap.toString());
        System.out.println(dog2.toString());
        System.out.println(dog1.getCount());
        System.out.println(juju.toString());


        juju.soar();
        dog1.soar();
        pap.soar();
    }

}
