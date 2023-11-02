package com.allml.D144;

import java.util.*;

public class Room {
    private List<Card> allCards = new ArrayList<>();

    public Room() {
        //初始化54张牌

        //a.点数：个数确定，类型确定
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //b.花色
        String[] colors = {"♠", "♣", "♥", "♦"};
        //c.先遍历点数再遍历花色
        //size是牌的大小，且只用来比大小
        int size = 0;
        for (int i = 0; i < numbers.length; i++) {
            size++;
            for (int i1 = 0; i1 < colors.length; i1++) {
                Card c = new Card(numbers[i], colors[i1], size);
                allCards.add(c);
            }
        }
        allCards.add(new Card("", "\uD83C\uDF1E", ++size));
        allCards.add(new Card("", "\uD83C\uDF1B", ++size));

        System.out.println(allCards.toString());
    }

    /*
    游戏启动
     */
    public void start() {
        //1.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后");
        System.out.println(allCards);
        //2.发牌 set无法重复 所以要用list
        List<Card> p1 = new ArrayList<>();
        List<Card> p2 = new ArrayList<>();
        List<Card> p3 = new ArrayList<>();

        //发出51张牌 余下三张
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                p1.add(c);
            } else if (i % 3 == 1) {
                p2.add(c);
            } else if (i % 3 == 2) {
                p3.add(c);
            }
        }

        //3.对三个玩家的牌排序
        sortCards(p1);
        sortCards(p2);
        sortCards(p3);

        //4.看牌
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        System.out.println("p3:" + p3);
        //sublist() 截取元素成为集合
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("remain:" + lastThreeCards);
        //比如p1抢到地主
        p1.addAll(lastThreeCards);
        sortCards(p1);
        System.out.println("p1:" + p1);

    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, (Card o1, Card o2) -> o1.getSize() - o2.getSize());
    }
}
