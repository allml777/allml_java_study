package xyz.allml.gdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Player {
    String name;
    ArrayList<Card> hands = new ArrayList<>();

    int drawCard(ArrayList<Card> cards) {
        Random random = new Random();
        int index = (int) (Math.random() * cards.size());
        hands.add(cards.get(index));
        return index;
    }

    /**
     * 手牌排序
     */
    public void sortHands() {
        Collections.sort(hands);
    }

    /**
     * 手牌统计数量
     * 相当于
     * ========================================================
     *  |Saber |Lancer |Archer |Caster |Assassin |Berserker |
     * ========================================================
     *  |1      |2      |2      |0      |1      |0          |
     * ========================================================
     */
    public int[] sumHands(String[] fgo) {
        int[] count = blankIntArray(fgo.length);
        sortHands();
        for (Card c : hands) {
            System.out.println("random: " + c.cardInfo());
            for (int j = 0; j < fgo.length; j++) {
                if (c.name.equals(fgo[j])) {
                    count[j] = count[j] + 1;
                }
            }
        }

        for (int j = 0; j < count.length; j++) {
            if (count[j] != 0) {
                System.out.print(fgo[j] + ": " + count[j] + "|");
            }
        }

        //        System.out.println("#######################################################");

        return count;
    }

    public int statisticdouble(int[] count, String[] fgo) {
        int doubleFlag = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 6) {
//                System.out.println("3 对 \t" + fgo[i]);
                doubleFlag = 3;
            } else if (count[i] >= 4) {
//                System.out.println("2 对 \t" + fgo[i]);
                doubleFlag = 2;
            } else if (count[i] >= 2) {
//                System.out.println("1 对 \t" + fgo[i]);
                doubleFlag = 1;
            }
        }
        return doubleFlag;
    }

    /**
     * 统计手牌情况
     * 1. 3+N
     */
    public int statisticstriple(int[] count) {
        int tripleFlag = 0;
        for (int i = 0; i < count.length - 2; i++) {
            if (count[i] >= 1 && count[i + 1] >= 1 && count[i + 2] >= 1) {
                tripleFlag++;
            } else if (count[i] == 2 && count[i + 1] == 2 && count[i + 1] == 2) {
                tripleFlag++;
            }
        }
        return tripleFlag;
    }

    /**
     * 手牌打印
     */
    void printHandCard() {
        for (Card c : hands) {
            c.printCardInfo();
        }
    }

    /**
     * 生成空白int数组
     *
     * @param length 要生成数组的长度
     */

    public int[] blankIntArray(int length) {
        int[] count = new int[length];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        return count;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
