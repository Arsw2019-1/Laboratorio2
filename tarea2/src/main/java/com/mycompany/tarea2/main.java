/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea2;
import com.mycompany.url.Main.Cliente.Cliente;
import com.mycompany.url.Main.Server.Server;
import java.io.*;
import java.net.*;

import java.util.Scanner;
/**
 *
 * @author 2098325
 */
public class main {
    
    
      public static void main(String[] args) throws Exception {
        Scanner entrada ;
          System.out.println("Ingrese la pagina web a consultar");
        entrada= new Scanner(System.in);
          //Server s=new Server();
          //Cliente c=new Cliente();
         
        String nombre;
        nombre = entrada.nextLine();
          
          
          
         System.out.println("la entrada es+:"+ nombre);
          
      
      
      }
      
    
}
