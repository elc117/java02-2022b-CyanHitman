public class Imc{
  public float altura;
  public float peso;
  public String sexo;

  public float getAltura(){
    return this.altura;
  }
  public void setAltura(float a){
    this.altura = a;
  }

  public float getPeso(){
    return this.peso;
  }
  public void setPeso(float p){
    this.peso = p;
  }

  public String getSexo(){
    return this.sexo;
  }
  public void setSexo(String s){
    this.sexo = s;
  }

  public Imc(float a, float p, String s){
    this.setAltura(a);
    this.setPeso(p);
    this.setSexo(s);
  }
  
  public void status(){
    System.out.println("Peso: " + this.peso);
    System.out.println("Altura: " + this.altura);
    System.out.println("Sexo: " + this.sexo);
    
    float imc = this.peso / (this.altura * this.altura);

    System.out.println("Indice de massa corporea de " + imc);
    
    if(imc < 18.5){
      System.out.println("Abaixo do peso");
    }else if(imc < 25 && imc <= 18.5){
      System.out.println("Peso normal");
    }else{
      System.out.println("Sobrepeso");
    }
  
  }
}

  

