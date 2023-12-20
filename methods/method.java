import java.util.Scanner;

public class method {

	
	public static void isim() {
		System.out.print("YASİN");
	}
	
	public static int deger(int a) {
		int deger;
		deger=0;
		int i=0;
		while(i<=a) {
			deger +=i;
			i++;
		}
	
		return deger;
	}
	
	public static int top(int a ,int b) {
		int deger;
		deger=a+b;
		return deger;
	}
	public static int car(int a, int b) {
		int deger;
		deger=a*b;
		return deger;
	}
	public static int cık(int a, int b) {
		int deger;
		deger=a-b;
		return deger;
	}
	public static double böl(double a, double b) {
		double deger;
		deger=a/b;
		return deger;
	}	
	
	public static void main(String[] args) {
		int a ,b;
		System.out.print("a degereini giriniz: ");
		Scanner scan =new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("toplam değeri: "+top(a,b));
		System.out.println("çarpım değeri: "+car(a,b));
		System.out.println("fark değeri: "+cık(a,b));
		System.out.println("bölüm değeri: "+böl(a,b));
		System.out.println(top(5,2));
		isim();
		car(4,6);

	}

}
