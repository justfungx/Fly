package com.mygx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygx.game.FlappyDome;

/**
 * Created by DUKE-KAO on 2016/9/18.
 */
public class MenuState extends State{
    private  Texture backqround;
    private Texture playBtn;

    public MenuState(GameStateManger gsm) {
        super(gsm);
        backqround = new Texture("bg.png");
        playBtn = new Texture("playBtn.png");
    }

    @Override
    public void handleInput() {
    if(Gdx.input.justTouched()){
        gsm.set(new PlayState(gsm));
        dispose();
    }
    }

    @Override
    public void update(float dt) {
    handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
    sb.begin();
        sb.draw(backqround , 0,0, FlappyDome.WIDTH,FlappyDome.HEIGHT);
        sb.draw(playBtn, (FlappyDome.WIDTH/2)-(FlappyDome.HEIGHT/2),FlappyDome.HEIGHT/2);
        sb.end();
    }

    @Override
    public void dispose() {
        backqround.dispose();
        playBtn.dispose();
    }
}
