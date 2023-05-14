package org.example;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double apple = 3.67, pear = 2.14, tomato = 1.11, banana = 0.95 , aubergine = 5.00;
        double applekg, pearkg,tomatokg,bananakg,auberginekg, total;

        Scanner input = new Scanner(System.in);

        System.out.println(" ~ Hoşgeldiniz ~");

        System.out.print("Armut Kaç Kilo ? ");
        pearkg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? ");
        applekg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? ");
        tomatokg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? ");
        bananakg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? ");
        auberginekg = input.nextDouble();

        total = (pear*pearkg)+(applekg*apple)+(auberginekg*aubergine)+(tomatokg*tomato)+(bananakg*banana);
        System.out.println("Toplam tutar : "+total);
    }
}