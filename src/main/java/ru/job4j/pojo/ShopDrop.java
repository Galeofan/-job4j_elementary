package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            if (products.length - 1 == i) {
                products[products.length - 1] = null;
                break;
            } else {
                products[i] = products[i + 1];
            }
        }
        return products;
    }
}
