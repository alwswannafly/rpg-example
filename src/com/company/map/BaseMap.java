package com.company.map;

enum BaseMapCellType {
    PLAYER,
    ENEMY,
    WALL,
    EMPTY
}

public class BaseMap {
    private BaseMapCellType[][] map;

    public BaseMapCellType[][] getMap() {
        return map;
    }

    public void setMap(BaseMapCellType[][] map) {
        this.map = map;
    }
}
