/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;

/** Beecrowd 1134 - Tipo de Combustível
 *
 * @author Jônatas Gomes
 */
import java.util.Scanner;
public class Beecrowd_1134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alcool = 0 ,gasolina =0, diesel=0, escolha;
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.print("1-Alcool\n2-Gasolina\n3-Diesel\n4-Sair:\n ");
            do
                escolha = input.nextInt();
            while(escolha < 1 || escolha > 4);
            if (escolha == 4){
                break;
            }
            switch(escolha){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                
            }
            
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
    
}
