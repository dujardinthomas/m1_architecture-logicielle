package org.example;

import org.example.creational.singleton.OrderManagementService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        OrderManagementService orderManagementService = OrderManagementService.getInstance();
    }
}
