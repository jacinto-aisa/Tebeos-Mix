// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Vehiculo
{
    public String matricula;
    private int cc;
    private int consumo;

    public Vehiculo(String matricula, int cc, int consumo) {
        this.matricula = matricula;
        setCc(cc);
        setConsumo(consumo);
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        if (cc>=0)
            this.cc = cc;
        else
            this.cc = 0;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        if (consumo>=0)
            this.consumo = consumo;
        else
            this.consumo = 0;
    }
}

class Tebeo {
    public String editorial;
    public String autor;
    private int edicion;

    public Tebeo(String editorial, String autor, int edicion, int numeroPaginas) {
        this.editorial = editorial;
        this.autor = autor;
        setEdicion(edicion);
        setNumeroPaginas(numeroPaginas);
    }

    public void setEdicion(int edicion) {
        if (edicion <= 2023 && edicion > 0)
            this.edicion = edicion;
        else
            this.edicion = 2023;
    }
    public int getEdicion() {
        return edicion;
    }
    private int numeroPaginas;
    public void setNumeroPaginas(int value){
        if (value <= 0)
            numeroPaginas = 0;
        else
            numeroPaginas = value;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
}
public class Main {
    public static void main(String[] args) {
        Tebeo HellBoy = new Tebeo("Editorial Norma","Mike Mignola", -3000, 34);
        Tebeo CuatroFantasticos = new Tebeo("Editorial Melón","Señor Azul",2017,-15);
        Vehiculo miCamion = new Vehiculo("Z-762367236",-100,400);
        Vehiculo Bicicleta = new Vehiculo("nula",10,-600);

        System.out.println("La editorial de hellboy es: "+HellBoy.editorial);
        System.out.println("El autor de hellboy es: "+HellBoy.autor);
        System.out.println("La edición de hellboy es del año: "+HellBoy.getEdicion());
        System.out.println("El numero de paginas de hellboy es de: "+HellBoy.getNumeroPaginas());

        System.out.println("Los cc de mi camión son: "+ miCamion.getConsumo());
        System.out.println("Los cc de mi camión son: "+ Bicicleta.getConsumo());

    }
}