package screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
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

public class gameScreen implements Screen {

	private World world;
	private Box2DDebugRenderer drender;
	private OrthographicCamera camera;
	private Body ball;
	private BodyDef bodyDef;
	private FixtureDef ballFixture;
	private Stage stage; 
	SpriteBatch batch = new SpriteBatch();
	Texture img=new Texture("kronstadt.jpg");
	Texture orange = new Texture("orange1.png");
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		
		/*
		Skin skin = new Skin(Gdx.files.internal("data/uiskin"));
		Label label = new Label("I am label", skin);
		label.setX(10);
		label.setY(10);
		stage.addActor(label);
		*/
		
		
		/*
		 if( (touchpoint.x<100) && (touchpoint.y<100) ){
			   // payload
			 }
		*/
		
		
		batch.draw(orange, 135, 400);
		batch.draw(orange, 175, 325);
		batch.draw(orange, 300, 280);
		batch.draw(orange, 300, 425);
		batch.draw(orange, 325, 325);
		
		
		batch.draw(orange, 100, 100);
		batch.draw(orange, 200, 200);
		batch.draw(orange, 300, 300);
		batch.draw(orange, 400, 400);
		batch.draw(orange, 500, 500);
		batch.draw(orange, 600, 600);
		batch.end();
		
		//drender.render(world, camera.combined);
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
		dispose();
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
		world.dispose();
		drender.dispose();
	}

}
