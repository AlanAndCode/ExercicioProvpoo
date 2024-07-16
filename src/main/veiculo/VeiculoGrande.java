import java.util.Scanner;

public abstract class VeiculoGrande extends Veiculo
{
    private int numeroPassageiros;

    public VeiculoGrande(){ }

    public VeiculoGrande(int numeroPassageiros)
    {
        setNumeroPassageiros(numeroPassageiros);
    }

    public VeiculoGrande(int numeroPassageiros, double preco, String placa, String marca)
    {
        super(preco, placa, marca);
        setNumeroPassageiros(numeroPassageiros);
    }

    public VeiculoGrande(double preco, String placa, String marca)
    {
        super(preco, placa, marca);
    }

    public VeiculoGrande(int numeroPassageiros, double preco)
    {
        super(preco);
        setNumeroPassageiros(numeroPassageiros);
    }

    public VeiculoGrande(int numeroPassageiros, String placa)
    {
        super(placa);
        setNumeroPassageiros(numeroPassageiros);
    }

    public void setNumeroPassageiros(int numeroPassageiros)
    {
        if(numeroPassageiros >= 0)
        { this.numeroPassageiros = numeroPassageiros; }
    }

    public int getNumeroPassageiros()
    {
        return this.numeroPassageiros;
    }

    public void cadastrar(double preco, String placa, String marca, Motor motor, int numeroPassageiros)
    {
        super.cadastrar(preco, placa, marca, motor);
        setNumeroPassageiros(numeroPassageiros);
    }

    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Numero de passageiros -> " + getNumeroPassageiros());
    }

    @Override
    public void entradaDados()
    {
        super.entradaDados();

        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de passageiros -> ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
    }
}
