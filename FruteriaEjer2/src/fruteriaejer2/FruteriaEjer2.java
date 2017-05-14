/*
 * manzanas a $4.200 el kilo.
 * 
 * 
 */
package fruteriaejer2;

import javax.swing.JOptionPane;

/**
 *
 * @author alexander
 */
public class FruteriaEjer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double pagoTotal,valor,descuento,cantidadKilos;
      cantidadKilos = Double.parseDouble(JOptionPane.showInputDialog("Digitar cantidad de  kilos"));
      valor = cantidadKilos*4200;
      if (cantidadKilos<0){
      JOptionPane.showMessageDialog(null, "Cantidad de kilos no es valido");
      }else{
      descuento=0;
      if(cantidadKilos>2)
          descuento =valor*0.1;
      if(cantidadKilos>5)
          descuento = valor*0.15;
      if(cantidadKilos>10)
          descuento = valor*0.2;
      pagoTotal=valor-descuento;
      JOptionPane.showMessageDialog(null, 
              "Los" + " " + cantidadKilos + " " + "Kilos" + "\n" +
              "de manzanas" +  "\n" +
              "por un valor total $" + valor +"\n" +
              "y un descuento de " + descuento + "\n" +
              "y el valor total a pagar es =" +pagoTotal);
              
      }
      
    }
    
}
