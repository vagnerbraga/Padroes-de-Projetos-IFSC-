package factory;

class MinhaConexaoPostgres implements IMinhaConexao {

    @Override
    public void conectar() {
        System.out.println("Conexao com Postgres");
    }

    @Override
    public void nomeConexao() {
        System.out.println("POSTRGES");
    }
}
