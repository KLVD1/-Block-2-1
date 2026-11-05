package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

    public class App {
        public static void main(String[] args) {
            ProductBasket basket = new ProductBasket();

            Product apples = new Product("Яблоки", 120);
            Product bread = new Product("Хлеб", 45);
            Product milk = new Product("Молоко", 89);
            Product cheese = new Product("Сыр", 350);
            Product tea = new Product("Чай", 250);
            Product coffee = new Product("Кофе", 500);

            // 1. Добавление продукта в корзину
            basket.addProduct(apples);
            basket.addProduct(bread);
            basket.addProduct(milk);
            basket.addProduct(cheese);
            basket.addProduct(tea);

            // 2. Добавление в заполненную корзину — свободного места нет
            basket.addProduct(coffee);

            // 3. Печать содержимого корзины с несколькими товарами
            basket.printBasket();

            // 4. Получение стоимости корзины с несколькими товарами
            System.out.println("Общая стоимость: " + basket.getTotalPrice());

            // 5. Поиск товара, который есть в корзине
            System.out.println("Есть ли в корзине Хлеб: " + basket.containsProduct("Хлеб"));

            // 6. Поиск товара, которого нет в корзине
            System.out.println("Есть ли в корзине Кофе: " + basket.containsProduct("Кофе"));

            // 7. Очистка корзины
            basket.clear();

            // 8. Печать содержимого пустой корзины
            basket.printBasket();

            // 9. Получение стоимости пустой корзины
            System.out.println("Общая стоимость: " + basket.getTotalPrice());

            // 10. Поиск товара по имени в пустой корзине
            System.out.println("Есть ли в корзине Хлеб: " + basket.containsProduct("Хлеб"));
        }
    }