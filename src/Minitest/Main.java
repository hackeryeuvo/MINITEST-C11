package Minitest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMN bmn = new BMN();
        Book[] list = new Book[10];
        list[0] = new Fictionbook(0, "Chiến tranh các vì sao", 60, "AAAAA", "viễn tưởng 1");
        list[1] = new Fictionbook(1, "Chiến tranh các vì sao1", 75, "AAAAA", "viễn tưởng 1");
        list[2] = new Fictionbook(2, "Chiến tranh các vì sao2", 85, "AAAAA", "viễn tưởng 3");
        list[3] = new Fictionbook(3, "Chiến tranh các vì sao3", 115, "AAAAA", "viễn tưởng 4");
        list[4] = new Fictionbook(4, "Chiến tranh các vì sao4", 90, "AAAAA", "viễn tưởng 5");
        list[5] = new Programmingbook(5, "Chiến tranh việt nam", 270, "Huy Cận", "Java", "Map");
        list[6] = new Programmingbook(6, "Chiến tranh việt nam1", 280, "Huy Cận", "PHP", "Map");
        list[7] = new Programmingbook(7, "Chiến tranh việt nam2", 290, "Huy Cận", "Java", "Map");
        list[8] = new Programmingbook(8, "Chiến tranh việt nam3", 310, "Huy Cận", "Python", "Map");
        list[9] = new Programmingbook(9, "Chiến tranh việt nam4", 320, "Huy Cận", "Java", "Map");

        int choice;
        do {
            System.out.println("1.Tổng giá 10 cuốn sách");
            System.out.println("2.Số sách ProgrammingBook có language là Java");
            System.out.println("3.Số sách Fiction có category là Viễn tưởng 1 ");
            System.out.println("4.Số sách Fiction có giá bé hơn 100");
            System.out.println("5.Thoát ra");
            System.out.println("Mời bạn lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bmn.totalPrice(list);
                    break;
                case 2:
                    bmn.numberLanguage(list);
                    break;
                case 3:
                    bmn.numberCategory(list);
                    break;
                case 4:
                    bmn.priceUpToHundred(list);
                    break;
            }
        } while (choice != 5);
    }

}
