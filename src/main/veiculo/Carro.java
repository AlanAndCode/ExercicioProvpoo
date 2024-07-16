import java.util.Scanner;

public class Carro extends VeiculoGrande
{
    // Desconto de 10% -> 10/100 = 0.10
    public static final double DESCONTO = 0.1;

    private int volumeMala;

    public Carro(){ }

    public Carro(int volumeMala, int numeroPassageiros, double preco, String placa, String marca)
    {
        super(numeroPassageiros, preco, placa, marca);
        setVolumeMala(volumeMala);
    }

    public Carro(int numeroPassageiros, double preco, String placa, String marca)
    {
        super(numeroPassageiros, preco, placa, marca);
    }

    public Carro(int volumeMala)
    {
        setVolumeMala(volumeMala);
    }

    public Carro(int volumeMala, int numeroPassageiro)
    {
        super(numeroPassageiro);
        setVolumeMala(volumeMala);
    }

    public Carro(int volumeMala, int numeroPassageiros, double preco)
    {
        super(numeroPassageiros, preco);
        setVolumeMala(volumeMala);
    }

    public Carro(double preco, String placa, String marca)
    {
        super(preco, placa, marca);
    }

    public Carro(int volumeMala, String placa)
    {
        super(volumeMala, placa);
    }

    public void setVolumeMala(int volumeMala)
    {
        if(volumeMala > 0)
        { this.volumeMala = volumeMala; }
    }

    public int getVolumeMala()
    {
        return this.volumeMala;
    }

    @Override
    public double desconto() 
    {
        return getPreco() * (1 - DESCONTO);
    }

    @Override
    public void acelerar() 
    {
        motor.setRpm(motor.getRpm() + 100);
    }

    @Override
    public void desacelerar() 
    {
        motor.setRpm(motor.getRpm() - 100);
    }

    @Override
    public void frear() 
    {
        System.out.println("Carro freando");
    }

    @Override
    public void virarEsquerda() 
    {
        System.out.println("O carro virou à esquerda");
    }

    @Override
    public void virarDireita() 
    {
        System.out.println("O carro virou à direita");
    }

    public void cadastrar(double preco, String placa, String marca, Motor motor, int numeroPassageiros, int volumeMala)
    {
        super.cadastrar(preco, placa, marca, motor, numeroPassageiros);
        setVolumeMala(volumeMala);
    }

    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Volume da mala -> " + getVolumeMala());
    }

    @Override
    public void entradaDados()
    {
        super.entradaDados();

        Scanner sc = new Scanner(System.in);
        System.out.print("Volume da mala -> ");
        setVolumeMala(Integer.parseInt(sc.nextLine()));
    }
}
