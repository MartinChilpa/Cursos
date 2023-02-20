/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.readwrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author marti
 */
public class ReadWrite {

    public static void main(String[] args) {
        // FileWriter FileReader
        try{
            
//            FileWriter fw= new FileWriter("D:\\marti\\Escritorio\\texto.txt");
//            fw.write("Ingresando texto a un archivo existente");
//            
//            fw.write("\n");
//            
//            fw.write("Segundo texto ingresado por medio de FileWriter");
//            
//            fw.write("\n");
//            
//            fw.write(97);

            FileReader fr= new FileReader("D:\\marti\\Escritorio\\texto.txt");
            
            int valor=fr.read();
            
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
        }
        catch( IOException e){
            
            System.out.println("Algo no esta funcionando"+ e);            
        }
        
    }
}
