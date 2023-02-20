/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.server_oracle;

import java.util.Scanner;


/**
 *
 * @author marti
 */
public class Server_Oracle{

	public static void main (String[] args){
            int matriz[][];
                
            int i,j;
                
		matriz= new int[4][4];

		for(i=0; i<4;i++){
			for( j=0; j<4;j++){
				matriz[i][j]=(int)(Math.random()*50);

			}
		}
		for(i=0;i<4;i++){
			for(j=0; j<4;j++){
			System.out.println("Matriz["+i+"]["+j+"] es igual a "+matriz[i][j]);

			}
		}


	}
}