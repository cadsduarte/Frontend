public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        //variáveis
        String formaPagamento = "a vista";
        double valor = 200;


        System.out.println(formaPagamento == "A prazo" || valor >= 100);
         System.out.println(formaPagamento == "a vista" && valor >= 100); 
    }
}
