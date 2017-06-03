/**
 * @(#)UsaCalculadora.java
 *
 *
 * @author 
 * @version 1.00 2017/6/3
 */
import java.util.Scanner;
public class UsaCalculadora {
        
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        calc.setN1(leia.nextDouble());
        calc.setN2(leia.nextDouble());
        System.out.println(calc.soma());
        
    }
}
