package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class OrderConvert {

    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("001", "AAA"));
        orders.add(new Order("002", "BBB"));
        orders.add(new Order("003", "CCC"));
        System.out.println(process(orders));
    }
}
