package Day16_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_fibonacci {
    public static void main(String[] args) {
        //Verilen pozitif bir tamsayidan kucuk Fibonacci sayilarini
        //bir liste olarak bize donduren bir method olusturun.

        System.out.println(fibonacciDondur(1000));
        //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987]

        System.out.println(fibonacciDondur(500));
        //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]
    }
    public static List<Integer> fibonacciDondur (int ustSinir){

        List<Integer> fibonacciList = new ArrayList<>();

        if (ustSinir == 0){
            fibonacciList.add(0);
        } else if (ustSinir == 1) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            fibonacciList.add(1);
        }else {
            fibonacciList.add(0);
            fibonacciList.add(1);
            fibonacciList.add(1);
            int yeniSayi;
            int index = 3;

            do {
                yeniSayi = fibonacciList.get(index-1) + fibonacciList.get(index-2);
                if (yeniSayi <= ustSinir){
                    fibonacciList.add(yeniSayi);
                }
                index++;
            } while (yeniSayi <= ustSinir);
        }
        return fibonacciList;
    }
}
