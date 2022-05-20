package ru.otus.javabasic.homework6;

import java.util.Objects;

public class Account {
    private final int id;
    private final Client client;
    private final int coins; //How many coins are on the account

    public Account(int id, Client client, int coins) {
        this.id = id;
        this.client = client;
        this.coins = coins;
    }

    public Account(int id, Client client) {
        this(id, client, 0);
    }

    @Override
    public String toString() {
        return "Account id: '" + id + '\'' + ". " + this.coins + " coins on the account.";
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
