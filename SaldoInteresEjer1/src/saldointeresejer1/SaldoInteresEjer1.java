/*
 * interés del 2% mensual
 * ¿Cuál será el saldo al cabo de 5 años?
 */
package saldointeresejer1;

import javax.swing.JOptionPane;

/**
 *
 * @author alexander
 */
public class SaldoInteresEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valConsignado,valFinal;
        valConsignado = Double.parseDouble(JOptionPane.showInputDialog("Digitar valor Consignacion"));
        if (valConsignado>=0){
        valFinal=valConsignado*Math.pow(1.02, 60);
        JOptionPane.showMessageDialog(null, "Valor en 5 Años es =" + valFinal);
        }else{
            JOptionPane.showMessageDialog(null, "Este valor no es valido");
        }
    }
    
}
