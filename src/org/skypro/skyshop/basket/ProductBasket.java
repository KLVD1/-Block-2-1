package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;


public class ProductBasket {
    private final Product[] products = new Product[5];
    private  int count=0;

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        }
    }

    public void print() {
        int total = 0;
        int specialCount = 0;

        for (Product product : products) {
            if (product == null) {
                continue;
            }
            System.out.println(product); // сработает переопределённый toString
            total += product.getPrice();
            if (product.isSpecial()) {
                specialCount++;
            }
        }

        System.out.println("Итого: " + total);
        System.out.println("Специальных товаров: " + specialCount);
    }
}