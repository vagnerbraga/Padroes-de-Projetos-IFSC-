package factory;

class Teste {

    public static void main(String[] args) {

        CriadorConexao criador = new CriadorConexaoMysql();

        IMinhaConexao minhaConexao = criador.getConexao();

        minhaConexao.conectar();
        minhaConexao.nomeConexao();

    }
}
