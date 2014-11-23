package text;


public class sailor {
	static String x = "Fun";
	static int[ ] spos = { 0, 0, 0, 0, 0, 0 };
	static int[ ] rpos = { 0, 0, 0, 0, 0, 0 };
	
	
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
		for(int x = 0; x<6; x++){
			rpos[x]=6000;
		}
		
		}	
		
		
	
	
	public boolean die(){
		int x =(int) ((Math.random() * 3) + 1);
		if(x==1){
			return false;
		}else{
			return true;
		}
		
	}

}


