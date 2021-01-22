public class Test {
    public static void main(String[] args) {

        Fraccion frac1 = new Fraccion(Long.valueOf(2),Long.valueOf(5));
        Fraccion frac2 = new Fraccion(Long.valueOf(2),Long.valueOf(5));
        Fraccion frac3 = frac1.dividir(frac2.getNumerador(), frac2.getDenominador());
        System.out.println(frac3.getNumerador() + "/" + frac3.getDenominador());

    }
}
