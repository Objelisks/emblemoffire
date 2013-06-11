/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emblemoffire;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import entities.Actor;
import environment.AbstractEnvironment;

/**
 *
 * @author Curtis
 */
public class MainGame implements ApplicationListener {
    
    OrthographicCamera camera;
    SpriteBatch batch;
    AbstractEnvironment world;
    Texture playerImage;
    Actor cPlayer;
    
    public void create() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        world = new AbstractEnvironment();
        batch = new SpriteBatch();
        cPlayer = new Actor("Hector", "Hector.png");
        world.addActor(cPlayer);
    }
    
    public void resize(int i, int i1) {
    }
    
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0.1f, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        world.render(batch);
        update(Gdx.graphics.getDeltaTime());
    }
    
    public void update(float delta) {
        world.update(delta);
    }
    
    public void pause() {
    }
    
    public void resume() {
    }
    
    public void dispose() {
    }
}
