import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner  sc= new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");
        int ParametroUm = sc.nextInt();
        System.out.println("Digite o segundo paramentro:");
        int parametroDois = sc.nextInt();
        
        try {
            //chamando o metodo contendo a lógica de contagem 

            contar(parametroUm,parametroDois);
            
        } catch (Exception e) {
            // imprimir a mensagem: o segundo parametro de ser maior que o primeiro
        }
        static void contar(int parametroUm, int parametroDois){
            // validar se parametro é Maior que parametroDois e lançar a exceção

            int contagem = parametroDois - parametroUm;
        }
    }
}
