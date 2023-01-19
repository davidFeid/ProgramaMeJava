/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author PC-Asus
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int casos = Integer.parseInt(lector.nextLine());
       
        String datos[] = null; 
        for(int i= 0; i<casos; i++){

            String entrada = lector.nextLine();
            datos = entrada.split(" ");
            
            int num1 = Integer.parseInt(datos[0]);
            int num2 = Integer.parseInt(datos[1]);
            int num3 = Integer.parseInt(datos[2]);

            if(num1 != 0 && num2 != 0 && num3  != 0 && num1 > -10000 && num1<num2 && num3>num2 && num3 < 10000){
                
                if((num1-num2)>(num3-num2)){
                     System.out.println(num1);
                     
                }else if((num1-num2)==(num3-num2)){
                     System.out.println("EMPATE");
                
                }else{
                     System.out.println(num3);
                }
                        
            }else{
                
                System.out.println("Datos mal");
            }
        }
    }
    
}  
