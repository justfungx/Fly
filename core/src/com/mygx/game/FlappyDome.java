package com.mygx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygx.game.states.GameStateManger;
import com.mygx.game.states.MenuState;

public class FlappyDome extends ApplicationAdapter {
	public static  final int WIDTH = 480;
	public static  final int HEIGHT = 800;
	public static  final  String TITLE = "FlyMan";
	private GameStateManger gsm;

	protected  SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManger();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push((new MenuState(gsm)));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}