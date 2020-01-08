package se.ecutb.loffe.model;

public class Product {

    private int productId;
    private String productName;
    private String description;
    private double price;

    /**
     *
     * @param productId Unique id
     * @param productName the products name. Not null.
     * @param description Products description. Nullable.
     * @param price The products' price. > 0.
     * @throws IllegalArgumentException when productName is null or price is <= 0.
     */
    public Product(int productId, String productName, String description, double price) throws IllegalArgumentException{
        this.productId = productId;
        setProductName(productName);
        setDescription(description);
        setPrice(price);
    }

    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName) throws IllegalArgumentException{
        if (productName == null) throw new IllegalArgumentException("Invalid productName: " + null);
        this.productName = productName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException{
        if (price <= 0){
            throw new IllegalArgumentException("Invalid price: " + price + "\nNeeds to be > 0.");
        }
        this.price = price;
    }

}
