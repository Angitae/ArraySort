package basic;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int num[] = {20, 50, 10, 40, 30};
		int temp;
		
		System.out.print("정렬 전 >>  " );
		for(int su : num){
			System.out.print(su+ "     ");
		}System.out.println();
		
		/*Arrays.sort(num);
		System.out.print("정렬 후 >>  ");
		for(int su:num){
			System.out.print(su+ "     ");
		}System.out.println();
		*/
		
		for(int i =0; i<num.length-1; i++){
				for(int j =i+1; j<num.length; j++ ){
					if(num[i] > num[j]) { // num[i] : 비교요소  num[j] : 피비교요소
						temp = num[i];
						num[i]=  num[j];
						num[j] = temp;
						// 요소값을 임시저장변수에 넣어두고 대입한다. // 순차정렬
					}
			}
		}
		
		
	}
}
