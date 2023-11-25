/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author fraferal
 */
public class MuestraFecha {
    
    public static void main(String[] args) {
        
         Date hoy=new Date();
         System.out.println(hoy);
	 System.out.println("Haciendo prueba")
         
         LocalDate today=LocalDate.now();
         System.out.println(today);
         
         LocalDateTime now= LocalDateTime.now();
         System.out.println(now);
                 
    }
}
