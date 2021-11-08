package com.Pearl;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PrivateClientsRegister extends ClientRegister {
    private Random rand = new Random();
    private Scanner input = new Scanner(System.in);
    private String getServiceLevel;

    public void setPrivateReg() {

        System.out.println("Enter number of private clients");
        int numOfClients = input.nextInt();

        while (numOfClients != 0) {
            input.nextLine();
            System.out.print("Enter client service Level\n");
            getServiceLevel = input.nextLine();
            if (getServiceLevel.toLowerCase().equals("gold")) {
                System.out.print("Enter name : \n");
                String name = input.nextLine();
                goldClients.add(name);
                privateClients.put(idGenerator, name);
                idGenerator += rand.nextInt(1000);
            } else if (getServiceLevel.toLowerCase().equals("premium")) {
                System.out.print("Enter name : \n");
                String name = input.nextLine();
                premiumClients.add(name);
                privateClients.put(idGenerator, name);
                idGenerator += rand.nextInt(1000);
            } else if (getServiceLevel.toLowerCase().equals("platinum")) {
                System.out.print("Enter name : \n");
                String name = input.nextLine();
                platinumClients.add(name);
                privateClients.put(idGenerator, name);
                idGenerator += rand.nextInt(1000);
            } else {
                System.out.println("Invalid input");
            }
            numOfClients--;
        }

            }
    public List<String> getPrivateMem () {
        return privateClients.values().stream().toList();
    }
}



