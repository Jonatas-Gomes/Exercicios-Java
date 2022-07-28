/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceitos.swing.studying;
import java.util.Scanner;
/**
 *
 * @author Jônatas Gomes
 */
public class Beecrowd_1769 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int testes=0;
        do{
            System.out.println("DIGITE O CPF: ");
            String cpf = scan.nextLine();
            int somab1 = 0, somab2=0;
            cpf = cpf.replace(".", ""); // retirando pontuações
            cpf = cpf.replace("-","");//retirando hífens
            char[] arraycpf = cpf.toCharArray(); // transformando a String cpf em um vetor char
            int []numeroscpf = new int[11]; // declaração do vetor de inteiros que receberá o valor númerico de cada caractere do vetor char arraycpf
            cpf = "";
            for(int i = 0; i < arraycpf.length;i++){
                numeroscpf[i]= Character.getNumericValue(arraycpf[i]);//captura o valor númerico indice i do vetor char e atribui no vetor int numeroscpf
            }                                                          // através do metodo getNumericValue da classe wrapper Character.
            for(int j = 0, i = 1, k=9; j < 9; j++,i++,k--){           
                somab1 += numeroscpf[j] * i;  //somab1 recebe o numero no indice j do vetor numeroscpf vezes i, i inicia em 1 e a cada loop
                somab2 += numeroscpf[j] * k;  // é incrementada em mais, assim o primeiro valor sempre é multiplicado por 1, o segundo por dois         
            }                                 // e assim por diantesomab2 funciona de forma semelhante,porém k inicia em 9 e a cada loop vai decrescendo 
                                         //assim, o primeiro valor é multiplicado por 9, o segundo por 8 e assim por diante.
            somab1 = somab1 % 11; // capturamos o resto da divisão de ambas as variaveis por 11
            somab2 = somab2 % 11;
            if(somab1 == 10){   
                somab1=0; 
            }                    //trechos de códigos que verificam se o resto da divisão foi 10, se sim b1 ou b2 recebem 0;
            if(somab2 ==10){
                somab2 =0;
            }
            if(somab1 == numeroscpf[9] && somab2 == numeroscpf[10]){ 
                System.out.println("CPF valido");
            }else{
                System.out.println("CPF invalido");
        }
        testes++;
    }while(testes <= 5);
    }
    
}
