public class Aula09 {
    
    public static void main(String[] args) {

        int r;

        msg("CFB Curos",10);
        //r = soma(10,5);
        //System.out.println(r);

        System.out.println(soma2(10,20));
        System.out.println(soma(10,40,50,70,20));
        System.out.println(soma(20.4,40.2));

       
        
    }

    public static int soma(int... numeros){
        int res=0;
        for(int n:numeros){
            res += n;
        }
        return res;

    }

    public static Double soma(Double... numeros){
        Double res=0.0;
        for(Double n:numeros){
            res += n;
        }
        return res;

    }

    public static int soma2(int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    public static void msg(String m, int l){
        for(int i=0;i<l;i++){
            System.out.println(m);
        }
    }
}
