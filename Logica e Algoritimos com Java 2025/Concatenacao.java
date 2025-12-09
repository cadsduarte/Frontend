public class Concatenacao {
   
    public static void main(String[] args) {
        
        // Variáveis
        String nome = "Carlos";
        int idade = 65;
        
        // Concatenaçaõ
        // System.out.println(" Olá "+ nome + " voce tem " + idade + " anos ");
        System.out.println(String.format(" Olá %s voce tem %s anos. ", nome, idade));
    }
}
