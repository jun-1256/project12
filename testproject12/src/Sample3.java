
public class Sample3 {

	public static void main(String[] args) {
		// while文の基礎
		
		// 初期値が1で、2ずつ増える場合
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("\n");
		
		// 初期値が1で、3ずつ増える場合
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a+=3;
		}
		
		System.out.println("\n");
		
		// 初期値が10で、2ずつ減る場合
		int b = 10;
		while (b >= 1) {
			System.out.println(b);
			b-=2;
		}
		
		System.out.println("\n");
		
		// 初期値が10で、3ずつ減る場合
		int c = 10;
		while (c >= 1) {
			System.out.println(c);
			c-=3;
		}

	}

}
