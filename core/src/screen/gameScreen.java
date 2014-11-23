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
	private OrthographicCamera camera;
	gameClass gc = new gameClass();
	sailor st = new sailor();
	
	


	private Body ball;
	private BodyDef bodyDef;
	private FixtureDef ballFixture;
	private Stage stage; 
	SpriteBatch batch = new SpriteBatch();
	Texture img=new Texture("kronstadt.jpg");
	Texture attack = new Texture("attack.png");
	Texture orange = new Texture("orange1.png");
	BitmapFont font = new BitmapFont();
	Boolean didAttack = false;
	
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		//return super.keyDown(keycode);
		System.out.println("Button");
		switch (keycode){
		
			case Keys.NUM_1:
				if(didAttack!=true){
					st.addSailors(1);
					st.setText(st.getSailors(1));
				}
				break;
			case Keys.NUM_2:
				if(didAttack!=true){
					st.addSailors(2);
					st.setText(st.getSailors(2));
				}
				break;
			case Keys.NUM_3:
				if(didAttack!=true){
					st.addSailors(3);
					st.setText(st.getSailors(3));
				}
				break;
			case Keys.NUM_4:
				if(didAttack!=true){
					st.addSailors(4);
					st.setText(st.getSailors(4));
				}
				break;
			case Keys.NUM_5:
				if(didAttack!=true){
					st.addSailors(5);
					st.setText(st.getSailors(5));
				}
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
		if((screenX>=601 && screenX <= 800) && (screenY>=535 && screenY <= 620)){
			st.attack();
			didAttack=true;

		}
		//sailor position one
		if((screenX>=140 && screenX <= 205) && (screenY>=150 && screenY <= 215)){
			st.addSailors(1);
			st.setText(st.getSailors(1));
		}
		//sailor position two
		if((screenX>=182 && screenX <= 192) && (screenY>=279 && screenY <= 289)){
			st.addSailors(2);
			st.setText(st.getSailors(2));
}
		//sailor position three
				if((screenX>=305 && screenX <= 315) && (screenY>=325 && screenY <= 335)){
					st.addSailors(3);
					st.setText(st.getSailors(3));
		}
		//sailor position four
		if((screenX>=333 && screenX <= 343) && (screenY>=282 && screenY <= 292)){
			st.addSailors(4);
			st.setText(st.getSailors(4));
		}
		
		//sailor position five
		if((screenX>=305 && screenX <= 315) && (screenY>=177 && screenY <= 187)){
			st.addSailors(5);
			st.setText(st.getSailors(5));
		}
		
		return true;
	}
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 0);
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		
		
		batch.draw(orange, 135, 400);
		batch.draw(orange, 175, 325);
		batch.draw(orange, 300, 280);
		batch.draw(orange, 300, 425);
		batch.draw(orange, 325, 325);
		
		batch.draw(attack, 600, 0);
		
		
		font.draw(batch, "Position 1 :"+st.getSailors(1), 10, 620);
		font.draw(batch, "Position 2 :"+st.getSailors(2), 10, 600);
		font.draw(batch, "Position 3 :"+st.getSailors(3), 10, 580);
		font.draw(batch, "Position 4 :"+st.getSailors(4), 10, 560);
		font.draw(batch, "Position 5 :"+st.getSailors(5), 10, 540);
		
		font.draw(batch, "Position 1 :"+st.getRed(1), 500, 620);
		font.draw(batch, "Position 2 :"+st.getRed(2), 500, 600);
		font.draw(batch, "Position 3 :"+st.getRed(3), 500, 580);
		font.draw(batch, "Position 4 :"+st.getRed(4), 500, 560);
		font.draw(batch, "Position 5 :"+st.getRed(5), 500, 540);
		
		
		
		/*
		batch.draw(orange, 100, 100);
		batch.draw(orange, 200, 200);
		batch.draw(orange, 300, 300);
		batch.draw(orange, 400, 400);
		batch.draw(orange, 500, 500);
		batch.draw(orange, 600, 600);
		*/
		
		batch.end();
		
		
		for(int x=1; x<6;x++){
			if(st.die()==true){
				if(st.getSailorsInt(x)!=0 && st.getRedInt(x)!=0){
					//Attack Logic Goes Here
					System.out.println(Integer.toString(x));
					
					st.killSailors(x);
					
					System.out.println(st.getSailors(x));
			
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}else if(st.die()==false){
				if(st.getSailorsInt(x)!=0 && st.getRedInt(x)!=0){
					//Attack Logic Goes Here
					System.out.println(Integer.toString(x));
					
					st.killRed(x);
					
					System.out.println(st.getRed(x));
					
					
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
