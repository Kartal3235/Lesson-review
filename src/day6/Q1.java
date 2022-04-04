package day6;

public class Q1 {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
        // Bir method oluşturun

            String input="Masam";

            parindomKontrolEt(input);

    }

    public static void parindomKontrolEt(String input) {

        String tersten="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersten+=input.charAt(i);

        }
        System.out.println(tersten);
        if(input.equalsIgnoreCase(tersten)){
            System.out.println("palindrome");
        }else{
            System.out.println("palindrome değil");
        }
    }
}
