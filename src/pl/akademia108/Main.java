package pl.akademia108;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value =  scanner.next();

        double currencyConverted = Double.parseDouble(value);


        System.out.println(currencyConverted * 100);

    }
}
