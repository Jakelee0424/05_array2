package edu.kh.array2.ex;

import java.util.Scanner;
import java.util.Arrays;

public class Array2Example {

	Scanner sc = new Scanner(System.in);
	
	// 2차원 배열
	// 자료형이 같은 1차원 배열을 묶음으로 다루는 것(행, 열 개념 추가)
	
	public void ex1() {
		
		// 2차원 배열의 선언
		
		int[][] arr; // int 2차원 배열을 참조하는 참조변수 선언
					 // 참조형 == 참조변수 == 레퍼런스 변수 == 레퍼런스(Reference)
		
		// 2차원 배열 할당 -> new 자료형[행][열]
		
		arr = new int[2][3]; // heap 영역에 int 2차원 배열 2행 3열 할당
		
		// 2차원 배열 초기화
		
			// 1) 행, 열 인덱스를 이용한 직접 초기화
			arr[0][0] = 10; 
			arr[0][1] = 20;
			arr[0][2] = 30; 
		
			//2) 2중 for문을 이용한 초기화
			int num = 10; // 배열 요소 초기화에 사용할 변수
			// 배열명.length -> 변수가 직접참조하고 있는 배열의 길이 반환
			
			System.out.println(arr.length);
			System.out.println(arr[0].length); // 0행이 참조하는 1차원 배열의 길이 반환
			System.out.println(arr[1].length); // 1행이 참조하는 1차원 배열의 길이 반환

			
			for(int row = 0 ; row < arr.length ; row++) { //행 반복(0,1)
				for(int col = 0 ; col < arr[row].length ; col++) {
					
					arr[row][col] = num;
					num += 10;
				}
			}
			
			System.out.println(Arrays.toString(arr)); // toString = 1차원 배열값을 문자열로 반환
			System.out.println(Arrays.deepToString(arr)); // toString = 참조하고 있는 배열의 데이터가 나오는 부분까지 
			
	}

	public void ex2() {
		
		//2차원 배열 선언과 동시에 초기화
		//3행 3열짜리 정수형 2차원 배열 선언과 동시에 1~9까지 초기화
	
	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	
		//행 별로 합계 출력

		for(int row = 0 ; row < arr.length ; row++) {
			int sum = 0;
			for(int col = 0 ; col < arr[row].length ; col++) {
				
				sum += arr[row][col];
				
			}	System.out.println(sum);
			
		} 
		System.out.println("------------------");
		//열 별로 합 출력
		int total = 0;
		for(int row = 0 ; row < arr.length ; row++) {
			int sum = 0;
			for(int col = 0 ; col < arr[row].length ; col++) {
				
				sum += arr[col][row];
				
			}	
			System.out.printf("%d열의 합계 = %d\n", row, sum);
			total += sum;

		}
		System.out.println("전체 합계 = " + total);
		
	}

	public void ex3() {
		
		// 가변 배열
		// 2차원 배열 생성 시 열을 지정하지 않고, 나중에 크기가 다른 1차원 배열을  생성 후 참조
		
		char[][] arr = new char[4][]; // 행 부분만 생성
		
		arr[0] = new char[3]; // 0행에 3열짜리 1차원 배열 생성
		arr[1] = new char[4]; // 1행에 4열짜리 1차원 배열 생성
		arr[2] = new char[5]; // 2행에 5열짜리 1차원 배열 생성
		arr[3] = new char[2]; // 3행에 2열짜리 1차원 배열 생성
		
		char ch = 'a';
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = ch++;
			}
			
		}
		System.out.print(Arrays.deepToString(arr));
	}

	
	
}
