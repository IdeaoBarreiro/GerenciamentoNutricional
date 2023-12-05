import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GerenciadorNutricionalTest {

    @Test
    void testAdicionarObterCliente() {
        GerenciadorNutricional gerenciador = new GerenciadorNutricional();
        Cliente cliente1 = new Cliente(1, "João Lopes", "joaplopes@gmail.com", "108.567.345-23");

        gerenciador.adicionarCliente(cliente1);
        Cliente clienteRecuperado = gerenciador.obterCliente(1);

        assertEquals(cliente1, clienteRecuperado);
    }

    @Test
    void testAtualizarCliente() {
        GerenciadorNutricional gerenciador = new GerenciadorNutricional();
        Cliente cliente1 = new Cliente(1, "João Lopes", "joaplopes@gmail.com", "108.567.345-23");
        gerenciador.adicionarCliente(cliente1);

        Cliente clienteAtualizado = new Cliente(1, "João Lopes", "joaplopes@gmail.com", "108.567.345-23");
        gerenciador.atualizarCliente(clienteAtualizado);

        Cliente clienteRecuperado = gerenciador.obterCliente(1);
        assertEquals(clienteAtualizado, clienteRecuperado);
    }

    @Test
    void testRemoverCliente() {
        GerenciadorNutricional gerenciador = new GerenciadorNutricional();
        Cliente cliente1 = new Cliente(1, "João Lopes", "joaplopes@gmail.com", "108.567.345-23");
        gerenciador.adicionarCliente(cliente1);

        gerenciador.removerCliente(1);
        Cliente clienteRecuperado = gerenciador.obterCliente(1);

        assertNull(clienteRecuperado);
    }
}
