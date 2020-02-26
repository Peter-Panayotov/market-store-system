package model.cards;

import contract.Card;
import contract.Client;

public class GoldCard implements Card {
    private Client owner;
    private double turnover;
    private static final double INITIAL_DISCOUNT_RATE = 0.02;
    private static final double DISCOUNT_RATE_GROW_STEP = 100;
    private static final double DISCOUNT_RATE_CAP = 0.10;

    public GoldCard(Client owner, double turnover) {
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
        double discountGrowRate = (turnover / DISCOUNT_RATE_GROW_STEP) / 100.0;
        double finalDiscountRate = discountGrowRate + INITIAL_DISCOUNT_RATE;
        if (finalDiscountRate > 0.10) {
            return DISCOUNT_RATE_CAP;
        }

        return finalDiscountRate;
    }
}
