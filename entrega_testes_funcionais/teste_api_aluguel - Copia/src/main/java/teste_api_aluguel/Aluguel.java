package teste_api_aluguel;

import org.json.JSONPropertyName;

public class Aluguel {
    private double valorNominal;
    private int dia;

    public Aluguel(double valorNominal, int dia) {
        this.valorNominal = valorNominal;
        this.dia = dia;
    }

    @JSONPropertyName("valor_nominal")
    public double getValorNominal() {
        return valorNominal;
    }

    @JSONPropertyName("dia")
    public int getDia() {
        return dia;
    }
}