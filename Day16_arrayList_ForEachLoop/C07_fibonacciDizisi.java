package Day16_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_fibonacciDizisi {
    public static void main(String[] args) {
        //Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        //sayisini bir list olarak donduren bir method olusturun.
        System.out.println(fibonacciListesiOlustur(100));
    }
    public static List<Integer> fibonacciListesiOlustur (int listeSayiAdedi){
        
        List<Integer> fibonacciList = new ArrayList<>();
        
        if (listeSayiAdedi==1){
            fibonacciList.add(0);
        } else if (listeSayiAdedi==2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
        }else {//istenen eleman sayısı ikiden fazla
            fibonacciList.add(0);
            fibonacciList.add(1);
            for (int i = 2; i < listeSayiAdedi; i++) {
                fibonacciList.add(fibonacciList.get(i-1) + fibonacciList.get(i-2));
            }
        }
        return fibonacciList;
    }
}
