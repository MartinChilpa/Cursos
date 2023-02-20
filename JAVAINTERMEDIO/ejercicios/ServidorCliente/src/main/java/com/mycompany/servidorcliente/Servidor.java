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
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        ServerSocket servidor;
        Socket sc;
        DataInputStream in;
        DataOutputStream out;       
        int PUERTO=8000;
        
        try{
            servidor=new ServerSocket(PUERTO);
            System.out.println("Servidor inicializado");
            
            while(true){
                sc=servidor.accept();
                System.out.println("Cliente Conectado");
                in=new DataInputStream(sc.getInputStream());
                out=new DataOutputStream(sc.getOutputStream());
                String mensaje= in.readUTF();
                System.out.println(mensaje);
                out.writeUTF("Hola soy el servidor");
                sc.close();
                System.out.println("Cliente desconectado");
                       
            }            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
     
    }
    
}
