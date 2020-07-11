package pl.yellowduck.netflix90;

import java.io.File;
import java.io.FileNotFoundException;


public class MainIO {


    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("/users/Pawel/");
        if (file.exists()) {
            for (File lastFile : file.listFiles()) {
                System.out.println(lastFile.getName());
            }
        } else {
            throw new FileNotFoundException("Plik (katalog) nie istnieje");
        }


    }

}

