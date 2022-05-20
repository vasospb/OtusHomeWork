package ru.otus.javabasic.homework6;

public class Main {
    public static void main(String[] args) {

        //Create Bank
        Bank bank = new Bank("004156", "Sberbank");

        //Create Clients
        Client client1 = new Client("Vasily", "Chigaev", 43);
        Client client2 = new Client("Ivan", "Petrov", 17);
        //  Client client3 = new Client("Petr", "Ivanov", 17, true);
        System.out.println("-------------");

        //Add clients to the bank
        bank.addClient(client1);
        bank.addClient(client2);

        System.out.println("-----------------");
        //Create account for client
        Account account1 = bank.createAccount(client1);
        Account account2 = bank.createAccount(client1);
        Account account3 = bank.createAccount(client2, 120);
        Account account4 = bank.createAccount(client1);

        System.out.println("------------------------------------");
        bank.printClients();

        System.out.println("----");
        System.out.println("Checking method findClient:");
        System.out.println(account1 + " registered to: \n     " + bank.findClient(account1));


    }
}
