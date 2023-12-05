public class PlanoAlimentar {

    private int id;
    private Cliente cliente;
    private Nutricionista nutricionista;
    private Dieta dieta;

    public PlanoAlimentar(int id, Cliente cliente, Nutricionista nutricionista, Dieta dieta) {
        this.id = id;
        this.cliente = cliente;
        this.nutricionista = nutricionista;
        this.dieta = dieta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }


}
