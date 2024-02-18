
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
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
