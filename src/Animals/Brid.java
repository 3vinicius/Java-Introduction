package Animals;

public class Brid extends Animals{


    public Brid(String name, String cor, int altura, double peso, int tamanhoDoRabo) {
        super(name, cor, altura, peso, tamanhoDoRabo);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Brid.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
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

    @Override
    public String toString() {
        return "Brid{" +
                "name='" + name + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                ", stateSpirit='" + stateSpirit + '\'' +
                '}';
    }
    @Override
    public void soar(){
        System.out.println("cri cri");
    }
}
