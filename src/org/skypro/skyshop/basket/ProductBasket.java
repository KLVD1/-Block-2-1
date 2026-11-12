package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;


public class ProductBasket {
    private final Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        }
    }

    public int countSpecialProducts() {
        int specialCount = 0;
        for (Product product : products) {
            if (product != null && product.isSpecial()) {
                specialCount++;
            }
        }
        return specialCount;
    }


    public void print() {
        int total = 0;

        for (Product product : products) {
            if (product == null) {
                continue;
            }
            System.out.println(product);
            total += product.getPrice();
        }

        System.out.println("Итого: " + total);
        System.out.println("Специальных товаров: " + countSpecialProducts());
    }
}
