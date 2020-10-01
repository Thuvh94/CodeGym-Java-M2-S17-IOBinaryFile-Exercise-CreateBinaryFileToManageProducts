import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//Writing Objects to a File by using the ObjectOutputStream class:
public class Writer {
    public static void write(String pathname,List<Product> list) throws IOException {
        try {
            ObjectOutputStream outputProduct = new ObjectOutputStream(new FileOutputStream(pathname));
            for (Product product: list){
                outputProduct.writeObject(product);
            }
        }
        catch (IOException ex){
            ex.getMessage();
        }
    }
}
