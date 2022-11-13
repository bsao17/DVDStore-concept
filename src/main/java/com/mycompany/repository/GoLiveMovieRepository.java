package com.mycompany.repository;

import java.io.*;
import java.util.Scanner;

public class GoLiveMovieRepository implements GoLiveMovieRepositoryInterface {

    File file = new File("C:\\Users\\decli\\Documents\\movieFileDb.txt");
    FileWriter fileWriter;

    {
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(){
            try {
                System.out.println("Quel est le nom de votre film et son genre ?");
                Scanner scanner = new Scanner(System.in);
                fileWriter.write(scanner.nextLine());
                fileWriter.close();
                System.out.println("Movie has been stored in movie database");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
