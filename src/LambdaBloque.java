public class LambdaBloque {

    interface StringPrueba{
        boolean prueba(String s1, String s2);
    }

    public static void main(String[] args) {
        StringPrueba isIn =(a,b)->a.indexOf(b)!=1;
        String str = "Esta es una prueba";
        if(isIn.prueba(str, "prueba"))
            System.out.println(" prueba encontrada");
        else
            System.out.println("prueba no encontrada");
        if (isIn.prueba(str,"prueba2"))
            System.out.println("prueba2 encontrada");
        else
            System.out.println("prueba2 no encontrada");
    }
}
