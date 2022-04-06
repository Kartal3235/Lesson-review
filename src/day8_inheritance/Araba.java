package day8_inheritance;

public class Araba {//POJO CLASS == modal class
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {//p.siz li cons.

    }
    public Araba(String model, String renk, int motor, int yil) {//p li cons.
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        //this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }

    public Araba(int motor, int yil) {// p.li cons.
        this.motor = motor;
        this.yil = yil;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getRenk() {

        return renk;
    }

    public void setRenk(String renk) {

        this.renk = renk;
    }

    public int getMotor() {

        return motor;
    }

    public void setMotor(int motor) {
        if(motor<1000){
            System.out.println("agam bizimle eğlenir");
        this.motor=1200;

        }else

        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if(yil<0){
            this.yil=(-1)*yil;
            System.out.println("agam nişledinggg milattan önce raba var mıydı");
        }else

        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
