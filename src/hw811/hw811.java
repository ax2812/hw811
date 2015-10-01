package hw811;
import java.util.Scanner;

public class hw811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入 a b c d e f    形式如下: ax+by = e  cx+dy = f");
		double na = s.nextDouble();
		double nb = s.nextDouble();
		double nc = s.nextDouble();
		double nd = s.nextDouble();
		double ne = s.nextDouble();
		double nf = s.nextDouble();
		LinearEquation Q1 =  new LinearEquation(na,nb,nc,nd,ne,nf);
		if(Q1.isSolvable() == true){
			System.out.println("x = " + Q1.getX() + " y = " + Q1.getY());
		}
		else{
			
			System.out.println("這個問題沒有解");
		}
		
	}

}
class LinearEquation{
	private double a,b,c,d,e,f ;
	LinearEquation(double newa, double newb,double newc,double newd,double newe,double newf){
		a = newa;
		b = newb;
		c = newc;
		d = newd;
		e = newe;
		f = newf;
		
	}
	double geta(){
		return a;	
	}
	double getb(){
		return b;	
	}
	double getc(){
		return c;	
	}
	double getd(){
		return d;	
	}
	double gete(){
		return e;	
	}
	double getf(){
		return f;	
	}
	
	boolean isSolvable(){
		if(a*d-b*c == 0){
			return false;
		}
		else{
			return true;
		}
	}
	double getX(){
		return ((e*d)-(b*f))/((a*d)-(b*c)) ; 
	}
	double getY(){
		return ((a*f)-(e*c))/((a*d)-(b*c)) ; 
	}
	
	
	
	
	
}