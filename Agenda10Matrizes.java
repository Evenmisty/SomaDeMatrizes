
package agenda10matrizes;

import javax.swing.JOptionPane;


public class Agenda10Matrizes {

    public static void main(String[] args) {
    // Começando o programa definindo as matrizes
    int a [][] = new int [6][6];
    int b [][] = new int [6][6];
    int c [][] = new int [6][6]; // eu queria q o programa começasse em 1 de vez 0, então coloquei o contador como 1 e defini as matrizes como 6.
    // definindo as variáveis 
    int linha,coluna;
    

    // matriz a
    for (linha = 1; linha < 6; linha ++){
        for (coluna = 1; coluna <6; coluna ++){
       try { // estou testando o try catch apresentado em alguma agenda anterior
        a [linha][coluna] =  Integer.parseInt(JOptionPane.showInputDialog("Entre com o elemento [" + linha + "] [" + coluna  + "] da matriz A"));
       } catch (NumberFormatException error){
           JOptionPane.showConfirmDialog(null, "Elemento inválido, por favor informe um tipo numérico");
           coluna --; // aqui caso o usuario digite errado ele vai decrementar 1 valor 
          } 
        } // fim do for 
      }// fim do for
    
    // matriz b
    for (linha = 1; linha <6; linha++){
        for (coluna = 1; coluna <6; coluna++){
        try { 
        b [linha][coluna] = Integer.parseInt (JOptionPane.showInputDialog ( "Entre com o elemento ["+ linha  + "] ["+ coluna  + "] da matriz B" ));    
  } catch (NumberFormatException error){
           JOptionPane.showConfirmDialog(null, "Elemento inválido, por favor informe um tipo numérico");
           coluna --;
            }
        }// fim do for
    }// fim do for
    
    // matriz c pra efetuar o calculo 
    for  (linha = 1; linha<6; linha++){
        for (coluna = 1; coluna <6; coluna++){
        c [linha][coluna] = a [linha][coluna] + b [linha][coluna];
        }// fim do for
    }// fim do for
    
    // mostrando o resultado da soma para o usuário
    for (linha = 1; linha <6; linha++){
        for (coluna = 1; coluna<6; coluna++) {
            JOptionPane.showMessageDialog(null, "A soma das matrizes é: [" + linha  + "] + [" + coluna  + "] = " + c [linha][coluna]);
        
        }// fim do for
    }// fim do for
    
    
    
    
    }
    
}
