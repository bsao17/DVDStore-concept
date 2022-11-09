package com.mycompany.repository;

import java.io.*;
import java.util.Scanner;

public class GoLiveMovieRepository implements GoLiveMovieRepositoryInterface {

    FileWriter fileWriter = new FileWriter("C:\\Users\\decli\\Documents\\movieFileDb.txt");
    FileReader file = new FileReader("C:\\Users\\decli\\Documents\\movieFileDb.txt");
    BufferedReader bufferedReader = new BufferedReader(file);


    public GoLiveMovieRepository() throws IOException {
    }


    public void add(){

            try {
                System.out.println("Quel est le nom de votre film et son genre ?");
                Scanner scanner = new Scanner(System.in);
                fileWriter.write(scanner.nextLine());
                fileWriter.close();
                System.out.printf("%s has been stored in movie database", bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
