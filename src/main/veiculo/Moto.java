import java.util.Scanner;

public class Moto extends Veiculo
{
    // Desconto de 8% -> 8/100 = 0.08
    final static double DESCONTO = 0.08;

    private int volumeBagageiro;

    public Moto(){ }

    public Moto(int volumeBagageiro)
    {
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(int volumeBagageiro, double preco, String placa, String marca)
    {
        super(preco, placa, marca);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(double preco, String placa, String marca)
    {
        super(preco, placa, marca);
    }

    public Moto(int volumeBagageiro, double preco)
    {
        super(preco);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(int volumeBagageiro, String marca)
    {
        super(marca);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(String placa, String marca)
    {
        super(placa, marca);
    }

    public Moto(String marca, double preco)
    {
        super(marca, preco);
    }

    public void setVolumeBagageiro(int volumeBagageiro)
    {
        if(volumeBagageiro > 0)
        { this.volumeBagageiro = volumeBagageiro; }
    }

    public int getVolumeBagageiro()
    {
        return this.volumeBagageiro;
    }

    @Override
    public double desconto()
    {
        // Preço descontado é 85% (100% - 15%) do preço
        return getPreco() * (1 - DESCONTO);
    }

    @Override
    public void acelerar()
    {
        motor.setRpm(motor.getRpm() + 200);
    }

    @Override
    public void desacelerar()
    { 
        motor.setRpm(motor.getRpm() - 200);   
    }

    @Override
    public void frear()
    {
        System.out.println("Moto freando");
    }

    @Override
    public void virarEsquerda()
    {
        System.out.println("A moto virou à esquerda");
    }

    @Override
    public void virarDireita()
    {
        System.out.println("A moto virou à direita");
    }

    public void cadastrar(double preco, String placa, String marca, Motor motor, int volumeBagageiro)
    {
        super.cadastrar(preco, placa, marca, motor);
        setVolumeBagageiro(volumeBagageiro);
    }

    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Volume do bagageiro -> " + getVolumeBagageiro());
    }

    @Override
    public void entradaDados()
    {
        super.entradaDados();

        Scanner sc = new Scanner(System.in);
        System.out.print("Volume do bagageiro -> ");
        setVolumeBagageiro(Integer.parseInt(sc.nextLine()));
    }
}