package integrador;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(){};

    public String getResultado(Pronostico pronostico){
        return pronostico.resultado.getResultado();
    }

    public void setresultado(ResultadoEnum result){
        this.resultado = result;
    }
    //public int puntos(){};
}
