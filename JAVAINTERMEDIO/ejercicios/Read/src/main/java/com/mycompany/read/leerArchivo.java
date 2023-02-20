/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class leerArchivo {
    
    public void leer()throws IOException{
        File archivo=new File("d:\\\\marti\\\\Escritorio\\\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf= new BufferedReader(fr);
        String linea;    
        while ((linea=bf.readLine())!=null){
            System.out.print(linea);
        }
    }
    
    public void leerArchivo2() {
        try{
            leer();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Hay un error");
        }finally{
            System.out.println("Finally");
        }
        System.out.println("Sigue mi programa no se muere");
    }
    
}
