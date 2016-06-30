package me.roneythomas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ReportCard> reportCards = new ArrayList<>();
        reportCards.add(new ReportCard("Roney Thomas", "A+", "B", "A"));
        reportCards.add(new ReportCard("Jason Bourne", "A", "A", "A"));
        reportCards.add(new ReportCard("Timothy Jordan", "B", "B+", "C"));
        reportCards.add(new ReportCard("John Neuman", "C", "A", "B"));

        for (ReportCard cards : reportCards) {
            System.out.println(cards.toString());
        }
    }
}
