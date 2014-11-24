package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.gameClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new gameClass(), "Kronstadt Rises Up",800,620);
	}
}

//static int[ ] scordX = { 0, 135, 175, 300, 300, 325 };
//static int[ ] scordY = { 0, 400, 325, 280, 425, 325 };