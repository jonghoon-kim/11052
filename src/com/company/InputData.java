package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InputData {
    private int maxCardQuantity;
    private ArrayList<Cardpack> cardpacks = new ArrayList<>();

    public InputData(){
        Scanner sc = new Scanner(System.in);
        maxCardQuantity = sc.nextInt();
        for (int i = 1; i < maxCardQuantity +1; i++) {
            cardpacks.add(new Cardpack(i,sc.nextInt()));
        }
        Collections.sort(cardpacks);
        System.out.println(cardpacks);
    }
}
