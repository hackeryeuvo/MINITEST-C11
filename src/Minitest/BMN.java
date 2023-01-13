package Minitest;

public class BMN {
    public int totalPrice(Book[] list) {
        int count = 0;
        for (Book p : list) {
            count += p.getPrice();
        }
        System.out.println("tổng tiền của 10 cuốn sách là " + count);
        return count;
    }
    public int numberLanguage(Book[]list){
        String language="Java";
        int count1=0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof Programmingbook) {
                if (((Programmingbook) list[i]).getLanguage(String.valueOf(i)).equals(language)) {
                    count1++;
                }
            }
        }
        System.out.println("Số sách ProgrammingBook có language Java là  " + count1);
        return count1;
    }
    public int numberCategory(Book[]list){
        String category="viễn tưởng 1 ";
        int count2=0;
        for (Book p : list) {
            if (p instanceof Fictionbook) {
                if (((Fictionbook) p).getCategeory().equals(category)) {
                    count2++;
                }
            }
        }
        System.out.println("Số sách Fiction có category Viễn tưởng 1 là " + count2);
        return count2;
    }
    public int priceUpToHundred(Book[]list){
        int count3=0;
        for (Book p:list) {
            if(p instanceof Fictionbook){
                if (p.getPrice()<100){
                    count3++;
                }
            }
        }
        System.out.println("Số sách Fiction có giá nhỏ hơn 100 là "+count3 );
        return count3;
    }

}
