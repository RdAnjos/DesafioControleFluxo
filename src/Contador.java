
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
		try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo numero: ");
            int parametroDois = terminal.nextInt();

            try{
                //Chamando o metodo contendo a logica de contagem
                System.out.println("\nContagem comecou...");
                contar(parametroUm, parametroDois);

            }catch(ParametrosInvalidosException e){
                //Imprimir a mensagem: o segundo parametro deve ser > que o primeiro
                System.out.println("O segundo parametro deve ser MAIOR do que o primeiro. ");
            }
        }

    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //Validar se o parametroUm é > parametroDois e lançar excecao
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
            //System.out.println("O parametro um não pode ser maior do que o parametro dois");           
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os numeros com base na variavel contagem
        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }
}
