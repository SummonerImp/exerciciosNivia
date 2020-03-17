/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.*;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String senha;
          int i = 0;
          Scanner sc = new Scanner(System.in);
          try{
          do{
              System.out.println("Digite a sua senha: ");
              senha = sc.next();
              if (senha.equals("java")){
                 System.out.println("Senha válida =D");
                 return;
            }
            else{
                System.out.println("Senha invalida =(");
                i++;
           }
          } while(i < 3);
                  System.out.println("Cartão cancelado ¯\\_(ツ)_/¯");
          }
          catch(InputMismatchException erro){
              System.out.println(erro);
          }
    }
    
}
