package exdisciplina;

import java.util.Objects;
/**
 * @author alu202012515
 */
public class Disciplina {

    private int carga_horaria_pratica;
    private int carga_horaria_teorica;
    private int carga_horaria_total;
    private String nome;

    public Disciplina() {
    }

    public Disciplina(int carga_horaria_pratica, int carga_horaria_teorica, String nome) {
        this.carga_horaria_pratica = carga_horaria_pratica;
        this.carga_horaria_teorica = carga_horaria_teorica;
        this.carga_horaria_total = carga_horaria_pratica + carga_horaria_teorica;
        this.nome = nome;
    }

    public int getCarga_horaria_pratica() {
        return carga_horaria_pratica;
    }

    public void setCarga_horaria_pratica(int carga_horaria_pratica) {
        this.carga_horaria_pratica = carga_horaria_pratica;
    }

    public int getCarga_horaria_teorica() {
        return carga_horaria_teorica;
    }

    public void setCarga_horaria_teorica(int carga_horaria_teorica) {
        this.carga_horaria_teorica = carga_horaria_teorica;
    }

    public int getCarga_horaria_total() {
        return carga_horaria_total;
    }

    public void setCarga_horaria_total(int carga_horaria_total) {
        this.carga_horaria_total = carga_horaria_total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" + "carga_horaria_pratica= " + carga_horaria_pratica + ", carga_horaria_teorica= " + carga_horaria_teorica + ", carga_horaria_total= " + carga_horaria_total + '}';
    }

}
