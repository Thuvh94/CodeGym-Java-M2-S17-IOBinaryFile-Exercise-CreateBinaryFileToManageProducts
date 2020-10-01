import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"TV","Toshiba",3000000,"3D"));
        productList.add(new Product(2,"TV","LG",4000000,"3D"));
        productList.add(new Product(3,"TV","Sony",5000000,"3D"));
        productList.add(new Product(4,"TV","SamSung",6000000,"3D"));
        productList.add(new Product(5,"TV","LG",7000000,"3D"));

        Writer.write("Product list.bin",productList);
        Reader.read("Product list.bin");
    }
}
