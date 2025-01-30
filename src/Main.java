public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int numero = 10;

        if(numero > 5)
        {
            System.out.println("Sí, tu número ser mayor que 5");
        }
        else
        {
            System.out.println("El número es menor a 5");
        }

        System.out.println("Esto es un for");
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("Esto es un switch");
        char letra = 'A';
        switch (letra)
        {
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C':
                System.out.println("C");
                break;

            case 'D':
                System.out.println("D");
                break;
        }

        System.out.println("Cuenta regresiva");
        int contador = 10;
        while(contador > 0)
        {
            System.out.println(contador);
            contador--;
        }

        //Ejemplo de do-while
        System.out.println("Imprimir al menos una vez");
        int numero2 = 0;

        do
        {
            System.out.println(numero2);
            numero2++;
        }
        while(numero2 < 10);
    }
}