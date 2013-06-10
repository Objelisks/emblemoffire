/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emblemoffire;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import environment.AbstractEnvironment;

/**
 *
 * @author Curtis
 */
public class EmblemOfFire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "EOF";
        cfg.width = 800;
        cfg.height = 480;
        new LwjglApplication(new MainGame(), cfg);
    }
}
