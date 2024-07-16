import java.util.Scanner;


public class Motor
{
    private int potencia, rpm;
    private String tipoCombustivel;

    Motor(){ }

    Motor(int potencia, int rpm, String tipoCombustivel)
    {
        setPotencia(potencia);
        setRpm(rpm);
        setTipoCombustivel(tipoCombustivel);
    }

    Motor(int potencia)
    {
        setPotencia(potencia);
    }

    Motor(int potencia, int rpm)
    {
        setPotencia(potencia);
        setRpm(rpm);
    }

    Motor(String tipoCombustivel)
    {
        setTipoCombustivel(tipoCombustivel);
    }

    public int getPotencia()
    {
        return potencia;
    }

    public void setPotencia(int potencia)
    {
        if(potencia >= 0)
        { this.potencia = potencia; }
    }

    public int getRpm()
    {
        return rpm;
    }

    public void setRpm(int rpm)
    {
        if(rpm >= 0)
        { this.rpm = rpm; }
    }

    public String getTipoCombustivel()
    {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel)
    {
        if(!tipoCombustivel.isEmpty())
        { this.tipoCombustivel = tipoCombustivel; } 
    }

    public void cadastrar(int rpm, int potencia, String tipoCombustivel)
    {
        setRpm(rpm);
        setPotencia(potencia);
        setTipoCombustivel(tipoCombustivel);
    }

    public void imprimir()
    {
        System.out.println("RPM -> " + getRpm());
        System.out.println("Potencia -> " + getPotencia());
        System.out.println("Tipo do combustivel -> " + getTipoCombustivel());
    }

    public void entradaDados()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("RPM -> ");
        setRpm(Integer.parseInt(sc.nextLine()));

        System.out.print("Potencia -> ");
        setPotencia(Integer.parseInt(sc.nextLine()));

        System.out.print("Tipo de combustivel -> ");
        setTipoCombustivel(sc.nextLine());
    }
}
