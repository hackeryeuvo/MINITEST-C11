package Minitest2;

import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        MaterialManager materialManager = new MaterialManager();
        int choice;
        do {
            System.out.println("Mời bạn nhập lựa chọn");
            System.out.println("1.Hiển thị danh sách sản phẩm");
            System.out.println("2.Thêm sản phẩm");
            System.out.println("3.Sửa sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Thoát");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    materialManager.displaylist();
                    break;
                case 2:
                    materialManager.addMaterial(scanner);
                    break;
                case 3:
                    materialManager.fixById(scanner);
                    break;
                case 4:
                    materialManager.deleteById(scanner);
                    break;
            }
        }while (choice!=5);
    }
}
