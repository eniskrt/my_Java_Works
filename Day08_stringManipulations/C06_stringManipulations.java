package Day08_stringManipulations;

public class C06_stringManipulations {
    public static void main(String[] args) {

        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70 €

        String fiyatStr1 ="15.30$";
        String fiyatStr2 ="11.40$";

        int fiyat1 =Integer.parseInt(fiyatStr1.replaceAll("\\D",""));
        int fiyat2 =Integer.parseInt(fiyatStr2.replaceAll("\\D",""));

        System.out.println("Toplam fiyat : "+ (double)(fiyat1+fiyat2)/100 + "$");

    }
}
