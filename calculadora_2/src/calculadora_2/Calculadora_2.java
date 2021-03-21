/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_2;

import java.util.Scanner;

/**
 *
 * @author JONATHAN5
 */
public class Calculadora_2 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
    Operacao oper=new Operacao();
    
            
         for(double i=0;i<4;i++){
        System.out.println("1 soma");
        System.out.println("2 subitração");
        System.out.println("3 multiplicação");
        System.out.println("4 divisao ");
    
        System.out.print("Qual operaçao desejada: ");
            double op=ler.nextInt();
    
            System.out.print("digite o primeiro valor: ");
            double n1=ler.nextDouble();
            
           System.out.print("digite o segundo valor"); 
           double n2=ler.nextDouble();
    
        
    if(op==1){
    double R=oper.somar(n1, n2);
        System.out.println("o resultado e: "+R);
    }
    if(op==2){
    double R=oper.subitracao(n1, n2);
        System.out.println("o resultado e:"+R);
    }
    if(op==3){
    double R=oper.multiplicacao(n1, n2);
        System.out.println("o resultado e: "+R);
    }
    
    if (op==4){
        if(n2!=0){
       double R=oper.divisao(n1, n2);
            System.out.println("o resultado e: "+R);
        }
            else{
                    System.out.println("nao e possivel divisao por 0.");
                    }
        }
             System.out.println("");
             System.out.println("");
    }   
    }   
    }
    

