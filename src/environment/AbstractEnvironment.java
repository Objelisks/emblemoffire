/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package environment;

import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import entities.Actor;
import entities.MapObject;
import java.util.HashMap;

/**
 *
 * @author Curtis
 */
public class AbstractEnvironment {

    HashMap<String, Actor> actors;
    HashMap<String, MapObject> objects;

    public AbstractEnvironment() {
        actors = new HashMap<String, Actor>();
        objects = new HashMap<String, MapObject>();

    }

    public void addActor(Actor actor) {
        actors.put(actor.getName(), actor);
    }

    public void addObject(MapObject obj) {
        objects.put(obj.getName(), obj);
    }

    public void renderAllActors(SpriteBatch sb) {
        Object[] keys =  actors.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            Actor toRender = actors.get((String)keys[i]);
            toRender.render(sb);
        }
    }

    public void renderAllObjects(SpriteBatch sb) {
        Object[] keys =  objects.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            MapObject toRender = objects.get((String)keys[i]);
            toRender.render(sb);
        }

    }

    public void render(SpriteBatch sb) {

        sb.begin();
        renderAllActors(sb);
        renderAllObjects(sb);
        sb.end();

    }

    public void update() {
    }
}
