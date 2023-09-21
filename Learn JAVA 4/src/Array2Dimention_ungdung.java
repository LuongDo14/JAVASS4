import java.util.Scanner;

public class Array2Dimention_ungdung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arrInt = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.printf("arrInt[%d][%d]=" ,i,j);
//                arrInt[i][j] = Integer.parseInt(scanner.nextLine());
//            }
//        }
        do{
            System.out.println(" *********************MENU*************************");
            System.out.println(" 1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử của mảng");
            System.out.println("3. Tính tổng các phần tử mảng");
            System.out.println(" 4. Tìm giá trị nhỏ nhất và lớn nhất trong mảng");
            System.out.println("5.Thoát");
            int choise =Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arrInt[%d][%d]= " ,i,j);
                            arrInt[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng là:");
                    for (int[] element : arrInt) {
                        for (int element2 : element) {
                            System.out.printf("%d\t", element2);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                           sum += arrInt[i][j];

                        }
                    }
                    System.out.println("Tổng các phần tử mảng :" + sum);
                    break;
                case 4:
                    int max = arrInt[0][0];
                    int min = arrInt[0][0];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if(arrInt[i][j] > max){
                                max = arrInt[i][j];
                            }
                            if(arrInt[i][j] < min){
                                min = arrInt[i][j];
                            }
                        }
                    }
                    System.out.println("Giá trị lớn nhất: " + max);
                    System.out.println("Giá trị nhỏ nhất" + min);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn đi bạn ơi");
            }
        }while (true);
    }
}
