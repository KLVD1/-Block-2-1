package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        basket.addProduct(new SimpleProduct("Хлеб", 50));
        basket.addProduct(new DiscountedProduct("Ноутбук", 100_000, 15));
        basket.addProduct(new FixPriceProduct("Скрепка"));
        basket.addProduct(new SimpleProduct("Молоко", 80));
        basket.addProduct(new DiscountedProduct("Наушники", 5_000, 50));

        basket.print();
    }
}