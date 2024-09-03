package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selacaoCandidatos();
        //System.out.println("-------------------------------------Processo seletivo---------------------------------------------");
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
       
    }
    static void selacaoCandidatos(){
        String [] candidatos = {"FELIPE","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};
        int candidatosSelecionados =0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while (candidatosSelecionados<5){
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato" + candidato + "solicitou este valor de salario"+salarioPretendido);
            //double salarioBase=2000.0;
            if(salarioBase>= salarioPretendido){
                System.out.println("O candidato"+candidato+" foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

            
    }
    private static double valorPretendido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valorPretendido'");
    }
    static void analisarCandidato(double salarioPretendido){ //parametro de um metodo
    
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO"); 
        }
       else if(salarioBase==salarioPretendido)
       System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS"); 
       else{
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
       }
            
    } 
   
}

