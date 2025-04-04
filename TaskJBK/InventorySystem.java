package TaskJBK;
import java.util.*;
class Category{
    private int categoryID;
    private String categoryName;

    public Category(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }
    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
class Product{
    private String productName;
    private double price;
    private Category category;

    public Product(String productName, double price, Category category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

}
public class InventorySystem {
    public static void main(String[] args) {
        Category electronics = new Category(1, "Electronics");
        Category clothing = new Category(2, "Clothing");

        Product[] products = {
                new Product("Laptop", 1200.50, electronics),
                new Product("Smartphone", 850.99, electronics),
                new Product("T-Shirt", 25.99, clothing),
                new Product("Jeans", 40.75, clothing),
                new Product("Headphones", 150.00, electronics)
        };
        displayProductsByCategory(products);
        calculateAveragePrice(products, "Electronics");
        findMostExpensiveProductByCategory(products);
    }
    public static void displayProductsByCategory(Product[] products) {
        Map<String, List<Product>> categoryMap = new HashMap<>();

        for (Product product : products) {
            categoryMap.computeIfAbsent(product.getCategory().getCategoryName(), k -> new ArrayList<>()).add(product);
        }

        for (String category : categoryMap.keySet()) {
            System.out.println("Category: " + category);
            for (Product product : categoryMap.get(category)) {
                System.out.println(" - " + product.getProductName() + " ($" + product.getPrice() + ")");
            }
        }
    }
    public static void calculateAveragePrice(Product[] products, String categoryName) {
        double total = 0;
        int count = 0;
        for (Product product : products) {
            if (product.getCategory().getCategoryName().equals(categoryName)) {
                total += product.getPrice();
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Average price in " + categoryName + ": $" + (total / count));
        } else {
            System.out.println("No products found in " + categoryName);
        }
    }
    public static void findMostExpensiveProductByCategory(Product[] products) {
        Map<String, Product> mostExpensiveMap = new HashMap<>();

        for (Product product : products) {
            String category = product.getCategory().getCategoryName();
            if (!mostExpensiveMap.containsKey(category) || product.getPrice() > mostExpensiveMap.get(category).getPrice()) {
                mostExpensiveMap.put(category, product);
            }
        }

        for (String category : mostExpensiveMap.keySet()) {
            Product expensiveProduct = mostExpensiveMap.get(category);
            System.out.println("Most expensive in " + category + ": " + expensiveProduct.getProductName() + " ($" + expensiveProduct.getPrice() + ")");
        }
    }
}
