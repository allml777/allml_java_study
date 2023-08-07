package xyz.allml.gdd;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        String[] fgo = {"Saber", "Lancer", "Archer", "Caster", "Assassin", "Rider", "Berserker"};
        //玩家数量要小于fgo数组的元素数量
        String[] player = {"咕哒A", "咕哒B", "咕哒C", "咕哒D"};
        int[] playerDouble = {0, 0, 0, 0};
        int[] playertriple = {0, 0, 0, 0};
        for (int loopsum = 0; loopsum < 50000; loopsum++) {
            ArrayList<Card> cardArrayList = new ArrayList<>();
            ArrayList<Player> players = new ArrayList<>();

            //按fgo数组的内容，生成手牌牌堆
            for (int i = 0; i < fgo.length; i++) {
                for (int j = 0; j < fgo.length; j++) {
                    Card c = new Card(fgo[i], (i + 1) * (j + 1));
                    cardArrayList.add(c);
                }
            }
            //按player数组的内容，生成玩家堆

            if (player.length <= fgo.length) {
                for (int i = 0; i < player.length; i++) {
                    Player p = new Player(player[i]);
                    players.add(p);
                }
            } else {
                System.out.println("玩家数量要小于等于fgo数组的元素数量!!!!!!!");
                System.exit(0);
            }

            //给玩家发牌，i是每个玩家要发的手牌数量
            for (int i = 0; i < 6; i++) {
                for (Player p : players) {
                    int drawIndex = p.drawCard(cardArrayList);
                    cardArrayList.remove(drawIndex);
                }
            }

//        System.out.println("剩下的牌是：");
//        for(Card c : cardArrayList){
//            c.printCardInfo();
//        }

            for (int i = 0; i < players.size(); i++) {
                System.out.println(players.get(i).name);
                players.get(i).sortHands();
                int[] count = players.get(i).sumHands(fgo);
                playerDouble[i] += players.get(i).statisticdouble(count, fgo);
                playertriple[i] += players.get(i).statisticstriple(count);
            }
        }
        System.out.println();
        for (int i = 0; i < playerDouble.length; i++) {
            System.out.println(player[i] + "每把平均抽到对子：");
            System.out.println((double) playerDouble[i] / 50000);
            System.out.println(player[i] + "每把平均抽到顺子：");
            System.out.println((double) playertriple[i] / 50000);
        }

//        for (Player p : players) {
//            System.out.println(p.name);
//            p.sortHands();
//            System.out.println("#######################################################");
//            int[] count = p.sumHands(fgo);
//            p.statisticdouble(count,fgo);
//            p.statisticstriple(count);
//            System.out.println(p.statistics(p.sumHands(fgo)) + "组顺子");
//            System.out.println("#######################################################");
//        }
    }
}
