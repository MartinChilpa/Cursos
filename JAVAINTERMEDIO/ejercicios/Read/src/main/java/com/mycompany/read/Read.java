/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.read;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) throws FileNotFoundException, IOException  {
        
        File archivo=new File("d:\\\\marti\\\\Escritorio\\\\texto.txt");
        FileReader fr = new FileReader(archivo);
       
        BufferedReader bf= new BufferedReader(fr);
        
        String linea;
        
        while ((linea=bf.readLine())!=null){
            System.out.print(linea);
        }

        int num=5,num2=0,res;
        
        res=num/num2;


        leerArchivo p1=new leerArchivo();
        
        p1.leerArchivo2();
        
        int ar [] = new int [2];
                   
           try{
               ar[3]=9;
              
           }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("A"+e);
           }
         
          Scanner entrada=new Scanner(System.in);
          
          System.out.print("Introduce tu edad");
          int edad=entrada.nextInt();
          
          try{
                String my=null;
          
          System.out.println(my.length());
          }catch (NullPointerException e){
              
             System.out.println("Mal") ;             
          }
          
        
        
            
       
        
        
        

    }
    
    
    
    
}
