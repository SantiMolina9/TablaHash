package proyectohash;

public class Tabla {
    public Employee T[];
    public final int tamaño;
    //Construyo la tabla con su tamaño
    public Tabla(int tamaño) {
        this.tamaño = tamaño;
        this.T = new Employee[tamaño];
    }
    public int transformarClave(String string){
        int claveT = Integer.parseInt(string);
        return claveT;
    }
    //Metodo de dispersion con Plegamiento
    public int plegamiento(String x){
        int longitud = x.length();
        int mitad = longitud/2;
        String primeraParte = x.substring(0, mitad);
        String segundaParte = x.substring(mitad, longitud);
        int pP= Integer.parseInt(primeraParte);
        int sP = Integer.parseInt(segundaParte);
        Integer d = pP + sP;
        String pos = String.valueOf(d);
        if(pos.length()> 3){
            return Integer.parseInt(pos.substring(1, 4));
        }
        else{
            return Integer.parseInt(pos);
        }
   }
    //Dispersion por metodo de multiplicacion
    public int multiplicacion(int clave){
        double r = 0.6180334;
        double decimal = clave * r - Math.floor(clave * r);
        int entero = (int)(decimal*tamaño);
        return entero;
    }
    //Metodo de dispersion de aritmetica modular
    public int aModular(int x){
        return x%tamaño;
    }
    //Metodo de dispersion de mitad de cuadrado (Posicion 4, 5 y 6 desde la derecha) 
    public int mitadDelCuadrado(long clave){
        long s = clave * clave;
        String x = String.valueOf(s);
        String t = x.substring(4, 6);
        int pos = Integer.parseInt(t);
        return pos;
    }
    //Insercion del objeto con los distintos metodos
    public void insertarAModular(Employee e){
        T[aModular(e.id)] = e;
    }
    public void insertarPlegamiento(Employee e, int s){
        T[s] = e;
    }
    public void insertarMitadDelCuadrado(Employee e){
        T[mitadDelCuadrado(e.id)] = e;
    }
    public void insertarMultiplicacion(Employee e){
        T[multiplicacion(e.id)] = e;
    }
    
}
