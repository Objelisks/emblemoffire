/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package environment;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Etane
 */
public class Map {

    protected Tile[][] tiles;
    Texture mapTexture;
    Texture tileTexture;

    public Map(int dimX, int dimY) {
        tiles = new Tile[dimX][dimY];
        tileTexture = new Texture(Gdx.files.internal("images/tile.png"));
    }

    public void loadTiles(String path) {
    }

    public void render(SpriteBatch sb) {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                sb.draw(tileTexture, i*31, j*31);
            }
        }
    }
}
