package ucusProjesi;

public class Yölcü {

    private String name;
    private int age;
    private String city;
    private String flytype;

    public Yölcü(){

    }

    public Yölcü(String name, int age, String city, String flytype) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.flytype = flytype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFlytype() {
        return flytype;
    }

    public void setFlytype(String flytype) {
        this.flytype = flytype;
    }

    @Override
    public String toString() {
        return "Yölcü{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", flytype='" + flytype + '\'' +
                '}';
    }
}
