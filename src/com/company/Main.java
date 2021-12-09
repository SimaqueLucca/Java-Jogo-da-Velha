package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char[][] table = {

                { '_', '|', '_', '|', '_' },
                { '_', '|', '_', '|', '_' },
                { '_', '|', '_', '|', '_' }

        };

        System.out.println("Inicio de jogo, você quer X ou O?");

        Scanner sc = new Scanner(System.in);
        char pin = sc.next().charAt(0);

        int scoreP1, scoreP2;

        printTable(table);

        while (checkWin(table, pin)) {

            System.out.print("Posição da jogada: ");
            int pos = sc.nextInt();

            setField(table, pos, pin);

            checkWin(table, pin);
        }

    }

    public static void printTable(char[][] table) {

        for (char[] row : table) {
            System.out.println(row);
        }

    }

    public static void setField(char[][] table, int position, char pin) {
        int column, row;

        switch (position) {
            case 1:

                column = FieldWeight.FIELDONE.column;
                row = FieldWeight.FIELDONE.row;

                if (checkField(table, row, column)) {
                    table[0][0] = pin;

                } else {
                    alreadyChosen();
                }

                break;
            case 2:
                if (checkField(table, 0, 2)) {
                    table[0][2] = pin;
                } else {
                    alreadyChosen();
                }
                break;
            case 3:
                if (checkField(table, 0, 4)) {
                    table[0][4] = pin;
                } else {
                    alreadyChosen();
                }
                break;
            case 4:
                if (checkField(table, 1, 0)) {
                    table[1][0] = pin;
                } else {
                    alreadyChosen();
                }
                break;
            case 5:
                if (checkField(table, 1, 2)) {
                    table[1][2] = pin;
                } else {
                    alreadyChosen();
                }
                break;
            case 6:
                if (checkField(table, 1, 4)) {
                    table[1][4] = pin;
                } else {
                    alreadyChosen();
                }
                break;
            case 7:
                if (checkField(table, 2, 0)) {
                    table[2][0] = pin;
                } else {
                    alreadyChosen();
                }
                break;
            case 8:
                if (checkField(table, 2, 2)) {
                    table[2][2] = pin;
                } else {
                    alreadyChosen();
                }
                break;
            case 9:
                if (checkField(table, 2, 4)) {
                    table[2][4] = pin;
                } else {
                    alreadyChosen();
                }
                break;
        }

        System.out.println("\n\n");
        printTable(table);
    }

    public static boolean checkField(char[][] table, int r, int c) {
        if (table[r][c] == '_')
            return true;
        return false;
    }

    public static void alreadyChosen() {
        System.out.println("A posição já foi escolhida, escolha outra.");
    }

    public static boolean checkWin(char[][] table, char pin) {

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

        for (int i : rows) {
            if (table[i][0] == 'o' && table[i][0] == 'o' && table[i][0] == 'o') {
                return true;
            }
        }

        return false;
    }

    public enum FieldWeight {
        FIELDONE(2, 0, 0),
        FIELDTWO(7, 0, 2),
        FIELDTHREE(7, 0, 4);

        private int weight;
        private int column;
        private int row;

        private FieldWeight(int weight, int column, int row) {
            this.weight = weight;
            this.column = column;
            this.row = row;

        }

    }

}
