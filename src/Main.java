
import java.util.Arrays;


public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrar = new int[dizi.length];
        int temp;
        int j = 0;
        Arrays.sort(dizi);
        System.out.println("Tekrar Sayilari");
        for(int i = 0; i < dizi.length; i++){
            temp = 0;
            i = j;
            while(j < dizi.length){
                if(dizi[i] == dizi[j]){
                    ++temp;
                    j++;
                    continue;
                }
                break;
            }
            if(i >= dizi.length){
                break;
            }
            System.out.println(dizi[i] + " sayisi " + temp + " kere tekrar edildi.");
        }
    }
}
