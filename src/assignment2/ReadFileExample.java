package assignment2;
import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ugesh_developer\\personal\\coding\\Java\\Tut\\src\\assignment2\\example.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}

