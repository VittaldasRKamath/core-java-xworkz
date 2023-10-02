 public class ReversingArray {

	static String chocolates[] = {"dairymilk","cadberry","kitkat"};
	public static void main(String[] args){
		for(int i=chocolates.length-1;i>=0;i--){
			System.out.println(chocolates[i]);
		}
	}
}