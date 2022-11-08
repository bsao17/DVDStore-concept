package com.mycompany.repository;

import java.io.*;
import java.util.Scanner;

public class GoLiveMovieRepository implements GoLiveMovieRepositoryInterface {

    FileWriter fileWriter = new FileWriter("C:\\Users\\decli\\Documents\\movieFileDb.txt");

    public GoLiveMovieRepository() throws IOException {
    }

    @Override
    public void add(){

            try {
                System.out.println("Quel est le nom de votre film et son genre ?");
                Scanner scanner = new Scanner(System.in);
                fileWriter.write(scanner.nextLine());
                fileWriter.close();
                System.out.println("The mmovie has been stored in movie database");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
