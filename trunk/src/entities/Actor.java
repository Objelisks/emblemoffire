/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Curtis
 */
public class Actor extends Entity {

    protected int health;
    protected int moveRange;

    public Actor(String name, String spritePath) {
        super(name);
        texture = new Texture(Gdx.files.internal(spritePath));
        sprite = new Sprite(texture);
        sprite.setSize(32, 32);
        sprite.setPosition(200, 200);
    }
    
      public void render(SpriteBatch sb){
     sprite.draw(sb);
        
    }
    
}
