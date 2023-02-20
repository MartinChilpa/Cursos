/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LecturaArchivo {
    
    public void leerTXT() throws FileNotFoundException,IOException{
        
        File archivo =new File("D:\\marti\\Escritorio\\pruebaLectura.txt");
        FileReader fr =new FileReader(archivo);
        BufferedReader bf= new BufferedReader(fr);
        String linea;
      
        while((linea=bf.readLine())!=null){
            System.out.println(linea);
        }   
    }
    
    public void leerTXT2(){
        
        try{
            leerTXT();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error");
//            System.out.println("No se encontró tu archivo");
        }  
            
    }
    
}
