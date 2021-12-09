package com.company;

public enum FieldWeight {
    FIELDONE(0, 0),
    FIELDTWO(0, 2),
    FIELDTHREE(0, 4),
    FIELDFOUR(1, 0),
    FIELDFIVE(1, 2),
    FIELDSIX(1, 4),
    FIELDSEVEN(2, 0),
    FIELDEIGHT(2, 2),
    FIELDNINE(2, 4);

    int column;
    int row;

    private FieldWeight(int row, int column) {
        this.column = column;
        this.row = row;

    }

}
