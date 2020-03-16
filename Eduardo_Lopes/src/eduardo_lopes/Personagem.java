package eduardo_lopes;

import java.util.Objects;

public class Personagem {

    private String name;
    private static int nro_jogadores = 0;
    private boolean poder_de_evocacao;
    private boolean poder_de_voar;
    private int power;
    private int speed;

    public Personagem() {
    }

    public Personagem(String name, boolean poder_de_evocacao, boolean poder_de_voar, int power, int speed) {
        this.name = name;
        this.poder_de_evocacao = poder_de_evocacao;
        this.poder_de_voar = poder_de_voar;
        this.power = power;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNro_jogadores() {
        return nro_jogadores;
    }

    public static void setNro_jogadores(int nro_jogadores) {
        Personagem.nro_jogadores = nro_jogadores;
    }

    public boolean isPoder_de_evocacao() {
        return poder_de_evocacao;
    }

    public void setPoder_de_evocacao(boolean poder_de_evocacao) {
        this.poder_de_evocacao = poder_de_evocacao;
    }

    public boolean isPoder_de_voar() {
        return poder_de_voar;
    }

    public void setPoder_de_voar(boolean poder_de_voar) {
        this.poder_de_voar = poder_de_voar;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
        final Personagem other = (Personagem) obj;
        if (this.poder_de_evocacao != other.poder_de_evocacao) {
            return false;
        }
        if (this.poder_de_voar != other.poder_de_voar) {
            return false;
        }
        if (this.power != other.power) {
            return false;
        }
        if (this.speed != other.speed) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public static String luta(Personagem p1, Personagem p2) {

        String vencedor = "";

        if (p1.isPoder_de_evocacao() == true && p2.isPoder_de_evocacao() == false) {

            vencedor = p1.getName();

        } else if (p1.isPoder_de_evocacao() == false && p2.isPoder_de_evocacao() == true) {

            vencedor = p2.getName();

        } else if (p1.isPoder_de_evocacao() == true && p2.isPoder_de_evocacao() == true
                || p1.isPoder_de_evocacao() == false && p2.isPoder_de_evocacao() == false) {

            if (p1.getPower() > p2.getPower()) {

                vencedor = p1.getName();

            } else if (p1.getPower() < p2.getPower()) {

                vencedor = p2.getName();
            }
        }
        return vencedor;
    }

    @Override
    public String toString() {
        return "{" + "Nome= " + name + " poder_de_evocacao= " + poder_de_evocacao + ", poder_de_voar= " + poder_de_voar + ", power= " + power + ", speed= " + speed + '}';
    }

}
