package text;

import screen.gameScreen;


public class sailor {
	static String x = "Fun";
	static int[ ] spos = { 0, 0, 0, 0, 0, 0 };
	static int[ ] rpos = { 0, 0, 0, 0, 0, 0 };
	static int[ ] scordX = { 0, 135, 175, 300, 300, 325 };
	static int[ ] scordY = { 0, 400, 325, 280, 425, 325 };
	static int[]  rcordX = { 0,  40, 150, 280, 700, 700 };
	static int[]  rcordY = { 0,  50,  70,  50, 550, 400 };
	static boolean didAttack, didAdjust, clickAttack = false;
	static int mcount=0;
	
	public Boolean getEnter(){
		return clickAttack;
	}
	public void setEnter(){
		clickAttack=true;
	}
	public Boolean getClickAttack(){
		return clickAttack;
	}
	public void setClickAttack(){
		clickAttack=true;
	}
	public int getX(int x){
		return scordX[x];
	}
	
	public int getY(int x){
		return scordY[x];
	} 
	
	public static void setText(String text){
		x = text;
	}
	
	public static String getText(){
		return x;
	}
	
	public static String getSailors(int position){
		int x = spos[position];
		return Integer.toString(x);
	}
	public static int getSailorsInt(int position){
		int x = spos[position];
		return x;
	}
	
	public static void addSailors(int position){
		if(spos[1]+spos[2]+spos[3]+spos[4]+spos[5]<11000){
		spos[position] = spos[position]+1000;
		}
	}
	
	public static void killSailors(int position){
		spos[position]=spos[position]-1;
		move(position);
	}
	
	public static void killRed(int position){
		rpos[position]=rpos[position]-1;
	}
	
	public static void addRed(int position){
		if(rpos[1]+rpos[2]+rpos[3]+rpos[4]+rpos[5]<11000){
		rpos[position] = rpos[position]+1000;
		}
	}
	
	public static String getRed(int position){
		int x = rpos[position];
		return Integer.toString(x);
	}
	
