/*
 * Ejercicio 5
   salario basico 2017 es : 737,716
   Auxilio transporte 2017 es : 48,261
   Comision ventas 2% en las ventas

Total devengado = sueldo devengado + comisión de ventas.
Total deducciones = descuentos por deudas.
Salario Neto = Total devengado – Total deducciones.
 */
package salarionetoejer5;
import javax.swing.JOptionPane;
/**
 *
 * @author alexander
 */
public class SalarioNetoEjer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int id,dias;
        double salario,deven,auxTrans,deuda,ventas,comision = 0, total;
        String nombre;
        
        nombre = (JOptionPane.showInputDialog("Digite Nombre Por Favor")) ;
        id = (int)Double.parseDouble(JOptionPane.showInputDialog("Digitar Numero Cedula"));
        dias = (int)Double.parseDouble(JOptionPane.showInputDialog("Digitar Numero Dias Trabajados"));
    
      if (dias>=0 && dias <=30){
      deven =(int) Double.parseDouble(JOptionPane.showInputDialog("Digitar Devengado En $"));
      if (deven>0){
      salario =(deven*dias)/30;
      if(salario<=1475434){
      auxTrans=(48261*dias/30);
      }else{
          auxTrans=0;
      }
      ventas = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite las Ventas del Trabajador en $"));
      if (ventas >=0){
      comision=ventas*0.02;
      }else{
          JOptionPane.showMessageDialog(null,"este valor no es valido,se  asignara un valor de 0$");
         comision=0; 
      }
      deuda = (int)Double.parseDouble(JOptionPane.showInputDialog("Digitar las Deudas del Empleado en $"));
      if (deuda>0){
      deuda =deuda*1;
      }else{
          JOptionPane.showMessageDialog(null,"Este valor no es valido,se asignara un valor 0$");
          }
      total= salario + comision - deuda;
      JOptionPane.showMessageDialog(null, "Numero Identificacion:" + id + "\n" + 
              "Nombre Empleado:" + nombre + "\n" +
              "Salario Basico:" + deven + "\n" +
              "Auxilio de transporte" + auxTrans + "\n" +
              "Comision por Ventas" + comision + "\n" +
              "Deudas" + deuda + "\n" +
              "Salario Neto Total :$ " + total + "\n" );
      }else{
          JOptionPane.showMessageDialog(null,"Este Valor no es valido Gracias");
      }
      
      }  else{
          JOptionPane.showMessageDialog(null, "Dias no estan en el rango Gracias");
      }
    }
    
}
