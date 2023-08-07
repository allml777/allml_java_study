import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class randomCard {
    public static void main(String[] args) {
        Random random = new Random();
        String[] fgo = {"Saber", "Lancer", "Archer", "Caster", "Assassin", "Rider", "Berserker"};
        String[] allCard = {
                "Saber", "Saber", "Saber", "Saber", "Saber", "Saber", "Saber",
                "Lancer", "Lancer", "Lancer", "Lancer", "Lancer", "Lancer", "Lancer",
                "Archer", "Archer", "Archer", "Archer", "Archer", "Archer", "Archer",
                "Caster", "Caster", "Caster", "Caster", "Caster", "Caster", "Caster",
                "Assassin", "Assassin", "Assassin", "Assassin", "Assassin", "Assassin", "Assassin",
                "Rider", "Rider", "Rider", "Rider", "Rider", "Rider", "Rider",
                "Berserker", "Berserker", "Berserker", "Berserker", "Berserker", "Berserker", "Berserker"
        };
        ArrayList<Card> cardList = new ArrayList<>();
        for (int i = 0; i < allCard.length; i++) {
            Card e = new Card(allCard[i], i + 1);
            cardList.add(e);
        }

        //k的数量为玩家的数量，模拟4位玩家的摸牌情况

        for (int k = 0; k < 4; k++) {
            System.out.println("No. " + (k + 1) + " player:");
            ArrayList<Card> playerCard = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                int index = (int) (Math.random() * cardList.size());
//                System.out.println(cardList.size());
                Card e = cardList.get(index);
                playerCard.add(e);
                cardList.remove(index);
                if (i == 5) {
                    int[] count = {0, 0, 0, 0, 0, 0, 0};
                    int flag = 0;
                    Collections.sort(playerCard);
                    for (Card c : playerCard) {
                        System.out.println("random: " + c.printCard());
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
                    System.out.println();
                    System.out.println();
                    for (int j = 0; j < count.length; j++) {
                        if (count[j] >= 6) {
                            System.out.println("3 对 \t" + fgo[j]);
                        } else if (count[j] >= 4) {
                            System.out.println("2 对 \t" + fgo[j]);
                        } else if (count[j] >= 2) {
                            System.out.println("1 对 \t" + fgo[j]);
                        }
                    }
                    System.out.println();
                    System.out.println("#######################################################");
                }
            }
        }
    }
}

/**
 * 卡片类
 */
class Card implements Comparable<Card> {
    String name;
    int num;

    public Card(String name, int num) {
        this.name = name;
        this.num = num;
    }

    String printCard() {
        return num + "\t" + name;
    }

    @Override
    public int compareTo(Card c) {
        return this.num - c.num;
    }
}

/**
 * 玩家类
 */
class Player {
    String name;
    ArrayList<Card> hands = new ArrayList<>();

    Card drawCard(ArrayList<Card> cards) {
        Random random = new Random();
        int index = (int) (Math.random() * cards.size());
        hands.add(cards.get(index));
        return cards.get(index);
    }
}
