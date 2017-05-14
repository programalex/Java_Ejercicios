/* costo de una llamada telefónica , capturar duracion de la llamada
 * Llamada que dure tres minutos o menos tiene un costo de $200.
 * Minuto adicional cuesta $30.
 * 
 */
package costollamadaejer8;

import javax.swing.JOptionPane;

/**
 *
 * @author Paradigma
 */
public class CostoLLamadaEjer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min , minAdicional = 0;
        min = (int) Double.parseDouble(JOptionPane.showInputDialog("Cantidad de Minutos"));
    if (min <  0){
    JOptionPane.showMessageDialog(null, "El tiempo de la llamada no es claro");
       }else{
    if (min <=3){
    JOptionPane.showMessageDialog(null, "El valor de la llamada es = 200");
    }else{
    minAdicional = ((min - 3)*30)+200;
    JOptionPane.showMessageDialog(null,"La llamada duro:"+ min +" " + "Minutos \n" +
            "El valor de la llamada es = $" + minAdicional);
    }
    }
    }
    }
    
    

