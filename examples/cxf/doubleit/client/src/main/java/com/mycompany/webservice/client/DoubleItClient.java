package com.mycompany.webservice.client;

import org.example.contract.doubleit.DoubleItPortType;
import org.example.contract.doubleit.DoubleItService;

public class DoubleItClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("testing 1 2 3");
        DoubleItService service = new DoubleItService();
        DoubleItPortType port = service.getDoubleItPort();

        doubleIt(port, 10);
        doubleIt(port, 0);
        doubleIt(port, -10);

    }

    private static void doubleIt(DoubleItPortType port, int numToDouble) {
        System.out.println("The number " + numToDouble + " doubled is " + port.doubleIt(numToDouble));
    }

}
