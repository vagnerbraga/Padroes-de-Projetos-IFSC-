package proxy;

import java.util.*;

class CityDao implements Dao<City> {
    private Map<Integer, City> dataBase = new HashMap();
    @Override
    public void create(City entity) {
        this.dataBase.put(entity.getId(), entity);
    }

    @Override
    public void update(City entity) {
        this.dataBase.put(entity.getId(), entity);
    }

    @Override
    public City get(Integer id) {
        if(this.dataBase.containsKey(id)){
            System.out.println("Dados do bando de dados");
            return this.dataBase.get(id);
        }
        return null;
    }

    @Override
    public void remove(Integer id) {
        this.dataBase.remove(id);
    }
}
