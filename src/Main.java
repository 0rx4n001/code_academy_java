import ls6.Menzil_klasi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    /**
     * Salamlar elbetdeki
     */
    public static void main(String[] args) {


//        Menzil_klasi m1 = new Menzil_klasi();
//        m1.menzilin_tipi = "Bina";
//        m1.binanin_tipi = "Yeni tikili";
//        m1.mertebe = "1";
//        m1.otaq_sayi = "3";
//        m1.olcusu = "80";
//
//        Menzil_klasi m2 = new Menzil_klasi();
//        m2.menzilin_tipi = "Bina";
//        m2.binanin_tipi = "Yeni tikili";
//        m2.mertebe = "10";
//        m2.otaq_sayi = "5";
//        m2.olcusu = "180";
//
//        Menzil_klasi m3 = new Menzil_klasi();
//        m3.menzilin_tipi = "Bina";
//        m3.binanin_tipi = "Kohne tikili";
//        m3.mertebe = "1";
//        m3.otaq_sayi = "2";
//        m3.olcusu = "40";
//
//        Menzil_klasi m4 = new Menzil_klasi();
//        m4.menzilin_tipi = "Heyet evi";
//        m4.binanin_tipi = "Yeni tikili";
//        m4.mertebe = "1";
//        m4.otaq_sayi = "6";
//        m4.olcusu = "200";
//
//        m2.show_menzil();


        Car car1 = new Car("BMW");
        Car car2 = new Car("Audi", "Red");
        Car car3 = new Car("Mercedes", "Black", 2022);

        car1.display();  // Çıxış: Car Model: BMW, Color: null, Year: 0
        car2.display();  // Çıxış: Car Model: Audi, Color: Red, Year: 0
        car3.display();  // Çıxış: Car Model: Mercedes, Color: Black, Year: 2022
    }


}