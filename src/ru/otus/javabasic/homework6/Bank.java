package ru.otus.javabasic.homework6;

import java.util.*;

public class Bank {
    static int accountSequence = 100;
    public static int clientSequence;

    private String name;
    private String id;
    private Map<Client, Set> clientHashMap = new HashMap<>();


    public Bank(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public Bank() {
        this("999999", "NoName Bank");
    }

    public void addClient(Client client) {
        //      Account account = new Account(Bank.accountSequence, client);
        clientHashMap.put(client, null);
        System.out.println("New client: " + client + " was registered in a Bank: " + this.name);
    }

    public Account createAccount(Client client) {
        return this.createAccount(client, 0);
    }

    public Account createAccount(Client client, int goldCount) {
        Account account = client.createAccount(goldCount);
        clientHashMap.put(client, client.putAccountToSet(account));
        return account;
    }


    public void printClients() {
        int c = 0;
        System.out.println("\nClients list in bank: " + this.name);
        for (Map.Entry<Client, Set> item : clientHashMap.entrySet()) {
            c++;
            System.out.println(c + ":    Client id: " + item.getKey() + ".");
            for (Object a :                                  //как указать конкретный тип возвращаемого из getValue
                    item.getValue()) {
                System.out.println("  " + a);
            }
        }
    }

    public Set getAccounts(Client client) {
        return clientHashMap.get(client);
    }

    public Client findClient(Account account) {
        return account.getClient();
    }

    public String getId() {
        return id;
    }

    public Map<Client, Set> getClientHashMap() {
        return clientHashMap;
    }
}
