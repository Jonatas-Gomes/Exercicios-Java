/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;

/**Beecrowd 1155 - Ultrapassando Z
 *
 * @author Jônatas Gomes
 */
import java.util.Scanner;
public class Beecrowd_1150 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, z,soma,cont;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor de x");
        x = input.nextInt();
        cont = 1; 
        do{
            System.out.println("Entre com o valor de z");    // Loop executará enquanto Z for menor que X
            z = input.nextInt();    
        }while (z <= x); 
        soma = x;       // Soma recebe o valor inicial de x
        while (soma < z){ // executa enquanto soma for menor que z
            x ++;  // a cada loop, x é incrementado em 1
            soma += x; // soma recebe o novo valor de x;
            cont++;  // contabilizada mais uma soma
        }
        System.out.println(cont);
    }
    
}
