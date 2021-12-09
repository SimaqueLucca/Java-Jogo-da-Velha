package com.company;

import java.io.IOException;
import java.util.Scanner;
import com.company.*;

public class Main {

    public static void main(String[] args) {

        char[][] table = {

                { '1', '|', '2', '|', '3' },
                { '4', '|', '5', '|', '6' },
                { '7', '|', '8', '|', '9' }

        };

        clrscr(table);

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

        Player P1 = new Player(pin, 5, name);

        // Segundo jogador

        sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Nome do segundo jogador: ");
        name = sc.nextLine();

        pin = P1.getPin() == 'X' ? 'O' : 'X';
        Player P2 = new Player(pin, 4, name);

        System.out.println(P2.getName() + " você vai jogar com o '" + P2.getPin() + "':");
        System.out.println("");

        while (true) {

            sc = new Scanner(System.in);

            System.out.print(P1.getName() + " escolha a posição da jogada: ");
            int pos = sc.nextInt();
            Table.setField(table, pos, P1);

            if (P1.getPlays() == 0 & P2.getPlays() == 0) {
                System.out.print("Deu velha eh isto");
                break;
            }

            if (checkWin(table, P1)) {
                System.out.print(P1.getName() + " é o vencedor dessa bagaça");
                break;
            }

            clrscr(table);

            System.out.print(P2.getName() + " escolha a posição da jogada: ");
            pos = sc.nextInt();
            Table.setField(table, pos, P2);

            if (checkWin(table, P2)) {
                System.out.print(P2.getName() + " é o vencedor dessa bagaça");
                break;
            }

            clrscr(table);

        }
    }

    public static void clrscr(char[][] table) {
        // Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "clear").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }

        Table.printTable(table);
        System.out.println("");
    }

    public static boolean checkWin(char[][] table, Player player) {

        // check rows

        int rows[] = { 0, 1, 2 };

        for (int i : rows) {
            if ((table[i][0] == 'X' && table[i][2] == 'X' && table[i][4] == 'X')
                    || (table[i][0] == 'O' && table[i][2] == 'O' && table[i][4] == 'O')) {
                return true;
            }
        }

        // check columns

        int columns[] = { 0, 2, 4 };

        for (int i : columns) {
            if ((table[0][i] == 'X' && table[1][i] == 'X' && table[2][i] == 'X')
                    || (table[0][i] == 'O' && table[1][i] == 'O' && table[2][i] == 'O')) {
                return true;
            }
        }

        // check diagonals

        if ((table[0][0] == 'X' && table[1][2] == 'X' && table[2][4] == 'X')
                || (table[0][0] == 'O' && table[1][2] == 'O' && table[2][4] == 'O')) {
            return true;
        }

        if ((table[0][4] == 'X' && table[1][2] == 'X' && table[2][0] == 'X')
                || (table[0][4] == 'O' && table[1][2] == 'O' && table[2][0] == 'O')) {
            return true;
        }

        return false;
    }
}
