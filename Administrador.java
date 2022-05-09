public class Administrador extends Empregado {

    private double ajudaCusto;

    public double getAjudaCusto() {
        return ajudaCusto;
    }
    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    public void calcularAaaa(){
        double salarioADM = calcularSalario() + ajudaCusto;

    }

}
