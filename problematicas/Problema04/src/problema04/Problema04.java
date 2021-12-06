/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author ronni
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador = 1;
        int denominador_negativo = 3;
        int denominador_positivo = 5;
        int limite_negativo = 15;
        int limite_positivo = 13;
        String cadena_preeliminar;
        String cadena_final = " ";
        String simbolo;
        int contador = 3;

        while (contador <= 15) {
            if (denominador_negativo == contador) {
                simbolo = "-";
                cadena_preeliminar = String.format("%s%d/%d",
                        simbolo,
                        numerador,
                        denominador_negativo);
                denominador_negativo = denominador_negativo + 4;
            } else {
                simbolo = "+";
                cadena_preeliminar = String.format("%s%d/%d",
                        simbolo,
                        numerador,
                        denominador_positivo);
                denominador_positivo = denominador_positivo + 4;
            }
            cadena_final = String.format("%s %s",
                    cadena_final,
                    cadena_preeliminar);
            contador = contador + 2;
        }

        System.out.println("1" + cadena_final);
    }

}
