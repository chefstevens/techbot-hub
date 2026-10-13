package net.runelite.client.plugins.microbot.banksorter;

import lombok.Getter;

@Getter
public class BankItem {
    private final int id;
    private final String name;

    public BankItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
