/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miclasefile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiClaseFIle  {

    public static void main(String[] args)throws IOException  {
//        File archivo= new File("D:\\marti\\Documents\\TxtCreado.txt");
//        File archivo2= new File("TxtCreado2.txt");
//        File carpeta= new File("D:\\marti\\Documents\\CarpetaJAVA");
//        
//        
//        archivo2.createNewFile();        
//        archivo.createNewFile();
//        carpeta.mkdir();        
//        
//        //EXISTENCIA DE OBJETO FILE
//        System.out.println("Comprobando existencia de mis ficheros");
//        System.out.println("Txt "+archivo.exists());
//        System.out.println("Txt "+archivo2.exists());
//        System.out.println("Carpeta: "+carpeta.exists());
//        
//        //CARPETO O ARCHIVO?
//        System.out.println("Es un directorio o carpeta?");
//        System.out.println("Txt "+archivo.isDirectory());
//        System.out.println("Carpeta: "+carpeta.isDirectory());
//        
//        //ES UN ARCHIVO O FICHERO
//        System.out.println("Es un ARCHIVO?");
//        System.out.println("Txt "+archivo.isFile());
//        System.out.println("Carpeta: "+carpeta.isFile());
//        
//        //RUTA ABSOLUTA
//        System.out.println("RUTAS ABSOLUTAS");
//        System.out.println("Txt "+archivo.getAbsolutePath());
//        System.out.println("Carpeta: "+carpeta.getAbsolutePath());
//        System.out.println("Txt2 "+archivo2.getAbsolutePath());

//        System.out.print("Ingresa tu nombre: ");
//        InputStreamReader isr = new InputStreamReader(System.in);
//        int letras= isr.read();
//        
//        System.out.print(letras);
//        System.out.print((char)letras);
//        System.out.println(isr.ready());
//        
//        letras= isr.read();
//        System.out.print(letras);
//        System.out.print((char)letras);
//        System.out.println(isr.ready());
//        
//        while(isr.ready()){
//            //System.out.print(letras);
//            System.out.print((char)letras);
//            letras = isr.read();
//        } 

//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        
//        System.out.print("Ingrese su nombre");
//        String nombre=br.readLine();
//        
//        System.out.println("Bienvenido "+nombre);
//        
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader flujo=new BufferedReader(isr);
//        
//        System.out.print("Ingresa tu edad: ");
//        
//        int edad=Integer.parseInt(flujo.readLine());  
//        
//        System.out.println("Tu edad es: "+edad);        



//        try{
//            FileOutputStream fos= new FileOutputStream("D:\\marti\\Escritorio\\binario.txt");
//            
//            String texto="Esto se convertirá a binario";
//            
//            byte binarios []=texto.getBytes();
//            
//            System.out.println(binarios[0]);
//            
//            for(Byte k: binarios){
//                System.out.println(k);
//            }           
//            fos.write(binarios);
//            
//        } catch(IOException e){
//            System.out.println("ERROR");    
//        }
                
        try{
            FileInputStream fis= new FileInputStream("D:\\marti\\Escritorio\\fail.png");
            
            int valor=fis.read();
            
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fis.read();
            }
                   
        } catch(IOException e){
            System.out.println("ERROR"); 
        }
    }
}
