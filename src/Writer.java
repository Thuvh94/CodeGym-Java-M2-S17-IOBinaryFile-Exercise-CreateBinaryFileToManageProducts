import Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Writing Objects to a File by using the ObjectOutputStream class:
public class Writer {
    public static void write(String pathname,List<Product> list) throws IOException {
        try {
            ObjectOutputStream outputProduct = new ObjectOutputStream(new FileOutputStream(pathname));
            outputProduct.writeObject(list);
            outputProduct.close();
        }
        catch (IOException ex){
            ex.getMessage();
        }
    }

    public static List<Product> read(String pathname) throws IOException, ClassNotFoundException {
            ObjectInputStream inputProduct = new ObjectInputStream(new FileInputStream(pathname));
            List<Product> products = new ArrayList<>();
            products = (List<Product>) inputProduct.readObject();
            return products;
    }
}
