package com.trylabs;

import java.util.Scanner;

public class Main {
    private static void converter()
    {   System.out.println("Введите сумму в $ для конвертации в гривны(можно c двумя символами после запятой):");
        Scanner scanner=new Scanner(System.in);
        float sumDollars=scanner.nextFloat();
        System.out.println("Введите курс доллара(можно c двумя символами после запятой):");
        float rate=scanner.nextFloat();
        System.out.println(sumDollars+"$ в гривнах будет "+sumDollars*rate);
    }

    public static void main(String[] args) {
converter();
    }
}
