

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ćwiczenia;
import java.util.Scanner;
/**
 *
 * @author Szymon
 */
public class Ćwiczenia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          liczba nowa = new liczba(10);
          liczba nowa1= new liczba();
          Scanner nowy = new Scanner(System.in);
          System.out.println("Podaj liczbe a: ");
          int a = nowy.nextInt();
          
          for (int i = 0;i<a;i++)
              System.out.println(i);
          
         // System.out.println(nowa);
    }
    
   
}

class liczba       
{
  
 liczba(int a)
{
    for (int i=0;i<a;i++)
        System.out.println(i); 
}
 liczba()
{
    String[] alp = {"a","b","c","d","e"};
    for (int i=0;i<alp.length;i++)
    System.out.print(alp[i]);
}

}
