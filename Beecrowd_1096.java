/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;

/**
 *
 * @author Jônatas Gomes
 */
public class Beecrowd_1096 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =1;
        int j = 7;
        
        for (int c = 1;;c++){
            for (j = 7; j >= 5;j--){
                System.out.printf("I=%d J=%d%n", i,j);
            }
                if (i == 9){
                    break;
                }
                i+=2;
        }
    }
    
}
