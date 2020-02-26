package main;

import contract.Client;
import model.CardOwner;
import model.PayDesk;
import model.cards.BronzeCard;
import model.cards.GoldCard;
import model.cards.SilverCard;

public class Main {

    public static void main(String[] args) {
        double bronzePurchaseValue = 150;
        Client bronzeCardOwner = new CardOwner("Adam Smith", "London", "04518564854");
        BronzeCard bronzeCard = new BronzeCard(bronzeCardOwner, 0);
        System.out.println("Bronze Card:");
        PayDesk.printAll(bronzeCard, bronzePurchaseValue);
        System.out.println();

        double silverPurchaseValue = 850;
        Client silverCardOwner = new CardOwner("Jane Doe", "Sofia", "024568778");
        SilverCard silverCard = new SilverCard(silverCardOwner, 600);
        System.out.println("Silver Card:");
        PayDesk.printAll(silverCard, silverPurchaseValue);
        System.out.println();

        double goldPurchaseValue = 1300;
        Client goldCardOwner = new CardOwner("Thomas Anderson", "New York", "555152652");
        GoldCard goldCard = new GoldCard(goldCardOwner, 1500);
        System.out.println("Gold Card:");
        PayDesk.printAll(goldCard, goldPurchaseValue);
        System.out.println();
    }
}
