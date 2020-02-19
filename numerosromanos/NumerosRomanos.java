/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class NumerosRomanos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=1;
        while(N>=1 && N<=100){
        System.out.println("Ingrese el numero a convertir");
        N = sc.nextInt();
        System.out.println(Conversor(N));
        }
    }
    
    public static String Conversor(int numero){
        int centenas, decenas, unidades;
        String romano = "";
        centenas = numero/100 % 10;
        decenas = numero/10 % 10;
        unidades = numero % 10;
        
        //centenas
        if(centenas == 9){
            romano = romano + "CM";
        }else if(centenas>=5){
            romano = romano + "D";
            for(int i =6;i<=centenas;i++){
                romano = romano + "C";
            }
        }else if(centenas == 4){
            romano = romano + "CD";
        }else{
            for(int i = 1; i<= centenas;i++){
                romano = romano + "C";
            }
        }
        //decenas
        if(decenas == 9){
            romano = romano + "XC";
        }else if(decenas >=5){
            romano = romano + "L";
            for(int i = 6; i<=decenas;i++){
                romano = romano + "X";
            }
        }else if(decenas == 4){
            romano = romano + "XL";
        }else{
            for(int i = 1;i<=decenas;i++){
                romano = romano + "X";
            }
        }
        //unidades
        if(unidades == 9){
            romano = romano + "IX";
        }else if(unidades >=5){
            romano = romano + "V";
            for(int i = 6; i<=unidades;i++){
                romano = romano + "I";
            }
        }else if(unidades == 4){
            romano = romano + "IV";
        }else{
            for(int i = 1;i<=unidades;i++){
                romano = romano + "I";
            }
        }
        
        return romano;
        
    }
    
}
