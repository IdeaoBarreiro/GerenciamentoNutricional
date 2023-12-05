public class Nutricionista {
    private int id;
    private String nome;
    private String cfn;
    private String email;

    public Nutricionista(int id, String nome, String cfn, String email) {
        this.id = id;
        this.nome = nome;
        this.cfn = cfn;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCfn() {
        return cfn;
    }

    public void setCfn(String cfn) {
        this.cfn = cfn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
