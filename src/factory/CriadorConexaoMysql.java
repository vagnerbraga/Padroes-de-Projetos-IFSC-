package factory;

class CriadorConexaoMysql implements CriadorConexao {

    @Override
    public IMinhaConexao getConexao() {
        return new MinhaConexaoMysql();
    }
}
