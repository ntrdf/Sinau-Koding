import java.util.Scanner;

import bangunRuasP.Persegi;
import bangunRuasP.PersegiPanjang;
import bangunRuasP.Segitiga;

public class Tugas3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] arg) {
        //Scanner scan = new Scanner(System.in);
        int pilihanRumus, pilihPersegi, pilihPersegiPanjang, pilihSegitiga = 0;
       
        menuUtama();
        pilihanRumus = scan.nextInt();
        
        switch(pilihanRumus){
            case 1:
            clearScreen();
            //int pilihPersegi = 0;
            
                System.out.println("=========================");
                System.out.println("=======Pilih Rumus=======");
                System.out.println("========================="); 
                System.out.println("1. Keliling");
                System.out.println("2. Luas");
                //System.out.println("3. Kembali");
                System.out.print("Pilih Rumus yang ingin di hitung : ");
                pilihPersegi = scan.nextInt();
            
                switch(pilihPersegi){
                    case 1:
                        clearScreen();
                        System.out.println("=========================================");
                        System.out.println("=== Rumus Keliling Persegi = 4 X sisi ===");
                        System.out.println("=========================================");
                        kelilingPersegi();
                    break;
                    case 2:
                        clearScreen();
                        System.out.println("========================================");
                        System.out.println("=== Rumus Luas Persegi = sisi X sisi ===");
                        System.out.println("========================================");
                        luasPersegi();
                        break;
                    default:
                        //System.out.println("Silahkan pilih menu yang tertera!");
                        //menuUtama();
                        break;
                }
                break;
                //
            case 2:
                clearScreen();
                System.out.println("=========================");
                System.out.println("=======Pilih Rumus=======");
                System.out.println("========================="); 
                System.out.println("1. Keliling");
                System.out.println("2. Luas");
                //System.out.println("3. Keluar");
                System.out.print("Pilih Rumus yang ingin di hitung : ");
                pilihPersegiPanjang = scan.nextInt();

                switch(pilihPersegiPanjang){
                    case 1:
                        clearScreen();
                        System.out.println("==============================================================");
                        System.out.println("=== Rumus Keliling Persegi Panjang = 2 X (Panjang + Lebar) ===");
                        System.out.println("==============================================================");
                        kelilingPersegiPanjang();
                    break;
                    case 2:
                        clearScreen();
                        System.out.println("====================================================");
                        System.out.println("=== Rumus Luas Persegi Panjang = Panjang X Lebar ===");
                        System.out.println("====================================================");
                        luasPersegiPanjang();
                        break;
                    default:
                        //System.out.println("Silahkan pilih menu yang tertera!");
                        break;
                }
                break;
            case 3:
                clearScreen();
                System.out.println("=========================");
                System.out.println("=======Pilih Rumus=======");
                System.out.println("========================="); 
                System.out.println("1. Keliling");
                System.out.println("2. Luas");
                //System.out.println("3. Keluar");
                System.out.print("Pilih Rumus yang ingin di hitung : ");
                pilihSegitiga = scan.nextInt();

                switch(pilihSegitiga){
                    case 1:
                        clearScreen();
                        System.out.println("==================================================================");
                        System.out.println("======= Rumus Keliling Segitiga = sisi 1 + sisi 2 + sisi 3 =======");
                        System.out.println("==================================================================");
                        kelilingSegitiga();
                    break;
                    case 2:
                        clearScreen();
                        System.out.println("========================================================");
                        System.out.println("======= Rumus Luas Segitiga = Alas  X tinggi / 2 =======");
                        System.out.println("========================================================");
                        luasSegitiga();
                        break;
                    default:
                        //System.out.println("Silahkan pilih menu yang tertera!");
                        break;
                }
                break;
             default:
            //     System.out.println("Silahkan pilih menu yang tertera!");
                break;
        }
    }

    static void menuUtama(){
        System.out.println("=============================================================");
        System.out.println("=======Mesin Penghitung Keliling dan Luas Bangun Datar=======");
        System.out.println("=============================================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        //System.out.println("4. Keluar");
        System.out.print("Pilih Bangun Datar yang ingin di hitung : ");
    }
 
     static void kelilingPersegi(){
        //Scanner scan = new Scanner(System.in);
        int sisiPersegi = 0;
        System.out.print("Masukan ukuran sisi (CM) : ");
        sisiPersegi = scan.nextInt();

        Persegi kelilingPersegi = new Persegi();
        int hasil = kelilingPersegi.kelilingPersegi(sisiPersegi);

        //hasil = sisiPersegi * 4;
        clearScreen();
        System.out.println("======================================================");
        System.out.println("=== Keliling Persegi dari panjang sisi " + sisiPersegi + " adalah " + hasil + " ===");
        System.out.println("======================================================");
    }

    static void luasPersegi(){
        //Scanner scan = new Scanner(System.in);
        int sisiPersegi = 0;
        System.out.print("Masukan ukuran sisi (CM) : ");
        sisiPersegi = scan.nextInt();

        Persegi luasPersegi = new Persegi();
        int hasil = luasPersegi.luasPersegi(sisiPersegi);
        //hasil = sisiPersegi * sisiPersegi;

        clearScreen();
        System.out.println("====================================================");
        System.out.println("=== Luas Persegi dari panjang sisi " + sisiPersegi + " adalah " + hasil + " =====");
        System.out.println("====================================================");
    }

    static void kelilingPersegiPanjang(){
        //Scanner scan = new Scanner(System.in);
        int panjangPP, lebarPP = 0;
        System.out.print("Masukan ukuran Panjang sisi (CM) : ");
        panjangPP = scan.nextInt();
        System.out.print("Masukan ukuran Lebar sisi (CM) : ");
        lebarPP = scan.nextInt();
        //hasil = 2 * (panjangPP + lebarPP);
        PersegiPanjang kPersegiPanjang = new PersegiPanjang();
        int hasil = kPersegiPanjang.kelilingPersegiPanjang(panjangPP, lebarPP);
        clearScreen();
        System.out.println("=================================================================================");
        System.out.println("=== Keliling Persegi Panjang dengan panjang sisi " + panjangPP + " dan lebar sisi " + lebarPP + " adalah " + hasil + " ===");
        System.out.println("=================================================================================");
    }

    static void luasPersegiPanjang(){
        //Scanner scan = new Scanner(System.in);
        int panjangPP, lebarPP = 0;
        System.out.print("Masukan ukuran Panjang sisi (CM) : ");
        panjangPP = scan.nextInt();
        System.out.print("Masukan ukuran Lebar sisi (CM) : ");
        lebarPP = scan.nextInt();
        //hasil = panjangPP * lebarPP;
        PersegiPanjang lPersegiPanjang = new PersegiPanjang();
        int hasil = lPersegiPanjang.luasPersegiPanjang(panjangPP, lebarPP);
        clearScreen();
        System.out.println("=============================================================================");
        System.out.println("=== Luas Persegi Panjang dengan panjang sisi " + panjangPP + " dan lebar sisi " + lebarPP + " adalah " + hasil + " ===");
        System.out.println("=============================================================================");
    }

    static void kelilingSegitiga(){
        //Scanner scan = new Scanner(System.in);
        int sisi1Segitiga, sisi2Segitiga, sisi3Segitiga = 0;
        System.out.print("Masukan ukuran sisi 1 segitiga (CM) : ");
        sisi1Segitiga = scan.nextInt();
        System.out.print("Masukan ukuran sisi 2 segitiga (CM) : ");
        sisi2Segitiga = scan.nextInt();
        System.out.print("Masukan ukuran sisi 3 segitiga (CM) : ");
        sisi3Segitiga = scan.nextInt();
        //hasil = sisi1Segitiga + sisi2Segitiga + sisi3Segitiga;
        Segitiga kSegitiga = new Segitiga();
        int hasil = kSegitiga.kelilingSegitiga(sisi1Segitiga, sisi2Segitiga, sisi3Segitiga);
        clearScreen();
        System.out.println("=======================================================================================");
        System.out.println("=== Keliling Segitiga dengan ukuran sisi 1 : " + sisi1Segitiga + " , sisi 2 : " + sisi2Segitiga + " dan sisi 3 : " + sisi3Segitiga + " adalah " + hasil + " ===");
        System.out.println("=======================================================================================");
    }

    static void luasSegitiga(){
        //Scanner scan = new Scanner(System.in);
        int alasSegitiga, tinggiSegitiga = 0;
        System.out.print("Masukan ukuran Alas Segitiga (CM) : ");
        alasSegitiga = scan.nextInt();
        System.out.print("Masukan ukuran Tinggi Segitiga (CM) : ");
        tinggiSegitiga = scan.nextInt();
        //hasil = alasSegitiga * tinggiSegitiga / 2;
        Segitiga lSegitiga = new Segitiga();
        int hasil = lSegitiga.luasSegitiga(alasSegitiga, tinggiSegitiga);
        clearScreen();
        System.out.println("==================================================================");
        System.out.println("=== Luas Segitiga dengan ukuran Alas " + alasSegitiga + " dan tinggi " + tinggiSegitiga + " adalah " + hasil + " ===");
        System.out.println("==================================================================");
    }

    static void clearScreen(){
        for(int i = 1; i < 10;i++){
            System.out.println("");
        }
    }
    
 }