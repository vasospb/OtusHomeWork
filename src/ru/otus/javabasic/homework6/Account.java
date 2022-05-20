package ru.otus.javabasic.homework6;

import java.util.Objects;

public class Account {
    private int id;
    private Client client;
    private int count; //How many coins are on the account

    public Account(int id, Client client, int count) {
        this.id = id;
        this.client = client;
        this.count = count;
    }

    public Account(int id, Client client) {
        this(id, client, 0);
    }

    @Override
    public String toString() {
        return "{" +
                "account id='" + id + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && client.equals(account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client);
    }
}
