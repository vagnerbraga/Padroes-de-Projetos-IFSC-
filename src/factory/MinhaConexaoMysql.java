package factory;

class MinhaConexaoMysql implements IMinhaConexao {

    @Override
    public void conectar() {
        System.out.println("Conexao com Mysql");

    }

    @Override
    public void nomeConexao() {
        System.out.println("MYSQL");
    }
}
