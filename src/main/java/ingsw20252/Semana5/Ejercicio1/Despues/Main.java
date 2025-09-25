package ingsw20252.Semana5.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {

        GeneradorDeReportes generadorexcel = new GeneradorExcel();

        IReporte reporteexcel = generadorexcel.crearReporte();

        reporteexcel.generar();

        GeneradorDeReportes generadorpdf = new GeneradorPDF();

        IReporte reportepdf = generadorpdf.crearReporte();

        reportepdf.generar();

    }
}
