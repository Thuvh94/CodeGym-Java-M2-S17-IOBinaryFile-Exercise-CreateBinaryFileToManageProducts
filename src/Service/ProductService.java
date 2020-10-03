package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IService<Product> {
    static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "TV", "Toshiba", 3000000, "3D"));
        productList.add(new Product(2, "Oven", "LG", 4000000, "3D"));
        productList.add(new Product(3, "TV", "Sony", 5000000, "3D"));
        productList.add(new Product(4, "TV", "SamSung", 6000000, "3D"));
        productList.add(new Product(5, "TV", "LG", 7000000, "3D"));

    }

    @Override
    public void add(Product object) {
        boolean isExisted = productList.contains(object);
        if (!isExisted)
            productList.add(object);
        else
            System.out.println("This customer is existed");
    }


    @Override
    public List<Product> findByName(String name) {
        List<Product> outputList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (name == productList.get(i).getName()) {
                outputList.add(productList.get(i));
            }
        }
        return outputList;
    }

    @Override
    public List<Product> findAll() {
        List<Product> outputList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            outputList.add(productList.get(i));
        }
        return outputList;
    }
}
