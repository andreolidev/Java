
import java.util.Arrays;





public class Aula07 {
    
    public static void main(String[] args) {
        
        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros= new int[tam];
        int p=17;
        int pos;

        //Arrays.sort(num);
        //Arrays.fill(numeros, 10);
        //System.arraycopy(num, 0, numeros, 0, tam);
        //System.out.printf("Arrays são iguais:%s",Arrays.equals(num, numeros) ? "Sim" : "Não");

        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d está no array? %s na posição %d",p,pos > 0 ? "Sim" : "Não",pos);

        /*for(int i=0;i<num.length;i++){

            System.out.printf("%d - ",num[i]);
        }*/

        /*for(int n:numeros){
            System.out.printf("%d - ",n);
        }*/
    }
}
