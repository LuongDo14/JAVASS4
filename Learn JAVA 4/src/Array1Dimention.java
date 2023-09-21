import java.util.Scanner;

public class Array1Dimention {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = new int[5];
        int count = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("Khai báo 5 số nguyên của phần tử");
            System.out.println("*************MENU*******************");
            System.out.println("1.Nhập giá trị các phần tử mảng");
            System.out.println("2.In ra giá trị các phần tử trong mảng");
            System.out.println("3.In ra giá trị các phần tử chẵn trong mảng");
            System.out.println("4.In ra giá trị các phần tử có chỉ số lẻ trong mảng");
            System.out.println("5.Tính trong các phần tử trong mảng");
            System.out.println("6.Sắp xếp mảng tăng dần ( thuật toán selectiong sort");
            System.out.println("7.Thoát");
            //1
        } while (true);
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = Integer.parseInt(scanner.nextLine());
//            System.out.println("hien thi :" + arrInt[i]);
//
//
//            System.out.println("\nCác giá trị trong mảng: ");
//            System.out.print(arrInt[i] + "\t");
//        }
//        System.out.println("3.In ra giá trị các phần tử chẵn trong mảng");
//    }
//}
    }
}
