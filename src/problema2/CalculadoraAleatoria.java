package problema2;

class CalculadoraAleatoria {
    
    public int[] reordenarAleatorio(int[] numeros){
        int[] resultado = new int [numeros.length];
        double numRandom = Math.random();
        
        
        return resultado;
    }
    private static int aleatorio(int n){
        int resultado = 0;
        resultado = (int) (Math.random() * (n+1));
        return resultado;
    }
    
    public static void main(String[] args){
    System.out.println("El aleatorio de 0=" +aleatorio(0));
    System.out.println("El aleatorio de 1=" +aleatorio(0));
    System.out.println("El aleatorio de 2=" +aleatorio(0));
    }
}
