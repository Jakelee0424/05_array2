package edu.kh.array2.practice;

import java.util.Scanner;
import java.util.Arrays;

public class Array2Practice {

	Scanner sc = new Scanner(System.in);
	
	public void prac1() {
		
		int[] bingo = new int[25];
		int index = 0;
		
		for(int x = 0 ; x < 25 ; x++) {
			int random = (int)(Math.random()*25+1);
			bingo[x] = random;
			
			for(int y = 0 ; y < x ; y++) {
				if(bingo[y] == random) {
					x--;
					break;
				}
			}

		} 
		int[][] arr = new int[5][5];

		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				arr[i][j] = bingo[index++];	
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.print("1~25의 숫자를 입력하세요(종료 : 0) = ");
		int input = sc.nextInt();
		
		
		while(input != 0) {
		for(int z = 0 ; z < 5 ; z++) {
			for(int z2 = 0 ; z2< 5 ; z2++) {
				if(input == arr[z][z2]) {
					arr[z][z2] = 0;
				}System.out.print(arr[z][z2] + "\t");
			}
			System.out.println();
		}	
		System.out.print("1~25의 숫자를 입력하세요(종료 : 0) = ");
		input = sc.nextInt();
		}		
		
	}

	public void practice1() {
		
		String[][] arr = new String[3][3];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				arr[i][j] = "(" + i + " , "+ j+ ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];
		int num = 1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + "\t");
			} 
		System.out.println();
		}	
	
	}
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		int num = arr.length*arr.length;
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			for(int j = arr.length-1 ; j >= 0 ; j--) {
				arr[i][j] = num--;
				System.out.print(arr[i][j] + "\t");
			}
		System.out.println();
		}	
		
	
	}

	public void practice4() {

		
/*
 4행 4열 2차원 배열을 생성하여 
 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
 아래의 내용처럼 처리하세요
 		  0열  			   1열 		  		2열 			3열
0행 	  값 				값				값 			0행 값들의 합
1행 	  값 				값 				값 			1행 값들의 합
2행 	  값 				값   			값 			2행 값들의 합
3행 | 0열 값들의 합 | 1열 값들의 합 | 2열 값들의 합  | 		총합
		 */
		
		
		int[][] arr = new int[4][4];
		
				
		for(int i = 0 ; i < arr.length ; i++) {	
			for(int j =0 ; j < arr[i].length ; j++) {	
				if(i < arr.length-1 && j < arr[i].length-1) {
					arr[i][j] = (int)(Math.random()*10+1);	
				} 	
				
			}
			
		}
		int rowSum = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j =0 ; j < arr[i].length-1 ; j++) {
				arr[i][arr.length-1] += arr[i][j];
				rowSum += arr[i][j];
			}
		
		}
		int colSum = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j =0 ; j < arr[i].length-1 ; j++) {
				arr[arr.length-1][i] += arr[j][i];
				colSum += arr[i][j];
			}
		
		}
		arr[arr.length-1][arr.length-1] = rowSum+colSum;
		for(int i=0 ; i < arr.length ; i++) {
			for(int j=0 ; j< arr.length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	

	public void practice5() {

		int num = 1;

		while(num != 0) {

			System.out.print("행크기 = ");
			int row = sc.nextInt();

			System.out.print("열크기 = ");
			int col = sc.nextInt();

			if(row <= 1 || row >= 10 || col <= 1 || col >= 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}else {
				
				char[][] arr = new char[row][col];
				num = 0;
				
				for(int i = 0 ; i < row ; i++) {
					for(int j = 0 ; j < col ; j++ ) {
						arr[i][j] = (char)(64+ (Math.random()*26+1));
						System.out.print(arr[i][j] + "\t");
					}
					System.out.println();
				}
			}

		}
	}
	

	public void practice6() {
	
		System.out.print("행의 크기 입력 =");
		int input = sc.nextInt();
		char[][] arr = new char[input][];
		
		for(int i = 0 ; i < input ; i++) {
			System.out.printf("%d 열의 크기 = ", i);
			arr[i] = new char[sc.nextInt()];
			
		}
		char a = 'a';
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = (char) a++;
				System.out.print(arr[i][j] + "\t");		
			}
			System.out.println();
		}
		
		
		
	}

	public void practice7() {

		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr = new String[3][2];
		String[][] arr2 = new String[3][2];

		int num = 0;
		int bun = 1;

		while(num != 12) {
			System.out.printf("==== %d분단 ====\n", bun++);
			for(int i = 0 ; i < arr.length ; i++) {		
				for(int j = 0 ; j < arr[i].length ; j++) {
					if(arr[i][j] == null) {
						arr[i][j] = students[num++];
						System.out.print(arr[i][j] + "\t");

					} else { 

						arr2[i][j] = students[num++];
						System.out.print(arr2[i][j] + " \t");
					}
				}
				System.out.println();
			}	
		}
	}

	public void practice8() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr = new String[3][2];
		String[][] arr2 = new String[3][2];

		int num = 0;
		int bun = 1;

		while(num != 12) {
			System.out.printf("==== %d분단 ====\n", bun++);
			for(int i = 0 ; i < arr.length ; i++) {		
				for(int j = 0 ; j < arr[i].length ; j++) {
					if(arr[i][j] == null) {
						arr[i][j] = students[num++];
						System.out.print(arr[i][j] + "\t");

					} else { 

						arr2[i][j] = students[num++];
						System.out.print(arr2[i][j] + " \t");
					}
				}
				System.out.println();
			}	
		}
		
		System.out.println("==========================");
		System.out.print("검색할 학생 이름을 입력하세요 = ");
		String input2 = sc.next();
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <arr[i].length ; j++) {
				
				if(arr[i][j] == input2) {
					System.out.print("검색하신 " + input2 + "학생은 1분단" + "번째 줄에 있습니다." );
			
				}
			}
		}
		
	}
}
	


