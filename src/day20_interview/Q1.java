package day20_interview;

public class Q1 {
    public static void main(String[] args) {

        /*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */


        String str = "AAABBCDD";
        frekans(str);

    }

    private static void frekans(String str) {

        int sayac=0;
        String output="";

        for (int i = 0; i <str.length() ; i++) {// kıyas edilen harf
            for (int j =i; j <str.length()-1 ; j++) {// kıyas eden harf

                if(str.substring(i,i+1).equals(str.substring(j,j+1))) {

                    sayac++;
                }

            }if(!output.contains(str.substring(i,i+1))){
                output=output+str.substring(i,i+1)+sayac;

            }else sayac=0;// tekrar etmeyen harf için 0 yazdık, ki döngü başa sardığında ekleme yapmasın.



        }System.out.println("output"+output);
    }
}
