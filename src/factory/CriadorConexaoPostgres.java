package factory;

class CriadorConexaoPostgres implements CriadorConexao {

    @Override
    public IMinhaConexao getConexao() {
        return new MinhaConexaoPostgres();
    }
}
