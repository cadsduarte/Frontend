public class Condicional {
    
    public static void main(String[] args) {
        
        //variável
        double nota = 5;

        //condicional
        if(nota >= 7){
           System.out.println("Aprovado(a)");
        }else if (nota >=5) {
            System.out.println("Em recuperação");
        }
        else{
            System.out.println("Reprovado(a)");
        }
    }
}
