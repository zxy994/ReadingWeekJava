package com.Pearl;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CorporateClientsRegister extends ClientRegister{
    private Random rand = new Random();
    private Scanner input = new Scanner(System.in);
    private String getServiceLevel;

            public void setCorporateReg() {
                System.out.println("Enter number of corporate clients");
                int numOfClients = input.nextInt();

                while (numOfClients != 0) {
                    input.nextLine();
                    System.out.print("Enter service level : \n");
                    getServiceLevel = input.nextLine();
                    if (getServiceLevel.toLowerCase().equals("gold")) {
                        System.out.println("Enter name : ");
                        String name = input.nextLine();
                        goldClients.add(name);
                        corporateClients.put(idGenerator, name);
                        idGenerator += rand.nextInt(1000);
                    } else if (getServiceLevel.toLowerCase().equals("premium")) {
                        System.out.println("Enter name : ");
                        String name = input.nextLine();
                        premiumClients.add(name);
                        corporateClients.put(idGenerator, name);
                        idGenerator += rand.nextInt(1000);
                    } else if (getServiceLevel.toLowerCase().equals("platinum")) {
                        System.out.println("Enter name : ");
                        String name = input.nextLine();
                        platinumClients.add(name);
                        corporateClients.put(idGenerator, name);
                        idGenerator += rand.nextInt(1000);
                    } else {
                        System.out.println("Invalid input");
                    }
                numOfClients--;
                }
                            }
    public List<String> getCorporateMem() {
                return corporateClients.values().stream().toList();

    }
}
