package excarro;

import javax.swing.JOptionPane;
/** 
 * @author Eduardo
 */
public class ExCarro {

    public static void main(String[] args) {

        String ligar, desligar;

        Carro car1 = new Carro(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do 1º carro")), JOptionPane.showInputDialog("Digite a cor"),
                JOptionPane.showInputDialog("Digite a marca"), JOptionPane.showInputDialog("Digite o modelo"));
        Carro car2 = new Carro();

        car2.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do 2º carro")));
        car2.setCor(JOptionPane.showInputDialog("Digite a cor do 2º carro"));
        car2.setMarca(JOptionPane.showInputDialog("Digite a marca do 2º carro"));
        car2.setModelo(JOptionPane.showInputDialog("Digite o modelo do 2º carro"));

        if (car1.equals(car2)) {
            JOptionPane.showMessageDialog(null, "Os dois automóveis possuem o mesmo ano");
        } else {
            JOptionPane.showMessageDialog(null, "Os dois automóveis possuem os anos diferentes");
        }
        JOptionPane.showMessageDialog(null, "O carro " + car1.getModelo() + " possui as seguintes características: " + car1.toString());
        JOptionPane.showMessageDialog(null, "O carro " + car2.getModelo() + " possui as seguintes características: " + car2.toString());
        

        ligar = JOptionPane.showInputDialog("Você deseja ligar o aumtomóvel?");
        ligar = ligar.toUpperCase();

        if (ligar.equals("SIM")) {
            car1.ligar();
            String andar = JOptionPane.showInputDialog("Você deseja andar com o carro?");
            andar = andar.toUpperCase();
            if (andar.equals("SIM")) {
                car1.andar();
                desligar = JOptionPane.showInputDialog("Você deseja desligar o carro?");
                desligar = desligar.toUpperCase();
                if (desligar.equals("SIM")) {
                    car1.desligar();
                } else {
                    car1.andar();
                    JOptionPane.showMessageDialog(null, "Boa viajem!");
                }
            } else {
                desligar = JOptionPane.showInputDialog("Você deseja desligar o carro?");
                desligar = desligar.toUpperCase();
                if (desligar.equals("SIM")) {
                    car1.desligar();
                } else {
                    car1.ligar();
                }
            }
        }
        System.exit(0);
    }
}
