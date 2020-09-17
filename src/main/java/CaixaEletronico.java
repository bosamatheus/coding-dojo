import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaixaEletronico {

    private static final List<Integer> valoresPossiveis = Arrays.asList(100, 50, 20, 10);

    public boolean sacar(int valor) {
        return true;
    }

    public List<Integer> notas(int valor) {
        List<Integer> notasRetornadas = new ArrayList<>();

        while (valor > 0) {
            for (Integer candidata : valoresPossiveis) {
                if (valor >= candidata) {
                    notasRetornadas.add(candidata);
                    valor -= candidata;
                    break;
                }
            }
        }

        return notasRetornadas;
    }
}
