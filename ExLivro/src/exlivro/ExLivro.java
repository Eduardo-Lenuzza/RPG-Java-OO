package exlivro;

import javax.swing.JOptionPane;
/**
 * @author Eduardo
 */
public class ExLivro {

    public static void main(String[] args) {

        Object[] pagamento = {"Boleto", "Crédito 1X", "Crédito parcelado"};
        double valor_final;
        String valor_descontado;

        Livro liv1 = new Livro();

        liv1.setAutor(JOptionPane.showInputDialog("Digite o nome do autor do 1º livro"));
        liv1.setAutor(liv1.getAutor().toUpperCase());
        liv1.setIsbn(JOptionPane.showInputDialog("Digite o isbn do 1º livro"));
        liv1.setNome(JOptionPane.showInputDialog("Digite o nome do 1º livro"));
        liv1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1º livro")));

        Livro liv2 = new Livro(JOptionPane.showInputDialog("Digite o nome do autor do 2º livro"), JOptionPane.showInputDialog("Digite o isbn do 2º livro"),
                JOptionPane.showInputDialog("Digite o nome do 2º livro"), Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2º livro")));
        liv2.setAutor(liv2.getAutor().toUpperCase());

        if (liv1.equals(liv2)) {
            JOptionPane.showMessageDialog(null, "Os livros são do mesmo autor.");
        } else {
            JOptionPane.showMessageDialog(null, "Os livros são de autores diferentes.");
        }

        JOptionPane.showMessageDialog(null, "O livro " + liv1.getNome() + " possui os seguintes dados: " + liv1.toString());
        JOptionPane.showMessageDialog(null, "O livro " + liv2.getNome() + " possui os seguintes dados: " + liv2.toString());

        Object selecionado = JOptionPane.showInputDialog(null, "Escolha a forma de pagamento. ", "Opções", JOptionPane.INFORMATION_MESSAGE, null, pagamento, pagamento);

        valor_final = liv1.getValor() + liv2.getValor();

        if (selecionado.equals("Boleto")) {

            valor_descontado = String.format("R$%.2f", liv1.DiminuirValor(valor_final));

            JOptionPane.showMessageDialog(null, "O valor dos dois livros deu " + valor_descontado);
        } else if (selecionado.equals("Crédito 1X")) {

            valor_descontado = String.format("R$%.2f", valor_final);

            JOptionPane.showMessageDialog(null, "O valor dos dois livros deu " + valor_descontado);
        } else {

            valor_descontado = String.format("R$%.2f", liv1.AumentarValor(valor_final));

            JOptionPane.showMessageDialog(null, "O valor dos dois livros deu " + valor_descontado);
        }

        System.exit(0);
    }

}
