package basic;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int num[] = {20, 50, 10, 40, 30};
		int temp;
		
		System.out.print("���� �� >>  " );
		for(int su : num){
			System.out.print(su+ "     ");
		}System.out.println();
		
		/*Arrays.sort(num);
		System.out.print("���� �� >>  ");
		for(int su:num){
			System.out.print(su+ "     ");
		}System.out.println();
		*/
		
		for(int i =0; i<num.length-1; i++){
				for(int j =i+1; j<num.length; j++ ){
					if(num[i] > num[j]) { // num[i] : �񱳿��  num[j] : �Ǻ񱳿��
						temp = num[i];
						num[i]=  num[j];
						num[j] = temp;
						// ��Ұ��� �ӽ����庯���� �־�ΰ� �����Ѵ�. // ��������
					}
			}
		}
		
		
	}
}
