package controles;

public class SwitchSemBreak {

    public static void main(String[] args){
        String faixa = "preta";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei golpes avançados");
            case "marrom":
                System.out.println("Sei praticamente todos os golpes");
            case "roxa":
                System.out.println("Sei lutar,mas tenhos que ganhar experiência");
            case "laranja":
                System.out.println("Comecei a lutar, mas não sei muito");
            default:
                System.out.println("Valor não encontrado!");
        }
    }
}
