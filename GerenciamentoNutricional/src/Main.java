public class Main {
    public static void main(String[] args) {
        GerenciadorNutricional gerenciador = new GerenciadorNutricional();

        //DADOS DE CLIENTES
        Cliente cliente1 = new Cliente(1, "João Lopes", "joaplopes@gmail.com", "108.567.345-23");
        gerenciador.adicionarCliente(cliente1);

        Cliente clienteRecuperado = gerenciador.obterCliente(1);
        System.out.println("Cliente encontrado: " + clienteRecuperado);

        Cliente clienteAtualizado = new Cliente(2, "Maria Silva", "mariaantonia@hotmail.com", "109.456.378-09");
        gerenciador.atualizarCliente(clienteAtualizado);
        System.out.println("Cliente atualizado: " + gerenciador.obterCliente(1));

        gerenciador.removerCliente(1);
        System.out.println("Cliente removido: " + gerenciador.obterCliente(1));

        //DADOS DE NUTRICIONISTA
        Nutricionista nutricionista1 = new Nutricionista(1, "Karla Sousa", "4567-PB", "karlanutri@gmail.com");
        gerenciador.adicionarNutricionista(nutricionista1);

        Nutricionista nutricionistaRecuperado = gerenciador.obterNutricionista(1);
        System.out.println("Nutricionista encontrado: " + nutricionistaRecuperado);

        Nutricionista nutricionistaAtualizado = new Nutricionista(2, "Ideão Barreiro", "ideaobarri@hotmail.com", "109.345.378-11");
        gerenciador.atualizarNutricionista(nutricionistaAtualizado);
        System.out.println("Nutricionista atualizado: " + gerenciador.obterNutricionista(1));

        gerenciador.removerNutricionista(1);
        System.out.println("Nutricionista removido: " + gerenciador.obterNutricionista(1));

        //DADOS DA DIETA
        Dieta dieta1 = new Dieta(3, "Ganho de Massa", "Essa dieta é para ganhar massa");
        gerenciador.adicionarDieta(dieta1);

        Dieta dietaRecuperado = gerenciador.obterDieta(3);
        System.out.println("Dieta encontrado: " + dietaRecuperado);

        Dieta dietaAtualizado = new Dieta(2, "Perda de Gordura", "Para a perda de gurdura faça minuciosamente");
        gerenciador.atualizarDieta(dietaAtualizado);
        System.out.println("Dieta atualizado: " + gerenciador.obterDieta(3));

        gerenciador.removerDieta(3);
        System.out.println("Dieta removida: " + gerenciador.obterDieta(3));

        //DADOS DO PLANO ALIMENTAR
        PlanoAlimentar planoAlimentar1 = new PlanoAlimentar(1, cliente1,nutricionista1, dieta1);
        gerenciador.adicionarPlanosAlimentares(planoAlimentar1);

        PlanoAlimentar planoAlimentar1Recuperado = gerenciador.obterPlanoAlimentar(1);
        System.out.println("Plano Alimentar encontrado: " + planoAlimentar1Recuperado);

        PlanoAlimentar planoAlimentarAtualizado = new PlanoAlimentar(2, clienteAtualizado, nutricionistaAtualizado, dietaAtualizado);
        gerenciador.atualizarPlanoAlimentar(planoAlimentarAtualizado);
        System.out.println("Plano Alimentar atualizado: " + gerenciador.obterPlanoAlimentar(1));

        gerenciador.removerPlanoAlimentar(1);
        System.out.println("Plano Alimentar removido: " + gerenciador.obterPlanoAlimentar(1));
    }
}