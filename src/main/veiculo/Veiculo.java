import java.util.Scanner;

  public abstract class Veiculo implements Movimentos
  {
      public static final int IDADE_MINIMA_MOTORISTA = 18;

      private double preco;
      private String placa, marca;
      public Motor motor = new Motor();

      public Veiculo(){}

      public Veiculo(double preco, String placa, String marca)
      {
          setPreco(preco);
          setPlaca(placa);
          setMarca(marca);
      }

      public Veiculo(double preco)
      {
          setPreco(preco);
      }

      public Veiculo(String placa)
      {
          setPlaca(placa);
      }

      public Veiculo(double preco, String placa)
      {
          setPreco(preco);
          setPlaca(placa);
      }

      public Veiculo(String placa, String marca)
      {
          setPlaca(placa);
          setMarca(marca);
      }

      public Veiculo(String marca, double preco)
      {
          setMarca(marca);
          setPreco(preco);
      }

      public double getPreco() 
      {
          return preco;
      }

      public void setPreco(double preco) 
      {
          if(preco > 0.0)
          { this.preco = preco; }
      }

      public String getPlaca() 
      {
          return placa;
      }

      public void setPlaca(String placa) 
      {
          if(!placa.isEmpty())
          { this.placa = placa; }
      }

      public String getMarca() 
      {
          return marca;
      }

      public void setMarca(String marca) 
      {
          if(!marca.isEmpty())
          { this.marca = marca; }
      }

      public void cadastrar(double preco, String placa, String marca, Motor motor)
      {
          setPreco(preco);
          setPlaca(placa);
          setMarca(marca);
          this.motor = motor;
      }

      public void imprimir()
      {
          System.out.println("Preco -> " + getPreco());
          System.out.println("Placa -> " + getPlaca());
          System.out.println("Marca -> " + getMarca());
          System.out.println("Motor:");
          motor.imprimir();
      } 

      public void entradaDados()
      {
          Scanner sc = new Scanner(System.in);

          System.out.print("Preco -> ");
          setPreco(Double.parseDouble(sc.nextLine()));

          System.out.print("Placa -> ");
          setPlaca(sc.nextLine());

          System.out.print("Marca -> ");
          setMarca(sc.nextLine());

          System.out.println("Motor:");
          motor.entradaDados();
      }

      public abstract double desconto();
  }
