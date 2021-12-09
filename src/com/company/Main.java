package com.company;

import java.util.Scanner;
import com.company.*;

public class Main {

    public static void main(String[] args) {

        char[][] table = {

                { '_', '|', '_', '|', '_' },
                { '_', '|', '_', '|', '_' },
                { '_', '|', '_', '|', '_' }

        };

        char pin;
        String name;

        System.out.println("Inicio de jogo");
        System.out.println("");

        // Primeiro jogador

        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do primeiro jogador: ");
        name = sc.nextLine();

        System.out.print("Deseja jogar com 'X' ou 'O': ");
        pin = sc.next().charAt(0);
        pin = Character.toUpperCase(pin);

        Player P1 = new Player(pin, 0, name);

        // Segundo jogador

        sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Nome do segundo jogador: ");
        name = sc.nextLine();

        pin = P1.getPin() == 'X' ? 'O' : 'X';
        Player P2 = new Player(pin, 0, name);

        System.out.println(P2.getName() + " você vai jogar com o '" + P2.getPin() + "':");
        System.out.println("");

        // Mostrar a table

        Table.printTable(table);
        System.out.println("");

        while (true) {
            sc = new Scanner(System.in);
            System.out.print(P1.getName() + " escolha a posição da jogada: ");
            int pos = sc.nextInt();

            P1.setScore(Table.setField(table, pos, P1.getPin()));

            if (!checkWin(P1)) {
                System.out.print(P2.getName() + " escolha a posição da jogada: ");
                pos = sc.nextInt();
                P2.setScore(Table.setField(table, pos, P2.getPin()));
            }

            if (checkWin(P1)) {
                System.out.print(P1.getName() + " é o vencedor dessa bagaça");
                break;
            }

            if (checkWin(P2)) {
                System.out.print(P2.getName() + " é o vencedor dessa bagaça");
                break;
            }
        }
    }

    public static boolean checkWin(Player player) {
        if (player.getScore() >= 15)
            return true;
        return false;
    }
}
