/*
 * imprimir los primeros 20 términos de la
   siguiente serie
   1 , 3, 6, 10, 15, 21, 28
 */
package terminosserieejer6;

import javax.swing.JOptionPane;

/**
 *
 * @author alexander
 */
public class TerminosSerieEjer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y=0;
        String resultado="";
        for(int i = 1;i<=20;i++)
        {
        System.out.println(y+i);
        y = y + i;
        resultado = resultado + y + " , ";
        }
        JOptionPane.showMessageDialog(null, "Los veinte primeros terminos de esta serie" + " " + resultado );
    }
    
}
