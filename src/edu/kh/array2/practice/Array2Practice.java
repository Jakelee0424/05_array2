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
}
