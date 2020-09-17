import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaixaEletronicoTest {

    private static CaixaEletronico caixaEletronico = new CaixaEletronico();

    @DisplayName("Deve não retornar nulo e permitir sacar")
    @Test
    void teste1() {
        boolean result = caixaEletronico.sacar(50);

        assertNotNull(result);
    }

    @DisplayName("Deve retornar pelo menos uma nota")
    @Test
    void teste2() {
        var result = caixaEletronico.notas(50);

        assertNotNull(result);
    }

    @DisplayName("Deve retornar uma única nota para o valor sacado")
    @Test
    void teste3() {
        var result = caixaEletronico.notas(50);

        assertEquals(1, result.size());
    }

    @DisplayName("Deve retornar mais de uma nota para o valor sacado")
    @Test
    void teste4() {
        var result = caixaEletronico.notas(120);

        assertEquals(2, result.size());
    }
}
