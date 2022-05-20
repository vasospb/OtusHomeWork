package ru.otus.javabasic.homework6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client {
    private int id;
    private String name;
    private String sureName;
    private int age;
    private Set<Account> accountsHashSet = new HashSet();

    //Constructors
    public Client(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        Bank.clientSequence++;
        this.id = Bank.clientSequence;
        System.out.println(this + " created.");
    }

//    public Client(String name, String sureName, int age, boolean createAccount)  {
//        this.name = name;
//        this.sureName = sureName;
//        this.age = age;
//        System.out.println(this + " created.");
//        if (createAccount){
//            System.out.print("    ");
//            createAccount();
//        }
//    }


    public Account createAccount() {
        return this.createAccount(0);

    }

    public Account createAccount(int count) {
        Account account = new Account(Bank.accountSequence++, this, count);
        System.out.println("Account " + account + " created for " + this);
        return account;
    }

    public Set<Account> putAccountToSet(Account account) {
        accountsHashSet.add(account);
        return accountsHashSet;
    }


    @Override
    public String toString() {
        return "id: " + id + " \"" + name + ' ' + sureName + "\"  " + age + " years old";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && age == client.age && name.equals(client.name) && sureName.equals(client.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sureName, age);
    }

}
