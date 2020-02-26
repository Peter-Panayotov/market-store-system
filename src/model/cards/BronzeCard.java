package model.cards;

import contract.Card;
import contract.Client;

public class BronzeCard implements Card {
    private Client owner;
    private double turnover;
    private static final double INITIAL_DISCOUNT_RATE = 0;

    public BronzeCard(Client owner, double turnover) {
        this.owner = owner;
        this.turnover = turnover;
    }

    public Client getOwner() {
        return owner;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    @Override
    public double calculateDiscount(double purchaseValue) {
        return purchaseValue * getDiscountRate();
    }

    @Override
    public double getDiscountRate() {
        if (turnover < 100) {
            return INITIAL_DISCOUNT_RATE;
        } else if (turnover >= 100 && turnover <= 300) {
            return 0.01;
        }

        return 0.025;
    }
}
