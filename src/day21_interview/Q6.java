package day21_interview;

public class Q6 {
    public static void main(String[] args) {

        // Create a method which takes String array as a parameter
        // and prints all the element

        String[] array ={"Honda","Toyota","Porche","Tesla","BMW"};

        printElement(array);

        String []renkler={"mavi","kırmızı","yeşil","sari"};

        printElement(renkler);
    }

    private static void printElement(String[] array) {



        for (int i = 0; i <array.length ; i++) {

            System.out.print(array[i] + " ");

        }
    }
}
