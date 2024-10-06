package com.imaks;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                " | Phone: " + customer.getPhone();
        String format = "%s --- %s";
        String result = String.format(format, LocalDateTime.now(), output);
        getOutput(result);
    }
     public static String[] getData(){
        return new String[]{"Popandopalo", "+380633322211"};
     }

     public static Customer getCustomer(String[] customer){
        return new Customer(customer[0], customer[1]);
     }

     public static void getOutput(String output){
         System.out.println(output);
     }
}