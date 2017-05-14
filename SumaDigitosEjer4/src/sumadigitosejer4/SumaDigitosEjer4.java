/*
 * Ejercicio 4 
 */
package sumadigitosejer4;
import javax.swing.JOptionPane;
/**
 *
 * @author alexander
 */
public class SumaDigitosEjer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0, num;
        num = (int) Double.parseDouble(JOptionPane.showInputDialog("ingresar el numero"));
        if (num>=0){
            int auxiliar = num;
            while (num !=0){
                sum = sum + (num%10);
                num = num /10;
            }
       JOptionPane.showMessageDialog(null, "la suma de los digitos" +" " + auxiliar + " es = " +" " +sum);
        }else{
            JOptionPane.showMessageDialog(null, "ese valor no es valido");
        }
    }
    
}
