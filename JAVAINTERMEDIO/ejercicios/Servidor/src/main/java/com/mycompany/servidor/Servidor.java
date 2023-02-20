/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor;

import java.io.*;
import java.net.*;

/**
 *
 * @author marti
 */
public class Servidor {
    
    ServerSocket servidor;
    Socket sc;
    
    int puerto=8000;
    DataOutputStream salida;
    DataInputStream entrada;
    
    public void iniciar(){
        
        try{
            servidor=new ServerSocket(puerto);  
            
            sc= servidor.accept();
            
            entrada= new DataInputStream(sc.getInputStream());
            String mensaje= entrada.readLine();
            System.out.println(mensaje);
            salida=new DataOutputStream(sc.getOutputStream());
            salida.writeUTF("Adios, me despido Oscar Atte: Servidor");
            sc.close();
            
        }catch(Exception e){
            System.out.println("Tu error es: "+e);
        }   
    }
}
