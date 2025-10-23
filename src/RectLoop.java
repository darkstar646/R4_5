//R4_5
/*グラデーションなし
public class RectLoop extends MyFrame2 {
	public void run() {
		setColor(0,128,0);
		
		int y = 50;
		for (int i=0 ; i<10 ; i++) {
			
			int x=130;
			y=y+10;
			x+=(-10)*i;
			
			for(int j=0 ; j<i+1 ; j++) {
				fillRect(x,y,10,10);
				x+=20;
			}
			y+=10;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}
*/

//(0,0)
public class RectLoop extends MyFrame2 {
	public void run() {
		//fillRect(205,0,1,400);
		int n=15;
		int y=70;
		for (int i=0 ; i<n ; i++) {
			
			int x=200;
			x+=(-10)*i;
			
			for(int j=0 ; j<i+1 ; j++) {
				setColor(0,(100+4*n)+(-4*(i+j)),0);
				fillRect(x,y,10,10);
				//System.out.println(x);
				//System.out.println(y);
				//System.out.println("=========");
				//int a=90+10*(i+j);
				x+=20;
				//System.out.println(a);
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(0,0);
		frame1.setSize(400,400);

	}
}

/*
public class RectLoop extends MyFrame2 {
	public void run() {
		fillRect(205,0,1,400);
		int n=15;
		int y=70;
		int c=200;	//色の初期値
		//int count;
		for (int i=0 ; i<n ; i++) {
			
			int x=200;
			x+=(-10)*i;
			
			for(int j=0 ; j<i+1 ; j++) {
				setColor(0,c+(-5*(i+j)),0);
				fillRect(x,y,10,10);
				System.out.println(x);
				System.out.println(y);
				System.out.println("=========");
				//int a=90+10*(i+j);
				x+=20;
				//System.out.println(a);
			}
			c=c+(i+2)*5;
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(0,0);
		frame1.setSize(400,400);

	}
}
*/
