import java.util.Scanner;

public class questao12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome");
        String nome = input.nextLine();

        System.out.println("Digite sua primeira distancia: ");
        double dist01 = input.nextDouble();

        System.out.println("Digite sua segunda distancia: ");
        double dist02 = input.nextDouble();

        System.out.println("Digite sua terceira distancia: ");
        double dist03 = input.nextDouble();

        System.out.println("Digite sua quarta distancia: ");
        double dist04 = input.nextDouble();

        System.out.println("Digite sua quinta distancia: ");
        double dist05 = input.nextDouble();

        if (dist01 > dist02 && dist01 > dist03 && dist01 > dist04 && dist01 > dist05){
            System.out.printf("a Dist01 %s e a maior ",dist01);
        }else if (dist02 > dist01 && dist02 > dist03 && dist02 > dist04 && dist02 > dist05) {
            System.out.printf("a Dist02 %s e a maior ", dist02);
        } else if (dist03 > dist01 && dist03 > dist02 && dist03 > dist04 && dist03 > dist05) {
            System.out.printf("a dist03 %s e a maior", dist03);
        } else if (dist04 > dist01 && dist04 > dist02 && dist04 > dist03 && dist04 > dist05) {
            System.out.printf("a dist04 %s e a maior", dist04);
        } else if (dist05 > dist01 && dist05 > dist02 && dist05 > dist03 && dist05 > dist04) {
            System.out.printf("a dist05 %s e a maior", dist05);
        }
        if (dist01 < dist02 && dist01 < dist03 && dist01 < dist04 && dist01 < dist05){
            System.out.printf("a Dist01 %s e a menor: ",dist01);
        }else if (dist02 < dist01 && dist02 < dist03 && dist02 < dist04 && dist02 < dist05) {
            System.out.printf("a Dist02 %s e a menor: ", dist02);
        } else if (dist03 < dist01 && dist03 < dist02 && dist03 < dist04 && dist03 < dist05) {
            System.out.printf("a dist03 %s e a menor:", dist03);
        } else if (dist04 < dist01 && dist04 < dist02 && dist04 < dist03 && dist04 < dist05) {
            System.out.printf("a dist04 %s e a menor:", dist04);
        } else if (dist05 < dist01 && dist05 < dist02 && dist05 < dist03 && dist05 < dist04) {
            System.out.printf("a dist05 %s e a menor:", dist05);
        }
    }
}
