package quelacanaria;

import java.io.FileWriter;
import java.io.IOException;

//How to write a File using Java (4 Popular options)
//FileWriter = Good for small or medium-sized text files
//BufferedWriter = Better performance for large amount of text
//PrintWriter = Best for structured data, like report logs
//FileOutputStream = Best for binary files (e.g. images, audio files)
public class f053_FileWriter {

    public static void main(String[] args) {



        try(FileWriter writer = new FileWriter("test.docs")){
            writer.write("File has written");
            System.out.println("File has written");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }

    }

}
