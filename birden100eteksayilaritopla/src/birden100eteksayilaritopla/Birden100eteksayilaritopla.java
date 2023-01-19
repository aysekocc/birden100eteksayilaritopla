/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birden100eteksayilaritopla;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Birden100eteksayilaritopla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* int toplam =0;
        for (int i = 0; i < 100; i++) {
            toplam=(2*i+1)/2;
            System.out.println(toplam);
            
        }*/
      
            /*int toplam =0;
            for (int i = 1; i <= 100;i= i+2) {
                toplam=toplam+i;
                
                
            
        }
 System.out.println(toplam);*/
            /*int dizi[]={1,2,9,-1,99,4};
            int i=0;
            int sayi=dizi[0];
            while(i<6){
                if(dizi[i]>sayi)
                    sayi=dizi[i];
                i++;
            }
            System.out.println("SAYI="+sayi);*/
            Scanner k=new Scanner (System.in);
            int i=1, a,b;
           
            a =k.nextInt();
            while (i<10){
                System.out.println("Lütfen bir sayı giriniz: ");
                b=k.nextInt();
                if (a>=b){
                    System.out.println("Sıralı Değildir.");
                    break;
                    
                }else{ 
                    a=b;
                
                    
                }
               if(i==9){
                   System.out.println("Sıralıdır ccanum benim");
               }
               i+=1;
            }
          k.close();
            
            
        }
           
            }
    


