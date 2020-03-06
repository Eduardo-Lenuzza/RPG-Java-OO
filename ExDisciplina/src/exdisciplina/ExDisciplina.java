package exdisciplina;

import javax.swing.JOptionPane;
/**
 * @author Eduardo
 */
public class ExDisciplina {
   
    public static void main(String[] args) {

        Disciplina dis1;
        Disciplina dis2;

        dis1 = new Disciplina(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária prática da 1ª disciplina")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária teórica da 1ª disciplina")),                
                JOptionPane.showInputDialog("Digite o nome da 1ª disciplina"));

        dis2 = new Disciplina();

        dis2.setCarga_horaria_pratica(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária prática da 2ª disciplina")));
        dis2.setCarga_horaria_teorica(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária teórica da 2ª disciplina")));
        dis2.setCarga_horaria_total(dis2.getCarga_horaria_pratica() + dis2.getCarga_horaria_teorica());
        dis2.setNome(JOptionPane.showInputDialog("Digite o nome da 2ª disciplina"));

        while (dis1.equals(dis2)) {
            JOptionPane.showMessageDialog(null, "ERRO! As disciplinas não podem ter o mesmo nome. Digite novamente.", "Alerta", JOptionPane.ERROR_MESSAGE);

            dis1.setNome(JOptionPane.showInputDialog("Digite o nome da 1ª disciplina"));
            dis2.setNome(JOptionPane.showInputDialog("Digite o nome da 2ª disciplina"));
        }
        
        JOptionPane.showMessageDialog(null, "A Disciplina " + dis1.getNome() + " possui as seguintes cargas horárias: " + dis1.toString());
        JOptionPane.showMessageDialog(null, "A Disciplina " + dis2.getNome() + " possui as seguintes cargas horárias: " + dis2.toString());
        
        System.exit(0);
    }
}
