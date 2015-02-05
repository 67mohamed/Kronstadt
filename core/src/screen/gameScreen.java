package screen;

import text.sailor;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.gameClass;


public class gameScreen extends InputAdapter implements Screen, ApplicationListener {


	public String text = "Not Working";

	gameClass gc = new gameClass();
	sailor st = new sailor();

	SpriteBatch batch = new SpriteBatch();
	Texture img=new Texture("kronstadt.png");
	Texture attack = new Texture("attack.png");
	Texture yes = new Texture("yes.png");
	Texture no = new Texture("no.png");
	BitmapFont font = new BitmapFont();
	int counterForMain=0;

	
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		//return super.keyDown(keycode);
		System.out.println("Button");
		
		switch (keycode){
			case Keys.ENTER:
				if(st.getEnter()==false){
					st.setEnter();
					st.attack();
				}
				
			case Keys.NUM_1:
				if(st.didAttack()!=true){
					st.addSailors(1);
					st.setText(st.getSailors(1));
					
				}
				break;
			case Keys.NUM_2:
				if(st.didAttack()!=true){
					st.addSailors(2);
					st.setText(st.getSailors(2));
				}
				break;
			case Keys.NUM_3:
				if(st.didAttack()!=true){
					st.addSailors(3);
					st.setText(st.getSailors(3));
				}
				break;
				
			//Switching of four and five is done to rectify counting issue 
			//that came about when setting up the UI	
			case Keys.NUM_4:
				if(st.didAttack()!=true){
					st.addSailors(5);
					st.setText(st.getSailors(5));
				}
				break;
			case Keys.NUM_5:
				if(st.didAttack()!=true){
					st.addSailors(4);
					st.setText(st.getSailors(4));
				}
				break;
			case Keys.DPAD_UP:
				st.speedUp();
				break;
			case Keys.DPAD_DOWN:
				st.slowDown();
				break;
			case Keys.DPAD_LEFT:
				st.decreaseDeath();
				break;
			case Keys.DPAD_RIGHT:
				st.increaseDeath();
				break;
				
		}
		return true;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		//return super.touchDown(screenX, screenY, pointer, button);
		System.out.println("Clicked at :" + screenX  +" "+ screenY);
		
		//Attack
		if(st.getClickAttack()==false){
			if((screenX>=601 && screenX <= 800) && (screenY>=535 && screenY <= 620)){
				st.attack();
				st.setClickAttack();
			}
		}
		
		//Yes Button
		if((screenX>=405 && screenX <= 435) && (screenY>=525 && screenY <= 560)){
			st.choseYes();
		}
		
		//No Button
		if((screenX>=455 && screenX <= 485) && (screenY>=533 && screenY <= 593)){
			st.choseNo();
		}
		
		//sailor position one
		if((screenX>=140 && screenX <= 205) && (screenY>=150 && screenY <= 215)){
			if(st.didAttack()!=true){
				st.addSailors(1);
				st.setText(st.getSailors(1));
			}
		}
		//sailor position two
		if((screenX>=182 && screenX <= 192) && (screenY>=279 && screenY <= 289)){
			if(st.didAttack()!=true){
				st.addSailors(2);
				st.setText(st.getSailors(2));
			}
}
		//sailor position three
		if((screenX>=305 && screenX <= 315) && (screenY>=325 && screenY <= 335)){
			if(st.didAttack()!=true){
				st.addSailors(3);
				st.setText(st.getSailors(3));
			}
		}
		//sailor position four
		if((screenX>=333 && screenX <= 343) && (screenY>=282 && screenY <= 292)){
			if(st.didAttack()!=true){
				st.addSailors(5);
				st.setText(st.getSailors(5));
			}
		}
		
		//sailor position five
		if((screenX>=305 && screenX <= 315) && (screenY>=177 && screenY <= 187)){
			if(st.didAttack()!=true){
				st.addSailors(4);
				st.setText(st.getSailors(4));
			}
		}
		
