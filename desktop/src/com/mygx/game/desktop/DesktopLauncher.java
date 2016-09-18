package com.mygx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygx.game.FlappyDome;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyDome.WIDTH;
		config.height = FlappyDome.HEIGHT;
		config.title = FlappyDome.TITLE;
		new LwjglApplication(new FlappyDome(), config);
	}
}
