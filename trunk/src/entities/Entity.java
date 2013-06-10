/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author Curtis
 */
public class Entity {
    protected Vector2 position;
    protected String name;
    
    
    public Entity(String name){
        this.name = name;
        position = new Vector2();
        
        
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
