package com.test.question;

public class Q079 {
    public static void main(String[] args) {
    	/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		2	7	6
		9	5	1
		4	3	8

		● 마방진		
		동서남북 어디서 보더라도 15명의 군인이 보일 수 밖에 없는 구조
		9칸 중에 아무데나 1을 적는다.
		방향을 정한다. 2시, 5시, 8시, 11시
		방향으로 이동한다. 방향쪽에 배열이 있다고 생각한다. 2를 넣는데, 이게 자기 자신이라고 생각하고 그 위치에 넣는다.
		
		*/
    	
        int[][] nums = new int[5][5];
        int n = 1;

        /*
        // 데이터 입력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = n;
                n++;
            }
        }
        */

        // 마방진 생성
        createMagicSquare(nums, 1, 2);

        // 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", nums[i][j]);
            }
            System.out.println();
        }
    }

    public static void createMagicSquare(int[][] arr, int x, int y) {
        int size = arr.length;
        int n = size * size;
        int count = 1;

        arr[x][y] = count;

        while (count < n) {
            int nextX = (x - 1 + size) % size; // 위로 이동
            int nextY = (y + 1) % size; // 오른쪽으로 이동

            if (arr[nextX][nextY] == 0) {
                x = nextX;
                y = nextY;
            } else {
                x = (x + 1) % size; // 아래로 이동
            }

            count++;
            arr[x][y] = count;
        }
    }
}

