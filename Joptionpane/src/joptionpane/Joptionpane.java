/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;
import javax.swing.JOptionPane;


public class Joptionpane {

    
    public static void main(String[] args) {
//        String nome = JOptionPane.showInputDialog(" Digite o seu nome :");
//        System.out.println("Ola, " + nome + "!");
//         
//        int idade = Integer.parseInt(JOptionPane.showInputDialog(" Digite sua idade :"));
//        System.out.println("Idade: " + idade);
//        
//        float nota = Float.parseFloat(JOptionPane.showInputDialog(" Digite sua nota :"));
//        System.out.println("Nota: "+ nota);
//        
        



//Crie um programa que leia separadamente o nome, sobrenome e a idade de uma pessoa 
//e exiba na tela. Os dados devem ser recolhidos com o método showInputDialog.



//String Nome =JOptionPane.showInputDialog("Digite seu nome :");
//
//String sobreNome =JOptionPane.showInputDialog("Digite seu sobre nome :");
//       
//        
//  int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade :"));
//        System.out.println(" Ola "+ Nome +"  "+ sobreNome +   ", idade:  " + idade + " anos ");
      
        
//        
//  Crie um programa que leia 4 notas e calcule a média aritmética,
//  se a média for maior ou igual a 7 exiba “Aprovado direto” na tela,
//  caso contrário exiba “Exame”. Os dados devem ser recolhidos com o método showInputDialog.

//        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Primeira nota :"));
//        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Segunda nota :"));
//        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Terceira nota :"));
//        float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Quarta nota :"));
//        
//        double media = (nota1 + nota2 + nota3 + nota4)/ 4;
//        
//        if ( media >= 7){
//            System.out.println("Aprovado!");
//        }else{
//            System.out.println("Exame");
//        }
//        
//        Crie um programa que leia um número e exiba a tabuada dele. 
//        Os dados devem ser recolhidos com o método showInputDialog.


// int tab = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
// for ( int i= 1; i <= 10 ; i++){
//     System.out.println( tab  +" x "+ i  +" = " + i*tab);
// }
//    
//Crie um programa que utilizando a instrução while,
//leia números inteiros digitados pelo usuário. 
//A cada número digitado é perguntado se ele deseja digitar mais um, 
//caso a resposta seja sim, continue perguntando os números, 
//caso seja não sai da instrução e exibe a soma dessas número. 
//Utilize o showConfirmDialog para perguntar se deseja sair ou não
//e o showMessageDialog para exibir o resultado.

//int soma = 0;
//int opcao = 0;
//
//while ( opcao == JOptionPane.YES_OPTION){
//    soma += Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero"));
//    opcao = JOptionPane.showConfirmDialog(null," Desseja incluir mais um numero ? ", " Confirmacao", JOptionPane.YES_NO_OPTION);
//            
//}
//   JOptionPane.showMessageDialog(null," Resultado : "+ soma);
//      
//  Crie um programa utilizando a instrução Do While 
//  que leia valores de produtos até que o usuário escolha a opção “não”. 
//  No final exiba a quantidade de valores digitados e a soma dos mesmos.
      

//   
String[]opcoes = {" Correto", "incorreto"};
int opcao = JOptionPane.showOptionDialog(null, "A soma dde 1 + 1 é 2 ?", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

       
               }
    
}
