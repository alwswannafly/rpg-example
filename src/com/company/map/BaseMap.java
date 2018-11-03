package com.company.map;

import java.awt.*;

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

    // TODO: - realize map drawing
}
