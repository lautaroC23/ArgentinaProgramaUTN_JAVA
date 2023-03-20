package integrador;

public class ResultadoEnum {

    private String resultado;
    public ResultadoEnum(){};

    public String getResultado(){
        return this.resultado;
    }
    public void setresultado(String result){
        this.resultado = result;
    }
    public String ganaEquipo1(){
        return "GanaEquipo1";
    }

    public String ganaEquipo2(){
        return "GanaEquipo2";
    }

    public String empate(){
        return "Empate";
    }
}
