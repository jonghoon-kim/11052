package com.company;

public class Cardpack implements Comparable<Cardpack>{
    private int cardQuantity;
    private int value;

    public Cardpack(int cardQuantity, int value) {
        this.cardQuantity = cardQuantity;
        this.value = value;
    }

    public int getCardQuantity() {
        return cardQuantity;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Cardpack cardpack) {
        double current = this.getValue() / (double)this.getCardQuantity();
        double param = cardpack.getValue() / (double)cardpack.getCardQuantity();

        if(current > param)
            return -1;
        else if(current < param)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Cardpack{" +
                "cardQuantity=" + cardQuantity +
                ", value=" + value +
                '}';
    }
}
