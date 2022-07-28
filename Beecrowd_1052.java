/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;

/** Beecrowd 1052 -  MES
 *
 * @author Jônatas Gomes
 */
import java.util.Scanner;
public class Beecrowd_1052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Digite o número correspondente ao mês desejado (1-12)");
         Scanner scan = new Scanner(System.in);
        int mes;
        do {
            mes = scan.nextInt();
        }while (mes < 1 || mes > 12);
        
        switch(mes){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4: 
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7: 
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }   
    }
    
}
