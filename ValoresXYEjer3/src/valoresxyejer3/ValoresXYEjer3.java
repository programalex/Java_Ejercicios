/*  Y = x^2 – 2x
 * a) La suma de todos los valores de Y.
 * b) Valores de Y múltiplos de 3.
 * c) Suma de los valores de Y múltiplos de 3.
 * d) Valores de Y cuyo último digito sea 5.
 * e) Suma de los valores de Y cuyo último digito es 5.
 */
package valoresxyejer3;
import javax.swing.JOptionPane;
/**
 *
 * @author alexander
 */
public class ValoresXYEjer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int y, potencial, sum = 0, svmT3 = 0, svtC5=0 ; 
         String vymT3="", vyuC5="";
         
        for(int i=1;i<=10;i++)
        {  
        potencial=(int) Math.pow(i,2);
        y = potencial-2*i;
        sum=sum+y;
        
        if ((y%3==0)&&(y!=0)) {
            vymT3=vymT3+y+",";
            
            svmT3=svmT3+y;
        }
        if ((y%5==0)&& (y%10!=0)) {
            vyuC5=vyuC5+y+",";
            svtC5=svtC5+y;
        }
    }
        JOptionPane.showMessageDialog(null,
                
            "(a)  Suma de  los valores de (Y) = " +sum);
        
        JOptionPane.showMessageDialog(null,
                
             "(b) Valores  (Y) multiplos de 3  = " +vymT3 );
        
        JOptionPane.showMessageDialog(null,
                
            "(c) Suma  los Valores (Y) Multiplos de 3 = " +svmT3 );
         
        JOptionPane.showMessageDialog(null,
                
            "(d)Valores de (Y) donde su ultimo valor es 5 = " +vyuC5 ); 
        
        JOptionPane.showMessageDialog(null,
                
            "(d)Suma los  valores que terminan en 5 = " +svtC5 );
    }
    
}
