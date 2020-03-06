package exlivro;

import java.util.Objects;
/**
 * @author alu202012515
 */
public class Livro {

    private String autor;
    private String isbn;
    private String nome;
    private double valor;

    public Livro() {
    }

    public Livro(String autor, String isbn, String nome, double valor) {
        this.autor = autor;
        this.isbn = isbn;
        this.nome = nome;
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" + "autor= " + autor + ", isbn= " + isbn + ", valor= " + valor + '}';
    }  
    

    public double AumentarValor(double valor) {       
        
        valor = valor + (valor * 0.1);

        return valor;
    }

    public double DiminuirValor(double valor) { 
       
        valor = valor - (valor * 0.1);
        
        return valor;
    }
}
