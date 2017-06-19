package com.example.amit.demo.activity;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by amit on 27/03/17.
 */

public class MyObjectKeySearch {

    public static void main() {
        List<String> ll = new LinkedList<>();

        HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Does key available? " + hm.containsKey(key));

    }

    public static void printMap(HashMap<Price, String> map) {

        Set<Price> keys = map.keySet();
        for (Price p : keys) {
            System.out.println(p + "==>" + map.get(p));
        }
    }
}

class Price {

    private String item;
    private int price;

    public Price(String itm, int pr) {
        this.item = itm;
        this.price = pr;
    }

    @Override
    public int hashCode() {
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = (price * 20) + item.hashCode();
        System.out.println("  this.item " + this.item + " item.hashCode()  " + item.hashCode());
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "item: " + item + "  price: " + price;
    }
}

