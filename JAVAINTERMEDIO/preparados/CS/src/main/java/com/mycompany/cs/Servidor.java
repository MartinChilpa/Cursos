/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cs;

import java.io.*;
import java.net.*;

/**
 *
 * @author marti
 */
public class Servidor {

    public static void main(String[] args) {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        //puerto de nuestro servidor
        final int PUERTO = 8100;

        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (true) {
                //Espero a que un cliente se conecte
                sc = servidor.accept();
                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                //Leo el mensaje que me envia
                String mensaje = in.readUTF();
                System.out.println(mensaje);
                //Le envio un mensaje
                out.writeUTF("¡Hola mundo desde el servidor!");
                //Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            System.out.println("O"+ex);
        }

    }

}