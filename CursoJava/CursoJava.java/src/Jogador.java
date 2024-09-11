public class Jogador {

    private final int maxVidas=3;
    private int num=0;
    private int vidas=0;
    static boolean alerta=false;
    static int qtdJogadores=0;
    static int pontoJogadores=0;

    public Jogador(int num){
        this.num=num;
        this.vidas=1;
        System.out.printf("%nJogador numero %d Criado%n",num);
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    static void pontos(){
        pontoJogadores+=10;
    }

    public void info(){
        System.out.printf("%nJogador:%d",this.num);
        System.out.printf("%nVidas:%d",this.vidas);
        System.out.printf("%nAlerta:%s",(alerta ? "Sim" : "Não"));
        System.out.printf("%nJogadores:%d",qtdJogadores);
        System.out.printf("%nPonto Jogadores:%d",pontoJogadores);
        System.out.printf("%n----------------------------------------%n");
    }
    
}
