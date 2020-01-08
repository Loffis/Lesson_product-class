package se.ecutb.loffe;

import se.ecutb.loffe.model.Product;

public class App
{
    public static void main( String[] args )
    {
        Product cookie = new Product(1, "Kakfabrikens kakor", "Nötter o choklad", 18.90);

        System.out.println(cookie.getDescription());
    }
}
