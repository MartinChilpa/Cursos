/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.instre;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author marti
 */
public class InStRe {

    public static void main(String[] args) {
        
//        try{
//        InputStreamReader isr = new InputStreamReader(System.in);
//        
//        int letras= isr.read();
//        System.out.println(isr.ready());
//        System.out.println(letras);
//        letras= isr.read();
//        System.out.println(isr.ready());
//        System.out.println(letras);
//        letras= isr.read();
//        System.out.println(isr.ready());
//        System.out.println(letras);
//        
//        while(isr.ready()){
//            System.out.print((char)letras);
//            letras=isr.read();
//        }
//            
//        }catch(IOException e){
//            System.out.print(e);
//        }
            

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String nombre = "";
//        try {
//            System.out.print("Digite su nombre: ");
//            nombre = br.readLine();
//        } catch (IOException ex) {
//           System.out.println("Error");
//        }
//        
//        System.out.println("Bienvenido, " + nombre);
//        
//        InputStreamReader isr=new InputStreamReader(System.in);
//        BufferedReader flujo =new BufferedReader(isr);
//        
//        float valor;
//        try{
//            valor=Float.parseFloat(flujo.readLine());
//             System.out.println(valor);
//        }catch(IOException e){
//            System.out.println(e);
//        }

//        try{
//            FileOutputStream fos= new FileOutputStream("D:\\marti\\Escritorio\\binario.txt");
//            String texto="Esto se convertirá a binario";
//            
//            byte binarios[]=texto.getBytes();
//            
//            System.out.println(binarios[0]);
//            
//            for(Byte k: binarios){
//                System.out.println(k);
//            }           
//            fos.write(binarios);
//            
//        } catch(IOException e){
//            
//        }
//        
//        
//                try{
//            FileOutputStream fos= new FileOutputStream("D:\\marti\\Escritorio\\binario.txt");
//            String texto="Esto se convertirá a binario";
//            
//            byte binarios[]=texto.getBytes();
//            
//            System.out.println(binarios[0]);
//            
//            for(Byte k: binarios){
//                System.out.println(k);
//            }           
//            fos.write(binarios);
//            
//        } catch(IOException e){
//            
//        }
                
        try{
            FileInputStream fis= new FileInputStream("D:\\marti\\Escritorio\\fail.png");
            
            int valor=fis.read();
            
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fis.read();
            }
                   
        } catch(IOException e){
            
        }
        
        
        
        
       
        
        

        

    }
}
