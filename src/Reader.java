import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Writing Objects to a File by using the ObjectOutputStream class:
public class Reader {
    public static void read(String pathname) throws IOException {
        try {
            ObjectInputStream inputProduct = new ObjectInputStream(new FileInputStream(pathname));
            while (true){
                Product product = (Product) inputProduct.readObject();
                System.out.println(product);
            }
        }
        catch (IOException | ClassNotFoundException ex){
            ex.getMessage();
        }
    }
}
