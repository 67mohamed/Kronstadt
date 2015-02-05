package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import screen.gameScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class gameClass extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		gameScreen inputProcessor = new gameScreen();
		Gdx.input.setInputProcessor(inputProcessor);
		setScreen(new gameScreen());
		render();
	}
	
	
	public void render(){super.render();}
	public void one(){
		System.out.println("one was hit");
	}
	
	public void gameOverLaunch(){
		gameScreen inputProcessor = new gameScreen();
		Gdx.input.setInputProcessor(inputProcessor);
		setScreen(new gameOverScreen());
		render();
	}
}
