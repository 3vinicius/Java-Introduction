package Animals;

public class Dog {

    public String name;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    public String stateSpirit ;

    public void comer(){}

    public void latir(){
        System.out.println("au Au");
    }


    public String hold(String obj){
        //System.out.printf("You dog, %s, catch %s",this.name,obj);
        return "catch bol";
    }

    public String interation(String action){
//        if(action.equalsIgnoreCase("carinho")){
//            this.stateSpirit = "Happy";
//            this.latir();
//            return this.stateSpirit;
//        } else if(action.equalsIgnoreCase("Bater")){
//            this.stateSpirit = "Bad";
//            this.latir();
//            return this.stateSpirit;
//        } else if(action.equalsIgnoreCase("")){
//            this.stateSpirit = "neutro";
//            this.latir();
//            return this.stateSpirit;
//        }

        switch (action){
            case "carinho":return this.stateSpirit = "Happy";
            case "bater": return this.stateSpirit = "bad";
            default: return this.stateSpirit = "neutro";
        }
    }
}
