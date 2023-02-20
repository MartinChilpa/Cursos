/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.servidorcliente;

import java.io.*;
import java.net.*;

/**
 *
 * @author marti
 */
public class Cliente {

    
    public static void main(String[] args) {
        
        String HOST="192.168.0.16";
        int PUERTO =8000;
        DataInputStream in;
        DataOutputStream out;  
        
        try{
            
            Socket sc= new Socket(HOST,PUERTO);
            in=new DataInputStream(sc.getInputStream());
            out=new DataOutputStream(sc.getOutputStream());
            
            out.writeUTF("Hola soy el cliente!");
            
            String mensaje= in.readUTF();
            System.out.println(mensaje);
            
            sc.close();
            
        }catch( Exception e){
            System.out.println(e);
        }       
    }
    
}
