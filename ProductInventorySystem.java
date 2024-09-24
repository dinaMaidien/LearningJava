public class ProductInventorySystem {
    //variable
    private String productName;
    private double price;
    private int quantity;
    private double totalStockValue;

    //set & getter

    public void setName(String productName){
        this.productName = productName;

    }

    public String getName(){
        return productName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getPrice(){
        return price;

    }
}
