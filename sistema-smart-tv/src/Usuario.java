public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        //canal inicial
        System.out.println("Canal anterior: " +smartTv.canal);
        //numero do novo canal 
        smartTv.mudarCanal(13);
        //mudou o canal 
        System.out.println("Canal atual: " +smartTv.canal);

        //System.out.println("Tv ligada? " + smartTv.ligada);
        //System.out.println("Canal Atual :" + smartTv.canal);
        //System.out.println("Volume Atual : " + smartTv.volume);
        
         
        
       





    }
}
