/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;

/**  Beecrowd 1238 - COMBINADOR
 *
 * @author Jônatas Gomes
 */
import java.util.Scanner;
public class Beecrowd_1238 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade desejada de testes: ");
        int testes = Integer.parseInt(scan.nextLine());
        for(int j=0; j < testes; j++){
        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scan.next(); // Captura da primeira palavra
        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scan.next(); // Captura da segunda palavra
        char [] palavra1v = palavra1.toCharArray(); //Nessas duas linhas de código, vemos a criação de dois vetores char para cada String
        char [] palavra2v = palavra2.toCharArray(); // Com o intuito de abrigar a conversão das String em vetor char através do método toCharArray.
        String combinado=""; // variável que receberá a concatenação das palavras.
        int maior;
        if(palavra1v.length > palavra2v.length){
            maior = palavra1v.length;      // maior receberá o tamanho da maior palavra entre as duas. 
        }else{                             // o objetivo é usar no loop, evitando a exception IndexOutOfBounds. Garantindo que ambos os vetores
            maior = palavra2v.length;      //sejam percorridos inteiramente.
        }
        for (int i=0;i < maior;i++){      
            if(i< palavra1v.length){   // A cada loop a variável "combinado" é acrescida da letra que está na posição i do vetor, sendo a variavel i
                combinado += palavra1v[i];  //  a posição atual do loop.
                
            }
            if(i < palavra2v.length){ 
                combinado +=palavra2v[i];
                
            }
        }
        
        System.out.println(combinado);
       }
    }
    
}
