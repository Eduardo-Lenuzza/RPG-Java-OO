package eduardo_lopes;

import javax.swing.JOptionPane;

public class Eduardo_Lopes {

    public static void main(String[] args) {

        Object[] pers = {"cactacae", "vodyanoi", "khepri", "wyrmen", "covid-19"};
        String p1;
        String p2;
        Object selecionadoP1 = JOptionPane.showInputDialog(null, "Escolha o personagem", "Opção", JOptionPane.INFORMATION_MESSAGE, null, pers, pers[0]);
        p1 = selecionadoP1.toString();
        Personagem.setNro_jogadores(+1);

        Object selecionadoP2 = JOptionPane.showInputDialog(null, "Escolha o personagem", "Opção", JOptionPane.INFORMATION_MESSAGE, null, pers, pers[0]);
        p2 = selecionadoP2.toString();

        Personagem.setNro_jogadores(+1);
        Personagem per1 = null, per2 = null;
        switch (p1) {
            case "cactacae":
                per1 = new Personagem("Cactacae", false, false, 9, 6);
                break;
            case "vodyanoi":
                per1 = new Personagem("Vodyanoi", true, false, 7, 7);
                break;
            case "khepri":
                per1 = new Personagem("khepri", false, false, 6, 8);
                break;
            case "wyrmen":
                per1 = new Personagem("Wyrmen", false, true, 7, 8);
                break;
            case "covid-19":
                per1 = new Personagem("Covid-19", true, true, 10, 10);
                break;
        }
        switch (p2) {
            case "cactacae":
                per2 = new Personagem("Cactacae", false, false, 9, 6);
                break;
            case "vodyanoi":
                per2 = new Personagem("Vodyanoi", true, false, 7, 7);
                break;
            case "khepri":
                per2 = new Personagem("khepri", false, false, 6, 8);
                break;
            case "wyrmen":
                per2 = new Personagem("Wyrmen", false, true, 7, 8);
                break;
            case "covid-19":
                per2 = new Personagem("Covid-19", true, true, 10, 10);
                break;
        }
        per1.setName(p1);
        per2.setName(p2);

        JOptionPane.showMessageDialog(null, "Foram criados " + (Personagem.getNro_jogadores() + 1) + " jogadores " + p1 + " e " + p2);
        JOptionPane.showMessageDialog(null, "Atributos dos personagens:\n" + per1.toString() + "\n" + per2.toString());

        if (p1.equals(p2)) {
            JOptionPane.showMessageDialog(null, "Os personagens são iguais!");
        } else {
            JOptionPane.showMessageDialog(null, "Os personagens não são iguais!");
        }
        JOptionPane.showMessageDialog(null, "O vencedor é o personagem: " + Personagem.luta(per1, per2));
    }

}
