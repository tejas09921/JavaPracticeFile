package TaskJBK;

public class First {
    int ProductID;
    String ProductName;
    double Price;

    @Override
    public String toString() {
        return "First{" +
                "ProductID=" + ProductID +
                ", ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                '}';
    }

    public First(int productID, String productName, double price) {
        ProductID = productID;
        ProductName = productName;
        Price = price;
    }
    public void DisplayProduct(){
        System.out.println("Product ID: " + ProductID);
        System.out.println("Product Name: " + ProductName);
        System.out.println("Price: $" + Price);
        System.out.println("-----------------------");
    }

    int n;
    int arr[] =new int[n];

}
