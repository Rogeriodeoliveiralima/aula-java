//
//package aulas;
//
//public class revisao_vetor {
//    public static void main(String args []){
//        int vetor[]= {1,2,3,4};
//        
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println(vetor[i]);
//        }
//        
//        
//    }
//    
//    
//}
//
//

//
//package aulas;
//public class revisao_vetor{
//    public static void main(String args []){
//        
//        
//        int vetor[]= {5,6,7,3,};
//        
//            for (int i = 0; i < vetor.length;i++){
//                System.out.println(vetor[i]);
//            }  
//    }
//}

//package aulas;
//
//public class revisao_vetor{
//    public static void main(String args []){
//        
//        
//        int vetor[]= {987,98,74,21};
//        
//        for (int i=0;  i < vetor.length;i++){
//            
//            System.out.println(vetor[i]);
//        }
//        
//        
//                
//    }
//}

//package aulas;
//
//public class revisao_vetor{
//    public static void main(String args []){
//        
//        int vetor[]= {5,7,8,0,};
//       for (int i = 0;i < vetor.length;i++){
//           
//           System.out.println(vetor[i]);
//       }
//               
//        
//    }
//}

//package aulas;
//
//public class revisao_vetor{
//    
//    public static void main(String args[]){
//        
//     
//        
//        int []vetor = new int [10];
//        int cont  = 1;
//        
//        for (int i = 0;  i <10 ;i++){
//            
//         vetor[i]= cont;
//          cont ++;
//           
//        }
//        
//        for ( int i = vetor.length -1; i >= vetor[0]-1 ;i--){
//            
//         
//        System.out.println(vetor[i]);
//             
//            
//    }
//        
//        
//    }      
//          
//}
//

//package aulas;
//
//import java.util.Scanner;
//
//public class revisao_vetor{
//    
//    public static void main(String args[]){
//        Scanner ler = new Scanner(System.in);
//        
//      int vetor[]={10,4,78,65};
//      
//      
//      for (int i = 0; i < vetor.length;i++){
//          System.out.println(vetor[i]);
//      }
//      
//      
//        System.out.println("***************************");
//        
//       for ( int i= vetor.length-1; i >=  vetor[0]-10;i--)
//            System.out.println(vetor[i]);
//    }
//}
//
//        
//       
//package  aulas;
//
//public class revisao_vetor{
//    public static void main(String args[]){
//     int vetor[]={40,30,05,97};   
//     
//       for(int i= 0; i< vetor.length;i++){
//        System.out.println(vetor [i]);
//    }
//       
//        System.out.println("                                 ");
//        for (int i = vetor.length-1; i >= vetor [0]-40;i--){
//            System.out.println(vetor[i]);
//        }
//    }
//}

//package aulas;
//
//import java.util.Scanner;
//
//public class revisao_vetor{
//    
//    public static void main(String args[]){
//        
//        Scanner ler = new Scanner(System.in);
//        
//        int []vetor = new int[5];
//        int soma = 0;
//        
//        for (int i = 0; i< vetor.length; i++){
//            System.out.println("Digite um numero " + "( " + (i+1)+ "/5): ");
//            
//            vetor[i]+= ler.nextInt();
//            soma += vetor[i];           
//            
//        }
//        System.out.println("Resultado "+ soma);
//        
//    }
//}
//package aulas;
//
//public class revisao_vetor{
//    
//    public static void main(String args[]){
//        int vetor[]={19,30,05};
//    
//        for ( int i= 0; i< vetor.length;i++ ){
//            System.out.println(vetor[i]);
//        }
//        
//        System.out.println("________________________________________");
//        for (int i : vetor){
//            System.out.println(i);
//        }
//        System.out.println("........................................");
//        
//        for (int i = vetor.length -1; i >= vetor[0]-19;i--){
//            System.out.println(vetor[i]);
//        }
//        
package aulas;

import java.util.Scanner;

public class revisao_vetor{
    public static void main(String args[]){
        
        Scanner ler= new Scanner(Sytem.in);
        
    int notas;
        System.out.println("Digite as notas: ");
        notas = ler.nextInt();
        
        float[]vetor = new float[notas];
        float soma = 0;
        
        for ( int i = 0; i < vetor.length;i++){
        System.out.println("Digite as nota " + " (" + (i+1) + "/" + vetor.length + ") :");
        vetor[i]= ler.nextFloat();
        
        }
        System.out.println("___________________________________________");
        
        for (float i: vetor){
            System.out.println(i);
            soma += i;
        }
        System.out.println("____________________________________________");
        
        float media = soma / vetor.length;
        System.out.println(" A media dos Alunos e : "+ media);
   
    }
}
