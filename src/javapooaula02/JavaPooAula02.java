package javapooaula02;


public class JavaPooAula02 {
    public static void main(String[] args) {
       
        Caneta c1 = new Caneta ();
        c1.cor = "preta";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
       Caneta c2 = new Caneta();
       c2.modelo = "BIC";
       c2.cor = "Preta";
       c2.destampar();
       c2.status();
       c2.rabiscar();
       
    }
    
}
