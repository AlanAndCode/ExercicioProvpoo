import veiculo.Carro;
import veiculo.Moto;
import veiculo.Onibus;

public class Main
{
    public static void main(String[] args)
    {
        final int TAMANHO = 1;

        Carro carros[] = new Carro[TAMANHO];
        Moto motos[] = new Moto[TAMANHO];
        Onibus onibus[] = new Onibus[TAMANHO];

        // Entrada dos dados
        for(int i = 0; i < TAMANHO; i++)
        {
            carros[i] = new Carro();
            motos[i] = new Moto();
            onibus[i] = new Onibus();

            System.out.println("carros[" + i + "]:");
            carros[i].entradaDados();
            System.out.println();

            System.out.println("motos[" + i + "]:");
            motos[i].entradaDados();
            System.out.println();

            System.out.println("onibus[" + i + "]:");
            onibus[i].entradaDados();
            System.out.println();
        }

        // IMPRIMINDO
        for(int i = 0; i < TAMANHO; i++)
        {
            System.out.println("carros[" + i + "]:");
            carros[i].imprimir();
            System.out.println();

            System.out.println("motos[" + i + "]:");
            motos[i].imprimir();
            System.out.println();

            System.out.println("onibus[" + i + "]:");
            onibus[i].imprimir();
            System.out.println();
        }
    }
}
