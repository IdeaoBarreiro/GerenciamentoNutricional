import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GerenciadorNutricional {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Nutricionista> nutricionistas = new ArrayList<>();
    private List<Dieta> dietas = new ArrayList<>();
    private List<PlanoAlimentar> planosAlimentares = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente obterCliente(int id) {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public void atualizarCliente(Cliente clienteAtualizado) {
        ListIterator<Cliente> iterator = clientes.listIterator();
        while (iterator.hasNext()) {
            Cliente clienteExistente = iterator.next();
            if (clienteExistente.getId() == clienteAtualizado.getId()) {
                iterator.set(clienteAtualizado);
                return;
            }
        }
    }

    public void removerCliente(int id) {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    public void adicionarNutricionista(Nutricionista nutricionista) {
        nutricionistas.add(nutricionista);
    }

    public Nutricionista obterNutricionista(int id) {
        Iterator<Nutricionista> iterator = nutricionistas.iterator();
        while (iterator.hasNext()) {
            Nutricionista nutricionista = iterator.next();
            if (nutricionista.getId() == id) {
                return nutricionista;
            }
        }
        return null;
    }

    public void atualizarNutricionista(Nutricionista nutricionistaAtualizado) {
        ListIterator<Nutricionista> iterator = nutricionistas.listIterator();
        while (iterator.hasNext()) {
            Nutricionista nutricionistaExistente = iterator.next();
            if (nutricionistaExistente.getId() == nutricionistaAtualizado.getId()) {
                iterator.set(nutricionistaAtualizado);
                return;
            }
        }
    }

    public void removerNutricionista(int id) {
        Iterator<Nutricionista> iterator = nutricionistas.iterator();
        while (iterator.hasNext()) {
            Nutricionista nutricionista = iterator.next();
            if (nutricionista.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    public void adicionarDieta(Dieta dieta) {
        dietas.add(dieta);
    }

    public Dieta obterDieta(int id) {
        Iterator<Dieta> iterator = dietas.iterator();
        while (iterator.hasNext()) {
            Dieta dieta = iterator.next();
            if (dieta.getId() == id) {
                return dieta;
            }
        }
        return null;
    }

    public void atualizarDieta(Dieta dietaAtualizado) {
        ListIterator<Dieta> iterator = dietas.listIterator();
        while (iterator.hasNext()) {
            Dieta dietaExistente = iterator.next();
            if (dietaExistente.getId() == dietaAtualizado.getId()) {
                iterator.set(dietaAtualizado);
                return;
            }
        }
    }

    public void removerDieta(int id) {
        Iterator<Dieta> iterator = dietas.iterator();
        while (iterator.hasNext()) {
            Dieta dieta = iterator.next();
            if (dieta.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    public void adicionarPlanosAlimentares(PlanoAlimentar planoAlimentar) {
        planosAlimentares.add(planoAlimentar);
    }

    public PlanoAlimentar obterPlanoAlimentar(int id) {
        Iterator<PlanoAlimentar> iterator = planosAlimentares.iterator();
        while (iterator.hasNext()) {
            PlanoAlimentar planoAlimentar = iterator.next();
            if (planoAlimentar.getId() == id) {
                return planoAlimentar;
            }
        }
        return null;
    }

    public void atualizarPlanoAlimentar(PlanoAlimentar planoAlimentar) {
        ListIterator<PlanoAlimentar> iterator = planosAlimentares.listIterator();
        while (iterator.hasNext()) {
            PlanoAlimentar planoAlimentarExistente = iterator.next();
            if (planoAlimentarExistente.getId() == planoAlimentar.getId()) {
                iterator.set(planoAlimentar);
                return;
            }
        }
    }

    public void removerPlanoAlimentar(int id) {
        Iterator<PlanoAlimentar> iterator = planosAlimentares.iterator();
        while (iterator.hasNext()) {
            PlanoAlimentar planoAlimentar = iterator.next();
            if (planoAlimentar.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }    
}
