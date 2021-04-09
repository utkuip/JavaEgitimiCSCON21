package com.company;

public class YorumSatirlari {

    //System.out.println("Hello World!");
        /*
        int sayi = 2;
        System.out.println(sayi);

        sayi= 5;
        System.out.println(sayi);

        double ikinciSayi = 8.9;
        System.out.println(ikinciSayi);

        String cumle = "Merhaba CSCON21!";
        System.out.println(cumle);

        boolean boolOrnek = false;

        dsafasdfasd
        sadfsadgsdgasd
        sdagsadg
        char charOrnek ='M';

        double sayi1 = 6.23450000;
        int sayi2= 2;
        String sayi3 = "4";
        double sonuc = Double.parseDouble(sayi3)+sayi2;

        String strSayi = Integer.toString(sayi2);
        System.out.println(strSayi + " Değeri:" + strSayi.getClass());


        // + - * /

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplanacak ilk sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Toplanacak ikinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        int toplamaSonuc = sayi1+sayi2;
        System.out.println("Toplama: "+toplamaSonuc);
        int cikarmaSonuc= sayi1-sayi2;
        System.out.println("Toplama: "+(sayi1+sayi2));



            Hesap Makinesinde 2 adet int sayı alınacak
            Sırasıyla toplama, çıkarma, çarpma ve bölme işlemlerini yapacak
            Her birinin sonucunu ekranda bastırmanız gerekiyor

            ilk sayi 5 ikinci sayi 2
            Toplama: 7
            Çıkarma: 3
            Çarpma: 10
            Bölme: 2.5

         */


/*
        int sayi1 =2;
        int sayi2 = 3;

        if(sayi2 == sayi1){
            System.out.println("Sayımızın değeri 5");
        }else if(sayi1 > sayi2){
            System.out.println("Sayımızın değeri 5 değil");
        }


 */






    // while, for ,do while
/*

        Random random = new Random();

        int randSayi = random.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int tahmin = scan.nextInt();

        int j =1;

        while(j <=10){
            if(tahmin == randSayi){
                System.out.println("Tebrikler, sayıyı bildiniz!");
                break;
            }else if(tahmin> randSayi) {
                System.out.println("Sayınız random sayıdan büyük. Random sayı =" + randSayi);
                tahmin = scan.nextInt();
                randSayi = random.nextInt(100);
            }else {
                System.out.println("Sayınız random sayıdan küçük. Random sayı =" + randSayi);
                tahmin = scan.nextInt();
                randSayi = random.nextInt(100);
            }
            j++;
        }


        for(int i = 1;i < 10;i++){
            if(tahmin == randSayi){
                System.out.println("Tebrikler, sayıyı bildiniz!");
                break;
            }else if(tahmin> randSayi) {
                System.out.println("Sayınız random sayıdan büyük. Random sayı =" + randSayi);
                tahmin = scan.nextInt();
                randSayi = random.nextInt(100);
            }else {
                System.out.println("Sayınız random sayıdan küçük. Random sayı =" + randSayi);
                tahmin = scan.nextInt();
                randSayi = random.nextInt(100);
            }

        }


        int sayi;

        do {
            sayi = 5;
            int sayi2 = 3;
            System.out.println(sayi + sayi2);
            sayi = 6;
        }while(sayi == 6);
*/

/*
Random randomSayi = new Random();

        AgacModel agac1 = new AgacModel();

       agac1.yaprakRengi= "sarı";
       agac1.meyve="elma";
       agac1.agacTur="meyve ağacı";
       agac1.dalVarMi =true;
       agac1.govdeKalinligi="ince";
       agac1.kokUzunlugu="çok uzun";


       System.out.println(agac1.dalVarMi);
       System.out.println(agac1.kokUzunlugu);
       System.out.println(agac1.yaprakRengi);

       agac1.nefesAl();

       InsanModel insan1 = new InsanModel("Ahmet");

       System.out.println(insan1.isim + " " + insan1.yas);
       insan1.nefesAl();

       AgacModel agac1 = new AgacModel();
       agac1.nefesAl();

       AgacModel agac2 = new AgacModel();
       agac2 = agac1;
        insan1.ure();

       System.out.println(agac1.yaprakRengi + ","+agac2.yaprakRengi);
       */



    //int[] sayilar = new int[2];

    //sayilar[0] = 5;
    // sayilar[1] = 3;

    // System.out.println(sayilar[1]);

    //  String[] cumleler = new String[5];

/*

        InsanModel[] insanlar = new InsanModel[3];

        insanlar[0] = new InsanModel();
        insanlar[0].sacRengi="yeşil";
        System.out.println(insanlar[0].sacRengi);

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < cumleler.length; i++){
            System.out.println("Cümle Giriniz:");
            cumleler[i] = scan.nextLine();

        }

        for(int i = 0; i < cumleler.length; i++){
            System.out.println(cumleler[i]);
        }



        List<Integer> sayilar = new ArrayList<Integer>();

        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar.size());
        sayilar.add(9);
        System.out.println(sayilar.size());

        List<InsanModel> insanlar = new ArrayList<InsanModel>();

        InsanModel insan1 = new InsanModel();
        insan1.sacRengi="Sarı";
        insanlar.add(insan1);
 */

/*
        int sonuc;
        sonuc = sayiCikarmaFonksiyonu(5,3);
        System.out.println(sonuc);
        helloWorldFonksiyonu();




        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Sayınız 1");
                break;
            case 2:
                System.out.println("Sayınız 2");
                break;
            case 3:
                System.out.println("Sayınız 3");
                break;
            case 4:
                System.out.println("Sayınız 4");
                break;
            case 5:
                System.out.println("Sayınız 5");
                break;

        }


        System.out.println("Sayıları toplamak için 1 e basın");
        System.out.println("Sayıları çıkarmak için 2 e basın");
        System.out.println("Sayıları çarpmak için 3 e basın");
        System.out.println("Sayıları bölmek için 4 e basın");
        System.out.println("Programı kapatmak için 5 e basın");


    }

    public static int sayiCikarmaFonksiyonu(int sayi1, int sayi2){
        int sonuc;
        sonuc = sayi1-sayi2;

        return sonuc;
    }

    public static void helloWorldFonksiyonu(){
        System.out.println("Hello World!");
    }

*/
/*

        Bizim bir menümüz olacak
        Menüde

            System.out.println("Sayıları toplamak için 1 e basın");
            System.out.println("Sayıları çıkarmak için 2 e basın");
            System.out.println("Sayıları çarpmak için 3 e basın");
            System.out.println("Sayıları bölmek için 4 e basın");
            System.out.println("Programı kapatmak için 5 e basın");    seçenekleri olacak

        Her seçim yaptığında kullanıcı 2 sayı girecek
        Seçtiği menüye göre işlemleri yapacak
        Bu işlemler ayrı bir fonksiyonda olmalı
        Kullanıcı ana menüde 5e basana kadar sürekli çalışmalı



 */


}
