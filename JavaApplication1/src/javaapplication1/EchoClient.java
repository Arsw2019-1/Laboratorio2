/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.net.*;
public class EchoClient {
 public static void main(String[] args) throws IOException {
  Socket echoSocket = null;
  PrintWriter out = null;
  BufferedReader in = null;
     System.out.println("Ingerse un numero del cliente");
  try {
   echoSocket = new Socket("127.0.0.1", 35020);
   out = new PrintWriter(echoSocket.getOutputStream(), true); in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

  } catch (UnknownHostException e) {
   System.err.println("Don’t know about host!.");
   System.exit(1);
  } catch (IOException e) {
   System.err.println("Couldn’t get I/O for " + "the connection to: localhost.");
   System.exit(1);
  }
  BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));
  String userInput;

  while ((userInput = stdIn.readLine()) != null) {
      
   out.println(userInput);
   System.out.println("echo: " + in .readLine());
   System.out.println("Ingerse un numero del cliente");

  }
  out.close(); in .close();
  stdIn.close();
  echoSocket.close();

 }}