		return true;
	}
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 0);
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		gameClass gc = new gameClass();
		
		if(st.gameOver()){
			gc.gameOverLaunch();
		}
		Texture orange1 = new Texture(st.getSailorImage1());
		Texture orange2 = new Texture(st.getSailorImage2());
		Texture orange3 = new Texture(st.getSailorImage3());
		Texture orange5 = new Texture(st.getSailorImage4());
		Texture orange4 = new Texture(st.getSailorImage5());
		
		Texture red1 = new Texture(st.getRedImage(1));
		Texture red2 = new Texture(st.getRedImage(2));
		Texture red3 = new Texture(st.getRedImage(3));
		Texture red4 = new Texture(st.getRedImage(4));
		Texture red5 = new Texture(st.getRedImage(5));
		
		counterForMain++;
		batch.draw(orange1, st.getX(1), st.getY(1));
		batch.draw(orange2, st.getX(2), st.getY(2));
		batch.draw(orange3, st.getX(3), st.getY(3));
		batch.draw(orange5, st.getX(4), st.getY(4));
		batch.draw(orange4, st.getX(5), st.getY(5));
		
		if(st.didAttack() == false){
			batch.draw(attack, 600, 0);
		}
		
		
		
		
		
		batch.draw(red1, st.getRedX(1), st.getRedY(1));
		batch.draw(red2, st.getRedX(2), st.getRedY(2));
		batch.draw(red3, st.getRedX(3), st.getRedY(3));
		batch.draw(red4, st.getRedX(4), st.getRedY(4));
		batch.draw(red5, st.getRedX(5), st.getRedY(5));
		
		font.draw(batch, st.getSpeed(), 400,210);
		font.draw(batch, st.getEffeciency(), 400, 180);
		st.moveTime();
		
		font.draw(batch, st.getSituation(), 400, 150);
		
		if(st.keepChecks()){
			batch.draw(yes, 400,  50);
			batch.draw(no,  450,  50);
		}
		
		font.draw(batch, "Position 1 :"+st.getSailors(1), 10, 620);
		font.draw(batch, "Position 2 :"+st.getSailors(2), 10, 600);
		font.draw(batch, "Position 3 :"+st.getSailors(3), 10, 580);
		font.draw(batch, "Position 4 :"+st.getSailors(5), 10, 560);
		font.draw(batch, "Position 5 :"+st.getSailors(4), 10, 540);
		font.draw(batch, "Total         :"+st.getTotalSailors(), 10, 520);
		
		font.draw(batch, "Position 1 :"+st.getRed(1), 500, 620);
		font.draw(batch, "Position 2 :"+st.getRed(2), 500, 600);
		font.draw(batch, "Position 3 :"+st.getRed(3), 500, 580);
		font.draw(batch, "Position 4 :"+st.getRed(5), 500, 560);
		font.draw(batch, "Position 5 :"+st.getRed(4), 500, 540);
		font.draw(batch, "Total         :"+st.getTotalRed(), 500, 520);
		//font.draw(batch, Integer.toString(counterForMain), 500, 480);
		

		/*
		batch.draw(orange1, 100, 100);
		batch.draw(orange1, 200, 200);
		batch.draw(orange1, 300, 300);
		batch.draw(orange1, 400, 400);
		batch.draw(orange1, 500, 500);
		batch.draw(orange1, 600, 600);
		*/
		
		batch.end();
		
		
		for(int x=1; x<6;x++){
			if(st.die()==true){
				if(st.getSailorsInt(x)!=0 && st.getRedInt(x)!=0){
					//Attack Logic Goes Here
					//System.out.println(Integer.toString(x));
					
					st.killSailors(x);
					
					//System.out.println(st.getSailors(x));
			
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}else if(st.die()==false){
				if(st.getSailorsInt(x)!=0 && st.getRedInt(x)!=0){
					//Attack Logic Goes Here
					//System.out.println(Integer.toString(x));
					
					st.killRed(x);
					
					//System.out.println(st.getRed(x));
					
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}
		}
		
		
	}

	private CharSequence returnText() {
		return text;
	}
	
	private CharSequence setText(String x) {
		text = x;
		return text;
	}

	
	@Override
	public void resize(int width, int height) {
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	

}
