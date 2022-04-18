package day19;

public class Q1 {
    public static void main(String[] args) {


        String text="Good";
        System.out.println(text.indexOf("G"));
        System.out.println(text.indexOf("o"));

        int index=text.indexOf("d");
        System.out.println(index);

        String cicek="Gunebakan";
        System.out.println(cicek.lastIndexOf("a"));
        System.out.println(cicek.lastIndexOf("n"));
        /**
         * charAt()
         * İstenen noktadaki karakteri verir,
         * karakterlerin sırası 0 dan başlar, buna index denir.
         * Metin icerisinde, istenilen indexteki karaktere ulasimi saglar. Sonuc char dir.
         *  0123456789012
         */

        String isim="bahadırhan";
        System.out.println(isim.charAt(3));
        System.out.println(isim.charAt(7));

        /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
         */
        String cumle="Her ders Java gibi olsa";

        System.out.println(cumle.substring(3));
        System.out.println(cumle.substring(4,7));
        System.out.println(cumle.substring(0,10));
        System.out.println(cumle.substring(10,10));
        System.out.println(cumle.substring(22,22));
        //System.out.println(cumle.substring(8,7));

        /**trim()
         *Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar, aralardaki bosluklara dokunmaz. Sonuc String dir.
         */

        String sehir="          izmir         ";
        System.out.println(sehir.trim());

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String'dir..
         *
         */

        String obje="Hayat ne kadar güzel";
        System.out.println(obje.replace("y","@"));
        System.out.println(obje.replace("a","@"));

        String obje1="Evlere şenlik var,cümbüş var,hadi gidik.";
        System.out.println(obje1.replace("e","$"));
        System.out.println(obje.replace("kadar","super"));

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */

        String obje2="hadi gidik bakalım";
        System.out.println(obje2.replaceFirst("i","%"));

        String deger="$1800 MNilyon ";
        System.out.println(deger.replaceAll("[a-zA-Z]",""));
        System.out.println(deger.replaceAll("[0-9]",""));


        /**
         * contains()
         * Metin icerisinde arama yapmamizi saglar.
         * bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
         * Sonuc boolean dir.
         *
         * equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */

        String str="Merhaba";
        String s="Merhaba";

        System.out.println(str.equals(s));
        System.out.println(str==s);

        String sA="bahadır";
        String sB=sA+"";

        System.out.println(sA==sB);//Stringlerin hem değerlerini hemde adreslerini karşılaştırır.
        System.out.println(sA.equals(sB));//Stringlerin yalnızca değerlerine bakar.


    }
}