	public static int getRedInt(int position){
		int x = rpos[position];
		return x;
	}

	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Attack");
		didAttack = true;
		divideRed();
		for(int x = 0; x<6; x++){
			if(spos[x]==0 || rpos[x]==0){
				
			}else{
				if(die()==true){
					spos[x]--;
				}else{
					rpos[x]--;
					
				}
			}
			
		}
		
		}	

	private static void move(int x) {
		mcount++;
		switch(x){
			case 1:
				if(mcount%10==0){
					System.out.println("HEYYYYY");
					rcordX[x]++;
					rcordY[x]=rcordY[x]+3;
				}
				break;
			case 2:
				break;
		}
		
		
		
	}
	public boolean die(){
		int x =(int) ((Math.random() * 3) + 1);
		if(x==1){
			return true;
		}else{
			return false;
		}
		
	}

	public String getSailorImage1() {
		// TODO Auto-generated method stub
		String x = "orange1.png";
		int pos = 1;
		if((spos[pos]==0 && didAttack()==true)){
			x = "death1.png";
			scordX[pos]=135;
			scordY[pos]=400;
		}if((spos[pos]>=1000 && spos[pos]<2000)){
			x = "orange2.png";
			scordX[pos]=133;
			scordY[pos]=397;
		}if(spos[pos]>=2000 && spos[pos]<3000){
			x = "orange3.png";
			scordX[pos]=131;
			scordY[pos]=394;
		}if(spos[pos]>=3000 && spos[pos]<4000){
			x = "orange4.png";
			scordX[pos]=128;
			scordY[pos]=391;
		}if(spos[pos]>=4000 && spos[pos]<5000){
			x = "orange5.png";
			scordX[pos]=125;
			scordY[pos]=388;
		}if(spos[pos]>=5000 && spos[pos]<6000){
			x = "orange6.png";
			scordX[pos]=122;
			scordY[pos]=385;
		}if(spos[pos]>=6000 && spos[pos]<7000){
			x = "orange7.png";
			scordX[pos]=119;
			scordY[pos]=382;
		}if(spos[pos]>=7000 && spos[pos]<8000){
			x = "orange8.png";
			scordX[pos]=116;
			scordY[pos]=379;
		}if(spos[pos]>=8000 && spos[pos]<9000){
			x = "orange9.png";
			scordX[pos]=113;
			scordY[pos]=376;
		}if(spos[pos]>=9000 && spos[pos]<10000){
			x = "orange10.png";
			scordX[pos]=110;
			scordY[pos]=373;
		}if(spos[pos]>=10000 && spos[pos]<=11000){
			x = "orange11.png";
			scordX[pos]=107;
			scordY[pos]=370;
		}
		 
		return x;
	}

	public String getSailorImage2() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String x = "orange1.png";
		int pos = 2;
		if((spos[pos]==0 && didAttack()==true)){
			x = "death1.png";
			scordX[pos]=175;
			scordY[pos]=325;
		}if((spos[pos]>=1000 && spos[pos]<2000)){
			x = "orange2.png";
			scordX[pos]=172;
			scordY[pos]=322;
		}if(spos[pos]>=2000 && spos[pos]<3000){
			x = "orange3.png";
			scordX[pos]=169;
			scordY[pos]=319;
		}if(spos[pos]>=3000 && spos[pos]<4000){
			x = "orange4.png";
			scordX[pos]=166;
			scordY[pos]=316;
		}if(spos[pos]>=4000 && spos[pos]<5000){
			x = "orange5.png";
			scordX[pos]=163;
			scordY[pos]=313;
		}if(spos[pos]>=5000 && spos[pos]<6000){
			x = "orange6.png";
			scordX[pos]=160;
			scordY[pos]=310;
		}if(spos[pos]>=6000 && spos[pos]<7000){
			x = "orange7.png";
			scordX[pos]=157;
			scordY[pos]=307;
		}if(spos[pos]>=7000 && spos[pos]<8000){
			x = "orange8.png";
			scordX[pos]=154;
			scordY[pos]=304;
		}if(spos[pos]>=8000 && spos[pos]<9000){
			x = "orange9.png";
			scordX[pos]=151;
			scordY[pos]=301;
		}if(spos[pos]>=9000 && spos[pos]<10000){
			x = "orange10.png";
			scordX[pos]=148;
			scordY[pos]=298;
		}if(spos[pos]>=10000 && spos[pos]<=11000){
			x = "orange11.png";
			scordX[pos]=145;
			scordY[pos]=295;
		}
		 
		return x;
	}
	
	public String getSailorImage3() {
		String x = "orange1.png";
		int pos = 3;
		if((spos[pos]==0 && didAttack()==true)){
			x = "death1.png";
			scordX[pos]=300;
			scordY[pos]=280;
		}if((spos[pos]>=1000 && spos[pos]<2000)){
			x = "orange2.png";
			scordX[pos]=297;
			scordY[pos]=277;
		}if(spos[pos]>=2000 && spos[pos]<3000){
			x = "orange3.png";
			scordX[pos]=294;
			scordY[pos]=274;
		}if(spos[pos]>=3000 && spos[pos]<4000){
			x = "orange4.png";
			scordX[pos]=291;
			scordY[pos]=271;
		}if(spos[pos]>=4000 && spos[pos]<5000){
			x = "orange5.png";
			scordX[pos]=288;
			scordY[pos]=268;
		}if(spos[pos]>=5000 && spos[pos]<6000){
			x = "orange6.png";
			scordX[pos]=285;
			scordY[pos]=265;
		}if(spos[pos]>=6000 && spos[pos]<7000){
			x = "orange7.png";
			scordX[pos]=282;
			scordY[pos]=262;
		}if(spos[pos]>=7000 && spos[pos]<8000){
			x = "orange8.png";
			scordX[pos]=279;
			scordY[pos]=269;
		}if(spos[pos]>=8000 && spos[pos]<9000){
			x = "orange9.png";
			scordX[pos]=276;
			scordY[pos]=266;
		}if(spos[pos]>=9000 && spos[pos]<10000){
			x = "orange10.png";
			scordX[pos]=273;
			scordY[pos]=263;
		}if(spos[pos]>=10000 && spos[pos]<=11000){
			x = "orange11.png";
			scordX[pos]=270;
			scordY[pos]=260;
		}
		 
		return x;
	}

	public String getSailorImage4() {
		String x = "orange1.png";
		int pos = 4;
		if((spos[pos]==0 && didAttack()==true)){
			x = "death1.png";
			scordX[pos]=300;
			scordY[pos]=425;
		}if((spos[pos]>=1000 && spos[pos]<2000)){
			x = "orange2.png";
			scordX[pos]=297;
			scordY[pos]=422;
		}if(spos[pos]>=2000 && spos[pos]<3000){
			x = "orange3.png";
			scordX[pos]=294;
			scordY[pos]=419;
		}if(spos[pos]>=3000 && spos[pos]<4000){
			x = "orange4.png";
			scordX[pos]=291;
			scordY[pos]=416;
		}if(spos[pos]>=4000 && spos[pos]<5000){
			x = "orange5.png";
			scordX[pos]=288;
			scordY[pos]=413;
		}if(spos[pos]>=5000 && spos[pos]<6000){
			x = "orange6.png";
			scordX[pos]=285;
			scordY[pos]=410;
		}if(spos[pos]>=6000 && spos[pos]<7000){
			x = "orange7.png";
			scordX[pos]=282;
			scordY[pos]=407;
		}if(spos[pos]>=7000 && spos[pos]<8000){
			x = "orange8.png";
			scordX[pos]=279;
			scordY[pos]=404;
		}if(spos[pos]>=8000 && spos[pos]<9000){
			x = "orange9.png";
			scordX[pos]=276;
			scordY[pos]=401;
		}if(spos[pos]>=9000 && spos[pos]<10000){
			x = "orange10.png";
			scordX[pos]=273;
			scordY[pos]=398;
		}if(spos[pos]>=10000 && spos[pos]<=11000){
			x = "orange11.png";
			scordX[pos]=270;
			scordY[pos]=395;
		}
		return x;
		 
		
	}

	public String getSailorImage5() {
		String x = "orange1.png";
		int pos=5;
		if((spos[pos]==0 && didAttack()==true)){
			x = "death1.png";
			scordX[pos]=325;
			scordY[pos]=325;
		}if((spos[pos]>=1000 && spos[pos]<2000)){
			x = "orange2.png";
			scordX[pos]=322;
			scordY[pos]=322;
		}if(spos[pos]>=2000 && spos[pos]<3000){
			x = "orange3.png";
			scordX[pos]=319;
			scordY[pos]=319;
		}if(spos[pos]>=3000 && spos[pos]<4000){
			x = "orange4.png";
			scordX[pos]=316;
			scordY[pos]=316;
		}if(spos[pos]>=4000 && spos[pos]<5000){
			x = "orange5.png";
			scordX[pos]=313;
			scordY[pos]=313;
		}if(spos[pos]>=5000 && spos[pos]<6000){
			x = "orange6.png";
			scordX[pos]=310;
			scordY[pos]=310;
		}if(spos[pos]>=6000 && spos[pos]<7000){
			x = "orange7.png";
			scordX[pos]=307;
			scordY[pos]=307;
		}if(spos[pos]>=7000 && spos[pos]<8000){
			x = "orange8.png";
			scordX[pos]=304;
			scordY[pos]=304;
		}if(spos[pos]>=8000 && spos[pos]<9000){
			x = "orange9.png";
			scordX[pos]=301;
			scordY[pos]=301;
		}if(spos[pos]>=9000 && spos[pos]<10000){
			x = "orange10.png";
			scordX[pos]=298;
			scordY[pos]=298;
		}if(spos[pos]>=10000 && spos[pos]<=11000){
			x = "orange11.png";
			scordX[pos]=295;
			scordY[pos]=295;
		}
		return x;
	}

	public int getRedX(int i) {
		// TODO Auto-generated method stub
		int x = rcordX[i];
		return x;
	}
	
	public int getRedY(int i) {
		// TODO Auto-generated method stub
		int x = rcordY[i];
		return x;
	}
	
	public void divideRed(){
		int men = 30000;
		int x=0;
		for(int counter=1; counter<6; counter++){
			if(counter<5){
				x = (int) (Math.random()*(men/2));
				men= men-x;
				rpos[counter]=x;
				System.out.println(counter+" "+x);
			}else{
				x=men;
				rpos[counter]=x;
				System.out.println(counter+" "+x);
			
			
			}
		}
	}
	
	public boolean didAttack(){
		if(didAttack==true){
			return true;
		}else{
			return false;
		}
	}
	
	public String getRedImage(int x){
		String str = "red1.png";
		switch(x){
			case 1:
				if(rpos[x]==0 && didAttack()==true){
					str = "death2.png";
				}if(rpos[x]>0 && rpos[x]<1000){
					str = "red1.png";
				}if(rpos[x]>=1000 && rpos[x]<2000){
					str = "red2.png";
				}if(rpos[x]>=2000 && rpos[x]<3000){
					str = "red3.png";
				}if(rpos[x]>=3000 && rpos[x]<4000){
					str = "red4.png";
				}if(rpos[x]>=4000 && rpos[x]<5000){
					str = "red5.png";
				}if(rpos[x]>=5000 && rpos[x]<6000){
					str = "red6.png";
				}if(rpos[x]>=6000 && rpos[x]<7000){
					str = "red7.png";
				}if(rpos[x]>=7000 && rpos[x]<8000){
					str = "red8.png";
				}if(rpos[x]>=8000 && rpos[x]<9000){
					str = "red9.png";
				}if(rpos[x]>=9000 ){
					str = "red10.png";
				}
				break;
			case 2:
				if(rpos[x]==0 && didAttack()==true){
					str = "death2.png";
				}if(rpos[x]>0 && rpos[x]<1000){
					str = "red1.png";
				}if(rpos[x]>=1000 && rpos[x]<2000){
					str = "red2.png";
				}if(rpos[x]>=2000 && rpos[x]<3000){
					str = "red3.png";
				}if(rpos[x]>=3000 && rpos[x]<4000){
					str = "red4.png";
				}if(rpos[x]>=4000 && rpos[x]<5000){
					str = "red5.png";
				}if(rpos[x]>=5000 && rpos[x]<6000){
					str = "red6.png";
				}if(rpos[x]>=6000 && rpos[x]<7000){
					str = "red7.png";
				}if(rpos[x]>=7000 && rpos[x]<8000){
					str = "red8.png";
				}if(rpos[x]>=8000 && rpos[x]<9000){
					str = "red9.png";
				}if(rpos[x]>=9000 ){
					str = "red10.png";
				}
				break;
			case 3:
				if(rpos[x]==0 && didAttack()==true ){
					str = "death2.png";
				}if(rpos[x]>0 && rpos[x]<1000){
					str = "red1.png";
				}if(rpos[x]>=1000 && rpos[x]<2000){
					str = "red2.png";
				}if(rpos[x]>=2000 && rpos[x]<3000){
					str = "red3.png";
				}if(rpos[x]>=3000 && rpos[x]<4000){
					str = "red4.png";
				}if(rpos[x]>=4000 && rpos[x]<5000){
					str = "red5.png";
				}if(rpos[x]>=5000 && rpos[x]<6000){
					str = "red6.png";
				}if(rpos[x]>=6000 && rpos[x]<7000){
					str = "red7.png";
				}if(rpos[x]>=7000 && rpos[x]<8000){
					str = "red8.png";
				}if(rpos[x]>=8000 && rpos[x]<9000){
					str = "red9.png";
				}if(rpos[x]>=9000 ){
					str = "red10.png";
				}
				break;
			case 4:
				if(rpos[x]==0 && didAttack()==true){
					str = "death2.png";
				}if(rpos[x]>=1000 && rpos[x]<2000){
					str = "red2.png";
				}if(rpos[x]>=0 && rpos[x]<1000){
					str = "red1.png";
				}if(rpos[x]>=2000 && rpos[x]<3000){
					str = "red3.png";
				}if(rpos[x]>=3000 && rpos[x]<4000){
					str = "red4.png";
				}if(rpos[x]>=4000 && rpos[x]<5000){
					str = "red5.png";
				}if(rpos[x]>=5000 && rpos[x]<6000){
					str = "red6.png";
				}if(rpos[x]>=6000 && rpos[x]<7000){
					str = "red7.png";
				}if(rpos[x]>=7000 && rpos[x]<8000){
					str = "red8.png";
				}if(rpos[x]>=8000 && rpos[x]<9000){
					str = "red9.png";
				}if(rpos[x]>=9000 ){
					str = "red10.png";
				}
				break;
			case 5:
				if(rpos[x]>0 && rpos[x]<1000){
					str = "red1.png";
				}if(rpos[x]==0 && didAttack()==true ){
					str = "death2.png";
				}if(rpos[x]>=1000 && rpos[x]<2000){
					str = "red2.png";
				}if(rpos[x]>=2000 && rpos[x]<3000){
					str = "red3.png";
				}if(rpos[x]>=3000 && rpos[x]<4000){
					str = "red4.png";
				}if(rpos[x]>=4000 && rpos[x]<5000){
					str = "red5.png";
				}if(rpos[x]>=5000 && rpos[x]<6000){
					str = "red6.png";
				}if(rpos[x]>=6000 && rpos[x]<7000){
					str = "red7.png";
				}if(rpos[x]>=7000 && rpos[x]<8000){
					str = "red8.png";
				}if(rpos[x]>=8000 && rpos[x]<9000){
					str = "red9.png";
				}if(rpos[x]>=9000 ){
					str = "red10.png";
				}
				break;
		}
		
		return str;
	}
	public String getTotalRed() {
		int total=0;
		for(int x=1; x<6; x++){
			total=rpos[x]+total;
		}
		
		return Integer.toString(total)+"/30000";
		
	}
	
	public String getTotalSailors() {
		int total=0;
		for(int x=1; x<6; x++){
			total=spos[x]+total;
		}
		return Integer.toString(total)+"/11000";
	}

}


