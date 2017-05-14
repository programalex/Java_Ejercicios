/*
 * 10 estudiantes presentan un examen de Física
 * cantidad de estudiantes que obtuvieron una calificación menor a 50.
 * cantidad de estudiantes que obtuvieron una calificación de 50 o
   más pero menor que 70.
 * cantidad de estudiantes que obtuvieron una calificación de 70 o
   más pero menor que 80.
 * La cantidad de estudiantes que obtuvieron una calificación de 80 o más.
   La calificación obtenida en el examen de física debe ser entre 1 y 100.
 */
package estudiantecalificacionejer9;
 import javax.swing.JOptionPane;
/**
 *
 * @author Paradigma
 */
public class EstudianteCalificacionEjer9 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i = 0,calificacion = 0 ,cem50 = 0 ,cem70 = 0 ,cem80 = 0 ,ce80mentre1y100 = 0;
    while (i<10) {
        i=i+1;  
             calificacion = (int) Double.parseDouble(JOptionPane.showInputDialog("Digitar la calificacion del alumno "+i));
        
             if (calificacion>0 && calificacion<=100){
                 if (calificacion<50) {
                     cem50=cem50+1;}
                 if (calificacion>=50 && calificacion<70){
                     cem70=cem70+1;}
                 if (calificacion>=70 && calificacion<80) {
                     cem80=cem80+1;}
                 if (calificacion>=80){
                     ce80mentre1y100=ce80mentre1y100+1;}
                 
             } else {
                 i=i-1;
                 JOptionPane.showMessageDialog(null,
                   "Esta calificacion no es clara, Digatar de nuevo la calificacion " );   
                }              
        }
        JOptionPane.showMessageDialog(null,
            "por rango de calificaciones estos son los alumnos "+"\n"+ 
            "Alumnos con calificacion menor a 50 : " + cem50 + "\n" +
            "Alumnos con calificacion entre 50 y menor a 70 : " + cem70 + "\n" +  
            "Alumnos con calificacion mayor o igual a 70 y menor a 80 : " + cem80 + "\n" +
            "Alumnos con calificacion mayor o igual a 80: " + ce80mentre1y100 + "\n"  );
    }
}
