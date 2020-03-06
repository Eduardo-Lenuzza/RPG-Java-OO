package excarro;
/**
 * @author alu202012515
 */
public class Carro {

    private int ano;
    private String cor;
    private String marca;
    private String modelo;

    public Carro() {
    }

    public Carro(int ano, String cor, String marca, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.ano != other.ano) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" + "ano= " + ano + ", cor= " + cor + ", marca= " + marca + '}';
    }

    public void andar() {
        System.out.println("   ____        ____  ");
        System.out.println("  |____| ---> |____| --->");
        System.out.println("___0  0 _______0  0______");        
    
    }

    public void desligar() {
        System.out.println("   ____ ");
        System.out.println("  |____|off");
        System.out.println("___0  0 ___");

    }

    public void ligar() {
        System.out.println("   ____ ");
        System.out.println("  |____|on");
        System.out.println("___0  0 ___");

    }

}
