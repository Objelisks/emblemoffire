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
    
    public void create() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        world = new AbstractEnvironment();
        batch = new SpriteBatch();
        playerImage = new Texture(Gdx.files.internal("Hector.png"));
        
    }
    
    public void resize(int i, int i1) {
    }
    
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        // tell the camera to update its matrices.
        camera.update();

        // tell the SpriteBatch to render in the
        // coordinate system specified by the camera.
        batch.setProjectionMatrix(camera.combined);
        //world.render(batch);
        batch.begin();
         batch.draw(playerImage, 100, 100);
         batch.end();

    }
    
    public void pause() {
    }
    
    public void resume() {
    }
    
    public void dispose() {
    }
}
