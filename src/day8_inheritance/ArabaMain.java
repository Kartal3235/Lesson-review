package day8_inheritance;

public class ArabaMain {

    public static void main(String[] args) {


        Araba honda=new Araba();// p.siz cons.
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setRenk("kırmızı");
        honda.setMotor(1600);
        Araba toyota=new Araba("avensis","beyaz",300,-2020);
        Araba volvo=new Araba("s80","füme",2400,2021);
        Araba hacıMurat=new Araba(1200,1974);

        System.out.println(honda);//toString methodu olmazsa erferance yollar
        System.out.println(toyota);
        System.out.println(volvo);
        System.out.println("seçtiğiniz araç toyota->"+"model: "+toyota.getModel()+"renk:" +toyota.getRenk()+
                "motor gücü:"+toyota.getMotor()+"yıl:"+toyota.getYil());

        System.out.println(hacıMurat);
    }



}
