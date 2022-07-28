/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;

/** Beecrowd 1794 - LAVANDERIA
 *
 * @author Jônatas Gomes
 */
import java.util.Scanner;
public class Beecrowd_1794 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int lavadoraMin, lavadoraMax; // Máximo e mínimo de roupas
        int secadoraMin, secadoraMax;
        int roupas;
        Scanner input = new Scanner(System.in);
        do{                                      // Sequência de códigos para "validar" e inicializar variáveis, executará enquanto as variáveis - 
            roupas = input.nextInt();            // não estiverem entre 1 e 100, incluido ambos.
        }while(roupas < 1 || roupas > 100);      
        
        do{
            lavadoraMin = input.nextInt();
        }while(lavadoraMin > 100 || lavadoraMin < 1);
        
        do{
            lavadoraMax = input.nextInt();
        }while (lavadoraMax > 100 || lavadoraMax < 1);
        
        do{
            secadoraMin = input.nextInt();
        }while(secadoraMin > 100 || secadoraMin < 1);
        
        do{
            secadoraMax = input.nextInt();
        }while(secadoraMax > 100 || secadoraMax < 1);
        
        if( (roupas >= lavadoraMin && roupas <= lavadoraMax) && (roupas >= secadoraMin && roupas <= secadoraMax) ){// trecho de código que analisa -
            System.out.println("possivel");  // Se o número de Roupas está entre o número máximo e minimo da lavadora e secadora.
        }else{
            System.out.println("impossivel");
        }
    }
    
}
