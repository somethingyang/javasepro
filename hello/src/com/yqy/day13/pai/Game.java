package com.yqy.day13.pai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Game {
    public static List<Card> allCards = new ArrayList<>();

    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♠","♦","♣"};
        int index = 0;

        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c = new Card(size , color , index);
                allCards.add(c);
            }
        }

        Card c2 = new Card("", "小王", ++index);
        Card c1 = new Card("", "大王", ++index);
        Collections.addAll(allCards , c1 , c2);
        System.out.println(allCards);
    }

    public static void main(String[] args) {
        Collections.shuffle(allCards);
        System.out.println(allCards);

        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();

        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                player1.add(c);
            } else if (i % 3 == 1) {
                player2.add(c);
            } else if (i % 3 == 2){
                player3.add(c);
            }
        }

        List<Card> lastThreeCard = allCards.subList(allCards.size() - 3,allCards.size());

        sortCards(player1);
        sortCards(player2);
        sortCards(player3);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(lastThreeCard);
    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex()  - o1.getIndex();
            }
        });
    }


}
