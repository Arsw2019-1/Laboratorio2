/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author 2098325
 */
public class main {

    public static void main(String[] args) throws Exception {
        Scanner entrada;
        System.out.println("Ingrese la pagina web a consultar");
        entrada = new Scanner(System.in);
        //Server s=new Server();
        //Cliente c=new Cliente();

        String nombre;
        nombre = entrada.nextLine();

        System.out.println("la entrada es+:" + nombre);
//  http:google.com
        URL pagina = new URL(nombre);
        FileWriter flwriter = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pagina.openStream()))) {
            String inputLine = null;
            flwriter = new FileWriter("src/main/java/com/prueba.html");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);

                System.out.println("Miramos el protocolo protocolo :" + pagina.getProtocol());
                System.out.println("Miramos el protocolo Autoridad :" + pagina.getAuthority());
                System.out.println("Miramos el protocolo host :" + pagina.getHost());
                System.out.println("Miramos el protocolo puerto :" + pagina.getPort());
                System.out.println("Miramos el protocolo Path :" + pagina.getPath());
                System.out.println("Miramos el protocolo Query :" + pagina.getQuery());
                System.out.println("Miramos el protocolo File :" + pagina.getFile());
                System.out.println("Miramos el protocolo Ref :" + pagina.getRef());
                bfwriter.write("Protocolo+ "+pagina.getProtocol()+"Autoridad "+pagina.getAuthority()+"host "+pagina.getHost()+"Path "+pagina.getPath()+"Query "+ pagina.getQuery()+"File"+pagina.getFile()+"Ref "+ pagina.getRef());
System.out.println("Archivo creado satisfactoriamente..");
            }
            bfwriter.close();
        } catch (IOException x) {
            System.err.println(x);

        }

    }

}
