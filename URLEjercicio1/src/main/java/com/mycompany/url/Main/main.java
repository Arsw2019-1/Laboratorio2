/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.url.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author 2098325
 */
public class main {
    public static void main(String[] args) throws Exception {
    URL pagina = new URL("http://www.google.com/");
   
   try (BufferedReader reader = new BufferedReader(new InputStreamReader(pagina.openStream()))) {
     String inputLine = null;
    while ((inputLine = reader.readLine()) != null) {
     System.out.println(inputLine);
                     
                System.out.println("Miramos el protocolo protocolo :"+pagina.getProtocol());
                System.out.println("Miramos el protocolo Autoridad :"+pagina.getAuthority());                
                System.out.println("Miramos el protocolo host :"+pagina.getHost());                
                System.out.println("Miramos el protocolo puerto :"+pagina.getPort());
                System.out.println("Miramos el protocolo Path :"+pagina.getPath());
                System.out.println("Miramos el protocolo Query :"+pagina.getQuery());                
                System.out.println("Miramos el protocolo File :"+pagina.getFile());                
                System.out.println("Miramos el protocolo Ref :"+pagina.getRef());
     
    }
    
   } catch (IOException x) {
    System.err.println(x);
    
   }
}
}
