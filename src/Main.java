package com.Pearl;

public class Main {

    public static void main(String[] args) {

        PrivateClientsRegister priClient = new PrivateClientsRegister();
        priClient.setPrivateReg();
        priClient.getPrivateMem();
        System.out.println("\nPrivate members " +priClient.getPrivateMem() +"\n");


        CorporateClientsRegister corpClient = new CorporateClientsRegister();
        corpClient.setCorporateReg();
        corpClient.getCorporateMem();
        System.out.println("\nCorporate members " +corpClient.getCorporateMem() +"\n");

        ClientRegister aClient = new ClientRegister();
        aClient.getGoldClients();
        System.out.println("\nGold clients " +aClient.getGoldClients() +"\n");

        aClient.getPlatinumClients();
        System.out.println("\nPlatinum clients " +aClient.getPlatinumClients() +"\n");

        aClient.getPremiumClients();
        System.out.println("\nPremium clients " +aClient.getPremiumClients() +"\n");

        aClient.getAllIds();
        aClient.getClientById();
        aClient.countAllAtLevels();

    }
}
