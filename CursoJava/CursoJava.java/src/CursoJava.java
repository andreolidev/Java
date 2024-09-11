public class CursoJava {
    public static void main(String[] args) throws Exception {

        //Jogadores

        /*int num=0;

        System.out.printf("%nAlerta:%s%n",Jogador.alerta ? "Sim" : "Não");
        
        Jogador.pontos();
        Jogador.pontos();
        Jogador.pontos();

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        Jogador.alerta=true;
        
        j1.info();
        j2.info();
        j3.info();

        System.out.printf("%nVidas do jogador 1:%d",j1.getVidas());
        System.out.printf("%nVidas do jogador 2:%d",j2.getVidas());
        System.out.printf("%nVidas do jogador 3:%d",j3.getVidas());*/

        //Carro

        Carro c1=new Carro("Golf");

        c1.setLigado(true);
        c1.info();


    }
}
