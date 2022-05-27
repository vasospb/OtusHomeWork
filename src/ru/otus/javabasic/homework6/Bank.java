package ru.otus.javabasic.homework6;

import java.util.*;

public class Bank {
    static int accountSequence = 100;
    public static int clientSequence;

    private final String name;
    private final String id;
    private final Map<Client, Set<Account>> clientHashMap = new HashMap<>();


    public Bank(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public Bank() {
        this("999999", "NoName Bank");
    }

    public void addClient(Client client) {
        //      Account account = new Account(Bank.accountSequence, client);
        if (!clientHashMap.containsKey(client)) {

            clientHashMap.put(client, new HashSet<>());
            System.out.println("New client: " + client + " was registered in a Bank: " + this.name);
        } else {
            System.out.println("Client already exist. Use existing client: " + client);
        }

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
        int i = 0;
        System.out.println("\nClients list in bank: " + this.name);
        for (Map.Entry<Client, Set<Account>> item : clientHashMap.entrySet()) {
            i++;
            System.out.println(i + ":    Client id: " + item.getKey() + ".  ");
            if (item.getValue() != null) {
                if (item.getValue().size() == 0) {
                    System.out.println("  No accounts for the client");
                } else {
                    for (Account a :                                  //как указать конкретный тип возвращаемого из getValue
                            item.getValue()) {
                        System.out.println("  " + a);
                    }
                }
            } else {
                System.out.println("  No accounts for the client");
            }
        }
    }

    public Set<Account> getAccounts(Client client) {
        return clientHashMap.get(client);
    }

    public Client findClient(Account account) {
        return account.getClient();
    }

    public String getId() {
        return id;
    }

    public Map<Client, Set<Account>> getClientHashMap() {
        return clientHashMap;
    }
}
