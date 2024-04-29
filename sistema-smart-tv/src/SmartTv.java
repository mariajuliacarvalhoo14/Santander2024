public class SmartTv {
  boolean ligada;
  int canal=1;
  int volume=25;  

  //ligar tv
  public void ligar(){
    ligada=true;
  }
  public void desligar(){
    ligada=false;
  }

  //alterar volume
  public void aumentarVolume(){
    System.out.println("Aumentando o volume para: " + volume);
    volume++;
  }
  public void diminuirVolume(){
    System.out.println("Diminuindo o volume para: " + volume);
    volume --;
  }
  
  //alterar canal
  public void aumentarCanal(){
    canal++;
  }
  public void diminuirCanal(){
    canal--;
  }
  public void mudarCanal (int novoCanal){
    canal = novoCanal;
  }






}

