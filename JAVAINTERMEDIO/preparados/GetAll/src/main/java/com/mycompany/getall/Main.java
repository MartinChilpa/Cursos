/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.getall;

import java.io.*;
import java.net.*;
public class Main {

ServerSocket servidor;
Socket sc;
int puerto=9000;
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
		salida.writeUTF("Adios mundo");
                sc.close();
                
	}catch( Exception e){
            
        }
}
}
