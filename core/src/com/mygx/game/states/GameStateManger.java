package com.mygx.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by DUKE-KAO on 2016/9/18.
 */
public class GameStateManger {
    private Stack<State> states;
    public GameStateManger(){
        states = new Stack<State>();
    }
    public void  push(State state){
        states.push(state);
    }
    public  void pop(){
        states.pop();
    }
    public  void set(State state){
        states.pop();
        states.push(state);

    }
    public  void update(float dt){
        states.peek().update(dt);

    }
    public void render(SpriteBatch sb){
    states.peek().render(sb);
    }
}
