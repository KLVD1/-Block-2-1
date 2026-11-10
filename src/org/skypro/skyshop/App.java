package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket backet = new ProductBasket();

        backet.addProduct(new SimpleProduct("Хлеб", 50));
        backet.addProduct(new DiscountedProduct("Ноутбук", 100_000, 15));
        backet.addProduct(new FixPriceProduct("Скрепка"));
        backet.addProduct(new SimpleProduct("Молоко", 80));
        backet.addProduct(new DiscountedProduct("Наушники", 5_000, 50));

        backet.print();
    }
}