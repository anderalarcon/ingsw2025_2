package ingsw20252.Semana5.Ejercicio1.Despues;

public class GeneradorExcel extends GeneradorDeReportes {

    @Override
    public IReporte crearReporte() {
        return new ReporteExcel();
    }

}
