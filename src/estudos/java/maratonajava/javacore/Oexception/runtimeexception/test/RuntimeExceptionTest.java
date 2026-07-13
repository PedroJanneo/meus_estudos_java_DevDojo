package estudos.java.maratonajava.javacore.Oexception.runtimeexception.test;


public class RuntimeExceptionTest {
    public static void main(String[] args) {

        divisao(10, 0);

        System.out.println("Cod funcionando");
    }

    /**
     *
     * @param num1
     * @param num2 não pode ser 0
     * @throws IllegalArgumentException caso numero2 seja 0
     */
    private static void divisao(int num1, int num2)throws IllegalArgumentException{ // aqui é mais uma assinatura, tipo um aviso, que este metodo pdoe dar o IllegalArgumentException
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2"); //  IllegalArgumentException -> excessao onde metodo recebu um argumento errado
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
