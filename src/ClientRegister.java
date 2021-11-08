package com.Pearl;

import java.util.*;

public class ClientRegister {
    private Scanner input = new Scanner(System.in);

    public List<String> getGoldClients() {
        return goldClients;
            }

    protected static List<String> goldClients = new ArrayList<>();

    public List<String> getPremiumClients() {
        return premiumClients;
          }

    protected static List<String> premiumClients = new ArrayList<>();

    public List<String> getPlatinumClients() {
        return platinumClients;
        }

    protected static List<String> platinumClients = new ArrayList<>();
    protected static Map<Integer, String> corporateClients = new HashMap<>();
    protected static Map<Integer, String> privateClients = new HashMap<>();
    protected static Integer idGenerator = 1000;


    public void countAllAtLevels(){
        System.out.println("\nThere are " +goldClients.size() +" gold clients , "
        +premiumClients.size() +" premium clients , and " +platinumClients.size() +" " +
                "platinum clients\n");
    }

    public void getClientById(){
        System.out.print("\nEnter corporate or private \n");
        String checkClient = input.nextLine();
        System.out.print("Enter ID \n");
        Integer checkId = input.nextInt();

        if(checkClient.toLowerCase().equals("corporate")){
            System.out.println("\nID references "+corporateClients.get(checkId));
        } else if(checkClient.toLowerCase().equals("private")){
            System.out.println("\nID references "+privateClients.get(checkId));
        } else {
            System.out.println("Invalid Input");
        }
    }
    public void getAllIds(){
        Set<Integer> id1 = privateClients.keySet();
        System.out.println("Private IDs : " +id1);

        Set<Integer> id2 = corporateClients.keySet();
        System.out.println("Corporate IDs : " +id2);
    }
    }
