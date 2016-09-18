package com.mygx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygx.game.FlappyDome;
import com.mygx.game.sprites.Bird;

/**
 * Created by DUKE-KAO on 2016/9/18.
 */
public class PlayState extends State{
    private  Bird bird;


    public PlayState(GameStateManger gsm) {
        super(gsm);
        bird = new Bird(50,300);
        cam.setToOrtho(false ,FlappyDome.WIDTH/2 ,FlappyDome.HEIGHT/2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    protected void update(float dt) {
        handleInput();
        bird.update(dt);

    }

    @Override
    protected void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bird.getPosition(),bird.getPosition().x,bird.getPosition().y);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
