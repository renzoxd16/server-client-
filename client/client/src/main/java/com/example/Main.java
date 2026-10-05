package com.example;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        System.out.println("client");
        Socket s = new Socket("127.0.0.1", 3000);


        while (true) {

        System.out.println("inseresci una frase : ");    
        Scanner scanner=new Scanner(System.in);   
        String testo=scanner.nextLine();
        System.out.println(testo);

        }

        
        



    }


}