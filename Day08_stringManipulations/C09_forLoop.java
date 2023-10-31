package Day08_stringManipulations;

public class C09_forLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "");
        }

        System.out.println("");//sırf alt satırai nsin diye
        //100den 200ye kadar sınırlar dahil çift sayıları yazdırın

        for (int i = 100; i <=200 ; i+=2) {
            System.out.print(i + " ");
        }

        for (int i = 100; i <=200 ; i++) {
            if (i % 2 == 0 ){
                System.out.print(i + " ");
            }
        }

        //200 ile 270 arasında (sınırlar dahil) 7'in katıl olan sayıları yazdırın

        System.out.println("");

        for (int i = 200; i <270 ; i++) {
            if (i % 7 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // 200'den başlatıp, 150'ye kadar(sınırlar dahil) 3'er 3'er atlayarak yazdırın

        for (int i = 200; i >=200 ; i-=3) {
            System.out.print(i + " ");

        }




    }
}