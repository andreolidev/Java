public class Aula06 {
    
    public static void main(String[] args) {

        final int tam=9;
        
        int[] num=new int[tam];
        int[] number={1,2,3,4,5,7,8,9,10,11,12,13};

        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;

        for(int i=0;i<number.length;i++){
            System.out.printf("%d - ",number[i]);
        }

    }
}
