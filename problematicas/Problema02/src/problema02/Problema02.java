/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author ronni
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 110;
        int num_inicial = 2;
        int serie = 2;
        int contador = 0;
        String cadena_1 = " ";
        while(num_inicial < limite){
              
        num_inicial = num_inicial + contador;
        cadena_1 = String.format("%s %d", cadena_1, num_inicial);
        serie = serie + 2; 
        contador = serie;
        }
        System.out.println(cadena_1);
    }
    
}
