package com.company;

public enum FieldWeight {
    FIELDONE(2, 0, 0),
    FIELDTWO(7, 0, 2),
    FIELDTHREE(6, 0, 4),
    FIELDFOUR(9, 1, 0),
    FIELDFIVE(5, 1, 2),
    FIELDSIX(1, 1, 4),
    FIELDSEVEN(4, 2, 0),
    FIELDEIGHT(3, 2, 2),
    FIELDNINE(8, 2, 4);

    int weight;
    int column;
    int row;

    private FieldWeight(int weight, int row, int column) {
        this.weight = weight;
        this.column = column;
        this.row = row;

    }

}
