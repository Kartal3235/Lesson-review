package day0405;

public class Q2 {

    /* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
        boolean simetrik = false;
        for (int i = 0; i <arr1.length/2 ; i++) {
            if(arr1[i]==arr1[arr1.length-1-i]){
                simetrik=true;
            }else{
                simetrik=false;
            }
        }
        System.out.println("simetrik = " + simetrik);
    }
}
