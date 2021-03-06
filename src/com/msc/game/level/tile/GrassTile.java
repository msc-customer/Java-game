package com.msc.game.level.tile;

import com.msc.game.Graphics.Screen;
import com.msc.game.Graphics.Sprite;

public class GrassTile extends Tile {

    public GrassTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
}
