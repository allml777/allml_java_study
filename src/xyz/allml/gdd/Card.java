package xyz.allml.gdd;

import java.util.ArrayList;

public class Card implements Comparable<Card> {
    String name;
    int num;

    public Card(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public ArrayList<Card> createCard(String[] fgo){
        ArrayList<Card> cardArrayList = new ArrayList<>();
        for (int i = 0; i < fgo.length; i++) {
            for (int j = 0; j < fgo.length; j++) {
                Card c = new Card(fgo[i], j + 1);
                cardArrayList.add(c);
            }
        }
        return cardArrayList;
    }

    String cardInfo() {
        return num + "\t" + name;
    }

    void printCardInfo() {
        System.out.println(num + "*\t" + name);
    }

    @Override
    public int compareTo(Card c) {
        return this.num - c.num;
    }
}
