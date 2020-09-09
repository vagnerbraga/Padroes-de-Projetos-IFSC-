package proxy;

class Test {
    public static void main(String[] args) {
        City tubrao = new City(1, "Tubarão");
        City laguna = new City(2, "Laguna");
        City capiva = new City(3, "Capivari de Baixo");
        City gravatal = new City(4, "Gravatal");
        City bracoDoNorte = new City(5, "Braço do Norte");
        City jaguaruna = new City(6, "Jaguaruna");
        City trezeDeMaio = new City(7, "Treze de Maio");
        City orleans = new City(8, "Orleans");

        CityDao dao = new CityDao();
        CityProxy proxy = new CityProxy(dao);

        dao.create(tubrao);
        proxy.create(capiva);
        proxy.create(gravatal);
        proxy.create(trezeDeMaio);
        dao.create(orleans);
        dao.create(laguna);
        proxy.update(laguna);

        proxy.get(tubrao.getId());
        proxy.get(tubrao.getId());
        proxy.get(orleans.getId());
        proxy.get(orleans.getId());
        dao.get(laguna.getId());
        proxy.get(laguna.getId());



    }
}
