/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;
import java.util.Scanner;

/** Beecrowd 1028 - FIGURINHAS
 * 
 * @author Jônatas Gomes
 */
public class Beecrowd_1028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int testes;
        int F1,F2; // quantidade de figurinhas de cada jogador.
        System.out.println("Entre com a quantidade de testes: ");
        Scanner scan = new Scanner(System.in);
        testes = scan.nextInt();
        for (int j = 0; j < testes; j++){
            System.out.println("Quantidade de Figurinhas de Fulano: ");
            F1 = scan.nextInt();
            System.out.println("Quantidade de Figurinhas de Beltrano");
            F2 = scan.nextInt();
        if (F1 > F2){ // Para o programa funcionar, o dividendo deve receber o maior valor e o divisor o menor.
            calculaMDC(F1, F2); // Esta verificação é feita nesse trecho de código que analisa qual das duas variaveis entradas é maior.
        }else{                  // Sendo assim, os parâmetros passados na chamada do método irão divergir a depender de qual variável é maior. 
            calculaMDC(F2,F1);
        }
       }
    }
  public static void calculaMDC (int dividendo, int divisor){ // Método estático implementando solução utilizando do algoritmo Euclidiano.
      int resto;
      do{
          resto = dividendo % divisor; // Primeiramente, calculamos o resto da divisão do dividendo pelo divisor.
          dividendo = divisor;  // Na próxima etapa, o dividendo recebe o valor do divisor, logo o dividendo agora guarda o valor do divisor.
          divisor = resto; //  O divisor,por sua vez, recebe o valor do resto.
      } while (resto !=0); //O Programa irá executar essa sequência de passos até que o resto seja 0(divisão exata), consequentemente achando o MDC.
      int mdc = dividendo;
      System.out.println("Tamanho máximo de pilha: "+mdc);
  }
    
}
