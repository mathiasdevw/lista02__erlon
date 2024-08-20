public class questao13 {
    public static int somar(int a, int b){
        return a+b;
    }

    public static int subtrair(int a, int b){
        return a-b;
    }
    public static double dividir(int a, int b){
        return a / b;
    }
    public static void main(String[] args){

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

}
