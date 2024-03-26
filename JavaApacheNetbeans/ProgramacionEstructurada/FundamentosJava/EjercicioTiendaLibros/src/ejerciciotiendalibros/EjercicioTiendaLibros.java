/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotiendalibros;

import java.util.Scanner;

/**
 *
 * @author mainrdsniper09
 */
public class EjercicioTiendaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre:");
        String nombreLibro = sc.nextLine();
        
        System.out.println("Proporciona el id:");
        int id = sc.nextInt();
        
        System.out.println("Proporciona el precio:");
        double precioLibro = sc.nextDouble();
        
        System.out.println("El envio es gratuito: 'Ten en cuenta que debes ingresar si el envio es gratis"
                + "pon true, si no es gratuito pon false'");
        boolean gratuitidad = Boolean.parseBoolean(sc.nextLine());
        
        
        System.out.println(nombreLibro + " #"+id);
        System.out.println("Precio: " + precioLibro);
        System.out.println("Envio gratuito: " + gratuitidad);
    }
    
}
