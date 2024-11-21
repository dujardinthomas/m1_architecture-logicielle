package org.example.creational.singleton;

public class Demo {

    public static void main(String[] args) {
        OrderManagementService orderManagementService = OrderManagementService.getInstance();
        //OrderManagementService orderManagementService2 = new OrderManagementService();

        OrderManagementService orderManagementService3 = OrderManagementService.getInstance();

       // System.out.println("pour le test on met le constructeur en publique");
//        System.out.println("test 1 : " + (orderManagementService == orderManagementService2));
//        System.out.println("test 2 : " + (orderManagementService == orderManagementService3));

    }






}
