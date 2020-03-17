/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v, d;
        int s, c;
        Scanner sc = new Scanner(System.in);
        try{
            do{
            System.out.println("Digite o valor do produto: ");
            v = sc.nextDouble();
            System.out.println("Digite o código do desconto: ");
            c = sc.nextInt();
                switch (c) {
                    case 1:
                        //5%
                        d = v-(0.05*v);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    case 2:
                        //10%
                        d = v-(v/10);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    case 3:
                        //20%
                        d = v-(0.2*v);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    case 4:
                        //50%
                        d = v-(v/2);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    default:
                        System.out.println("Não existe esse código de desconto");
                        break;
                }
            System.out.println("Digite 1 para calcular novamente");
            s = sc.nextInt();
            }while(s == 1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void desconto (double d ,double v){
     //5%
     int c = 0;
     switch (c) {
                    case 1:
                        //5%
                        d = v-(0.05*v);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    case 2:
                        //10%
                        d = v-(v/10);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    case 3:
                        //20%
                        d = v-(0.2*v);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    case 4:
                        //50%
                        d = v-(v/2);
                        System.out.println("O valor com desconto é: " + d);
                        break;
                    default:
                        System.out.println("Não existe esse código de desconto");
                        break;
                }
    }
}