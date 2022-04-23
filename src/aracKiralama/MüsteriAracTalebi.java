package aracKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MüsteriAracTalebi extends AracTalebi{

        static List<AracTalebi> aracTalebiList = new ArrayList<>();

        static Scanner scan= new Scanner(System.in);

        public static void aracTalebi(){

            System.out.println("aracı hangi şehirden alacaksınız:");
            String sehir=scan.nextLine();
            System.out.println("aracı alacağınız gün tarih giriniz:");//12
            String alısGunu=scan.nextLine();
            System.out.println("aracı alacağınız saati:");
            double alısSaatı=scan.nextDouble();
            System.out.println("aracı teslim edecği tarih:");
            String teslımGunu =scan.nextLine();
            System.out.println("aracı tesli edeceği saat:");
            double teslimSaati= scan.nextDouble();
            





        }










    public MüsteriAracTalebi(String alacagıGunu, double alacagıSaat, String teslımGunu, double teslimSaati) {
        super(alacagıGunu, alacagıSaat, teslımGunu, teslimSaati);
    }

    public MüsteriAracTalebi(String model, String marka, String yakıttipi, double gunlukUcret) {
        super(model, marka, yakıttipi, gunlukUcret);
    }
}
