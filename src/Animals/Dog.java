package Animals;

public class Dog extends Animals{
    //


    //Construsctor

    //Construtor padrão


    public Dog(String name, String cor, int altura, double peso, int tamanhoDoRabo) {
        super(name, cor, altura, peso, tamanhoDoRabo);
    }

    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                ", stateSpirit='" + stateSpirit + '\'' +
                '}';
    }

    /// Metod
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCor() {
        return cor;
    }
    public void SetCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getStateSpirit() {
        return stateSpirit;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer(){}

    @Override
    public void soar(){
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
