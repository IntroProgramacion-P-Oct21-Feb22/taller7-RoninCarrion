/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author ronni
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 37;
        int num_inicial = 2;
        int serie = 0;
        int contador = 3;
        String cadena_1 = " ";
        do{
              
        num_inicial = num_inicial + contador;
        cadena_1 = String.format("%s %d", cadena_1, num_inicial);
        contador = contador + 2;
        }while(num_inicial < limite);
        System.out.println(cadena_1);
    }
    
}
