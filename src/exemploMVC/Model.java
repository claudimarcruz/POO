package exemploMVC;

public class Model {

  double num1=0, num2=0, resultado=0;

  public Model(){
  }

  public void setNumeros(double aNumero1, double aNumero2){
    this.num1 = aNumero1;
    this.num2 = aNumero2;
  }

  public void cacula(){
    resultado = num1 + num2;
  }

  public double getResultado(){
  return resultado;
  }

}