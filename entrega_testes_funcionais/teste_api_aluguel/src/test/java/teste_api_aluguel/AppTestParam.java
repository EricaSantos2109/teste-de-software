package teste_api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

public class AppTestParam {

    @ParameterizedTest
    @CsvSource(value = { "800.00,-2,-1.0", "800.00,-1,-1.0", "800.00,0,-1.0", "800.00,1,720.0", "800.00,2,720.0",
            "800.00,4,720.0", "800.00,5,720.0", "800.00,6,760.0", "800.00,7,760.0", "800.00,9,760.0", "800.00,10,760.0",
            "800.00,11,800.0", "800.00,12,800.0", "800.00,14,800.0", "800.00,15,800.0", "800.00,16,816.8",
            "800.00,17,817.6", "800.00,29,827.2", "800.00,30,828.0", "800.00,31,-1.0",
            "800.00,32,-1.0" }, delimiter = ',')
    public void testParamListaESMR(float x, int y, float result) {
        assertEquals(result, App.requisicaoAluguel(x, y).getFloat("valor_calculado"), 0.01);
    }

    @ParameterizedTest(name = "Teste {index} => x={0}; y={1}, " + "resultado={2}")
    @CsvFileSource(resources = "/valores_teste_param.csv", delimiter = ',')
    public void testParamArquivoESMR(float x, int y, float result) {
        assertEquals(result, App.requisicaoAluguel(x, y).getFloat("valor_calculado"), 0.01);
    }
}