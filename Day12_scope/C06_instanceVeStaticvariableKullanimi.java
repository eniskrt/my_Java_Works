package Day12_scope;

public class C06_instanceVeStaticvariableKullanimi {
    //Okul uygulaması yaptığımızı düşünelim
    static String okulIsmi = "Yıldız Koleji";
    static String mudur = "Fikret Zeybek";
    static String okulAdresi = "Çankaya";

    String ogretmenIsmi = "İsim atanmadı";
    String ogretmenAdresi = "Adres girilmedi";
    String ogretmenTelefonu = "Telefon girilmedi";

    public static void main(String[] args) {

        C06_instanceVeStaticvariableKullanimi ogr1 = new C06_instanceVeStaticvariableKullanimi();

        System.out.println(ogr1.ogretmenAdresi); //Adre girilmedi
        ogr1.ogretmenIsmi = "Ömer";
        ogr1.ogretmenAdresi = "kızılay";
        System.out.println(ogr1.mudur);//Fikret Zeybek

        C06_instanceVeStaticvariableKullanimi ogr2 = new C06_instanceVeStaticvariableKullanimi();
        System.out.println(ogr2.ogretmenIsmi); //İsim atanmadı
        ogr2.ogretmenIsmi = "Zeliha";

        C06_instanceVeStaticvariableKullanimi ogr3 = new C06_instanceVeStaticvariableKullanimi();

        System.out.println("=========");

        System.out.println(ogr1.ogretmenIsmi); //Ömer
        System.out.println(ogr2.ogretmenIsmi); //Zeliha
        System.out.println(ogr3.ogretmenIsmi); //İsim atanmadı

        System.out.println(ogr1.okulIsmi); //Yıldız Koleji
        System.out.println(ogr2.okulIsmi); //yıldız Koleji
        System.out.println(ogr3.okulIsmi); //Yıldız Koleji

        ogr1.okulAdresi ="Yeni Mahalle";

        System.out.println(okulAdresi); //Yeni Mahalle
        System.out.println(ogr2.okulAdresi); //Yeni Mahalle
        System.out.println(ogr3.okulAdresi); //Yeni Mahalle

    }
}
