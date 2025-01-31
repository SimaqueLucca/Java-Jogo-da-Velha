package com.company;

public class Table {

    public static void printTable(char[][] table) {
        for (char[] row : table) {
            System.out.println(row);
        }
    }

    public static void setField(char[][] table, int position, Player player) {
        int column, row;

        switch (position) {
            case 1:

                column = FieldWeight.FIELDONE.column;
                row = FieldWeight.FIELDONE.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;

            case 2:

                column = FieldWeight.FIELDTWO.column;
                row = FieldWeight.FIELDTWO.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;

            case 3:

                column = FieldWeight.FIELDTHREE.column;
                row = FieldWeight.FIELDTHREE.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                    ;
                } else {
                    alreadyChosen();
                }

                break;
            case 4:

                column = FieldWeight.FIELDFOUR.column;
                row = FieldWeight.FIELDFOUR.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;
            case 5:

                column = FieldWeight.FIELDFIVE.column;
                row = FieldWeight.FIELDFIVE.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;
            case 6:

                column = FieldWeight.FIELDSIX.column;
                row = FieldWeight.FIELDSIX.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;
            case 7:

                column = FieldWeight.FIELDSEVEN.column;
                row = FieldWeight.FIELDSEVEN.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;
            case 8:

                column = FieldWeight.FIELDEIGHT.column;
                row = FieldWeight.FIELDEIGHT.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;
            case 9:

                column = FieldWeight.FIELDNINE.column;
                row = FieldWeight.FIELDNINE.row;

                if (checkField(table, row, column)) {
                    table[row][column] = player.getPin();
                    player.makeAMove();
                } else {
                    alreadyChosen();
                }

                break;

        }

        System.out.println("\n\n");
    }

    public static boolean checkField(char[][] table, int r, int c) {
        if (table[r][c] != 'X' & table[r][c] != 'O')
            return true;
        return false;
    }

    public static void alreadyChosen() {
        System.out.println("A posição já foi escolhida, escolha outra.");
    }

}
