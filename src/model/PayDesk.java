package model;

import contract.Card;

public class PayDesk {
    public static void printPurchaseValue(Card card, double purchaseValue) {
        System.out.printf("Purchase value: $%.2f\n", purchaseValue);
    }

    public static void printDiscountRate(Card card) {
        System.out.printf("Discount rate: %.1f%%\n", (card.getDiscountRate() * 100.0));
    }

    public static void printDiscount(Card card, double purchaseValue) {
        System.out.printf("Discount: $%.2f\n", card.calculateDiscount(purchaseValue));
    }

    public static void printTotalPurchaseValue(Card card, double purchaseValue) {
        System.out.printf("Total: $%.2f\n", purchaseValue - card.calculateDiscount(purchaseValue));
    }

    public static void printAll(Card card, double purchaseValue) {
        printPurchaseValue(card, purchaseValue);
        printDiscountRate(card);
        printDiscount(card, purchaseValue);
        printTotalPurchaseValue(card, purchaseValue);
    }
}
