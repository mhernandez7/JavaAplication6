package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplication6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner read = new Scanner(System.in);
        
        Ponderacion n1 = new Ponderacion();
        
        double number1 = 0;
        
        System.out.println("ingrese una nota: ");
        number1 = read.nextDouble();
        
        n1.setPonderacion(number1);
        System.out.println(n1.PondNota());
        
    }
    
}
