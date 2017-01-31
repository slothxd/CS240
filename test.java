package package1;
import java.util.Arrays;

public class test {

	public static void reverse(int[] array, int a, int b) {
		if(a >= b){
			return;
		}
		
	
			int temp = array[a];
			array[b] = array[a];
			array[a] = temp;
			
			reverse(array, a+1, b-1);
		}
		
	

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,7,7,8,9,10,11,12,13};
		reverse(a, 0, 14);
		System.out.println(Arrays.toString(a));
	}

}