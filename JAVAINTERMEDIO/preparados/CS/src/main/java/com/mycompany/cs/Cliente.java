/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cs;

import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args) {
        //Host del servidor
        final String HOST = "192.168.0.16";
        //Puerto del servidor
        final int PUERTO = 9000;
        DataInputStream in;
        DataOutputStream out;
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            //Envio un mensaje al cliente
            out.writeUTF("¡Hola mundo desde el cliente!");
            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            sc.close();
        } catch (IOException ex) {
            System.out.println("J"+ex);
        }
    }

}
