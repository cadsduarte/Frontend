public class Escolha {
    
    public static void main(String[] args) {
        
        //Variável
        String cidade = "São Paulo";

        // Switch Expressions
        String mensagem = switch(cidade){
           case "São Paulo" -> "Maior cidade do pais.";
           case "Rio de Janeiro" -> "Cidade de belas praias.";
           default -> "Cidade não encontrada.";
        };

        System.out.println(mensagem);

        //Estrutura de escolha
      /*   switch (cidade) {
            case "São Paulo":
            System.out.println("A maior cidade do Brasil.");
            break;
        
            case "Rio de Janeiro":
            System.out.println("Cidade de belas praias.");
            default:
            System.out.println("Cidade não encontrada.");
            
        } */
    }
}
