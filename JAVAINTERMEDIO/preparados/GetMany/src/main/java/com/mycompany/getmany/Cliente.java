/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.getmany;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {
    private String host;
    private int puerto;
    private String mensaje;

    public Cliente(String host,int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
        this.host=host;
    }
    @Override
    public void run() {
        //Puerto del servidor
        DataOutputStream out;
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(host, puerto);
            out = new DataOutputStream(sc.getOutputStream());
            //Envio un mensaje al cliente
            out.writeUTF(mensaje);
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}