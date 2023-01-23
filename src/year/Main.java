package year;

public class Main {
    public static void main(String[] args) {
        int y =4100;
        if( y%400==0 || y%4==0 && y%100!=0){
            System.out.println("Deger artik yildir");
        }else {
            System.out.println("Deger artik yil degildir");
        }
    }
}
