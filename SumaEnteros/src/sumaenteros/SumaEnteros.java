/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaenteros;
import javax.swing.JOptionPane;
/**
 *
 * @author betty
 */
public class SumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables de entrada
        String primerNumero;
        String segundoNumero;
        
        int numero1;
        int numero2;
        int suma;
        
        primerNumero = JOptionPane.showInputDialog("Escribe el primer entero");
        segundoNumero = JOptionPane.showInputDialog("Escribe el segundo entero");
        
        numero1 = Integer.parseInt(primerNumero);
        numero2 = Integer.parseInt(segundoNumero);
        suma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "La suma de ambos enteros es: " +suma);
    }
    
}