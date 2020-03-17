/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double p, h, m;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite seu peso: ");
            p = sc.nextDouble();
            System.out.println("Digite sua altura: ");
            h = sc.nextDouble();
            m = p/Math.pow(h, 2);
            if(m < 18.5){
                System.out.println("Peso abaixo do normal");
            }
            else if(m>18.5 & m <= 24.4){
                System.out.println("Peso Ideal");
            }
            else if(m>24.4 & m<= 29.9){
                System.out.println("Pré obesidade");
            }
            else if(m>30 & m<= 34.9){
                System.out.println("Obesidade classe 1");
            }
            else if(m>34.9 & m<= 39.9){
                System.out.println("Obesidade classe 2 (Severa)");
            }
            else if(m>39.9){
                System.out.println("Obesidade classe 3 (Mórbida)");
            }
        }
        catch(InputMismatchException erro){
            System.out.println(erro);
        }
    }   
}
