/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Variables
        String nombre_jugador;
        String posicion;
        int edad;
        int acumulador_edad = 0;
        int suma_datos_edad_estatura = 0;
        double estatura;
        double promedio_edad;
        double promedio_estatura;
        double acumulador_estatura = 0;
        String bandera;
        String cadena_acumuladora = " ";
        String cadena_edades = " ";
        String cadena_estaturas = " ";
        String cadena_final;
        String cadena_definitiva;
        int numeracion = 1;
      
        do{
            System.out.println("Ingresar el nombre del jugador: ");
            nombre_jugador = entrada.nextLine();
            System.out.println("Ingresar la posición en la que se desenvuelve"
                    + " el jugador: ");
            posicion = entrada.nextLine();
            System.out.println("Ingresar la edad del jugador(Sin meses): ");
            edad = entrada.nextInt();
            System.out.println("Ingresar la estatura del jugador: ");
            estatura = entrada.nextDouble();
            cadena_edades = String.format("%s%d, ", cadena_edades, edad);
            cadena_estaturas = String.format("%s %.2f"
                                            , cadena_estaturas
                                            , estatura);
            cadena_acumuladora = String.format("%s\n%d. %s -%s-, edad %d, "
                                 + "estatura %.2f"
                                 , cadena_acumuladora
                                 , numeracion
                                 , nombre_jugador
                                 , posicion
                                 , edad
                                 , estatura);
            acumulador_edad = acumulador_edad + edad;
            suma_datos_edad_estatura = suma_datos_edad_estatura + 1;
            acumulador_estatura = acumulador_estatura + estatura;
            numeracion = numeracion + 1;
            System.out.println("¿Desea ingresar más datos de jugadores?");
            entrada.nextLine();
            bandera = entrada.nextLine();
        }while(bandera.equals("Si")||bandera.equals("si")||bandera.equals("SI"));
        promedio_edad = acumulador_edad / suma_datos_edad_estatura;
        promedio_estatura = acumulador_estatura / suma_datos_edad_estatura;
        cadena_final = String.format("Listado de jugadores:\n %s\n"
                                     , cadena_acumuladora); 
        cadena_definitiva = String.format("Listado de edades: %s. "
                + "Promedio de edades: %.2f. Promedio de estaturas: %.2f\n"
                            , cadena_edades
                            , promedio_edad
                            , promedio_estatura);
        System.out.printf("%s\n%s", cadena_final, cadena_definitiva);
    }   
}
