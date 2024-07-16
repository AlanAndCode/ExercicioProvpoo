import java.util.Scanner;

public class Onibus extends VeiculoGrande 
{
    // Desconto de 15% -> 15/100 = 0.15
    final static double DESCONTO = 0.15;

    private boolean banheiro;

    public Onibus() {}

    public Onibus(boolean banheiro, int numeroPassageiros, double preco, String placa, String marca)
    {
        super(numeroPassageiros, preco, placa, marca);
        setBanheiro(banheiro);
    }

    public Onibus(boolean banheiro)
    {
        setBanheiro(banheiro);
    }

    public Onibus(boolean banheiro, int numeroPassageiros)
    {
        super(numeroPassageiros);
        setBanheiro(banheiro);
    }

    public Onibus(int numeroPassageiros, double preco, String placa, String marca)
    {
        super(numeroPassageiros, preco, placa, marca);
    }

    public Onibus(boolean banheiro, double preco, String placa, String marca)
    {
        super(preco, placa, marca);
        setBanheiro(banheiro);
    }

    public Onibus(int numeroPassageiros, double preco)
    {
        super(numeroPassageiros, preco);
    }

    public Onibus(boolean banheiro, double preco)
    {
        setPreco(preco);
        setBanheiro(banheiro);
    }

    public void setBanheiro(boolean banheiro)
    {
        this.banheiro = banheiro;
    }

    public boolean getBanheiro()
    {
        return this.banheiro;
    }

    @Override
    public double desconto() 
    {
        return getPreco() * (1 - DESCONTO);
    }

    @Override
    public void acelerar() 
    {
        motor.setRpm(motor.getRpm() + 50);
    }

    @Override
    public void desacelerar() 
    {
        motor.setRpm(motor.getRpm() - 50);
    }

    @Override
    public void frear() 
    {
        System.out.println("Onibus freou");
    }

    @Override
    public void virarEsquerda() 
    {
        System.out.println("Onibus virando a esquerda");
    }

    @Override
    public void virarDireita() 
    {
        System.out.println("Onibus virando a direita");
    }

    public void cadastrar(double preco, String marca, String placa, Motor motor,
            int numeroPassageiros, boolean banheiro)
    {
        super.cadastrar(preco, placa, marca, motor, numeroPassageiros);
        setBanheiro(banheiro);
    }

    @Override
    public void imprimir()
    {
        super.imprimir();

        // O operador ternário (?:) é uma forma de atribuir
        // rapidamente de acordo com uma condição
        String banheiro = getBanheiro() ? "sim" : "não";

        /* É a mesma coisa que o trecho de código abaixo

        String banheiro;
        if(getBanheiro())
        {
            banheiro = "sim";
        }
        else
        {
            banheiro = "não";
        }

        */

        System.out.println("Tem banheiro? -> " + banheiro);
    }

    @Override
    public void entradaDados()
    {
        super.entradaDados();

        Scanner sc = new Scanner(System.in);
        System.out.print("Tem banheiro? [S/N] -> ");
        char banheiroChar = sc.nextLine().charAt(0);

        if(banheiroChar == 's' || banheiroChar == 'S')
        {
            setBanheiro(true);
        }
        else
        {
            setBanheiro(false);
        }
    }
}
