package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    
    public static void main(String[] args) {
         int nota;
    Scanner Read = new Scanner(System.in);
    
    do {
        System.out.println("Digite uma nota de 0 a 10");
        nota =  Read.nextInt();
        
        if(nota < 0 || nota > 10){
            System.out.println("Dgite um valor validor por favor");}
          
        else{ System.out.println("Voce inseriu um valor valido obrigado");}
  
    }
        while(nota < 0 || nota > 10);
   
    
    
}
}
