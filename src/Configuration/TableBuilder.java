package Configuration;

import Deck.StandardCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TableBuilder {
    public List<StandardCard> throwCard() {
        List<StandardCard> p1Hand = new CardDeckBuilder().getDeck();
        List<StandardCard> p1Table = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        for (int i = 1; i < p1Hand.size(); i++) {
//            System.out.println(p1Hand.);
//wybrac na podstawie id - for z if, 1 wyswietl karty, 2 podobnie jak z tym lead 123,get(int 1), add.p1table
//        p1Hand.forEach(card -> System.out.println(card));
//        int number = Integer.parseInt(scanner.nextLine());
        return Collections.emptyList();
    }
}
