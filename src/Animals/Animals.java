package Animals;

public class Animals {

    static int count;
    protected String name;
    protected String cor;
    protected int altura;
    protected double peso;
    protected int tamanhoDoRabo;
    protected String stateSpirit;

    public Animals(String name, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.name = name;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        count++;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                ", stateSpirit='" + stateSpirit + '\'' +
                '}';
    }

    protected void comer(){}
    protected void dormir(){}

    public void soar(){
        System.out.println("pqp");
    }
}
