package com.mygx.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by DUKE-KAO on 2016/9/18.
 */
public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManger gsm;

    protected  State(GameStateManger gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();

    }
    protected  abstract  void  handleInput();
    protected  abstract  void update(float dt);
    protected  abstract  void render(SpriteBatch sb);
    public  abstract  void dispose();
}
