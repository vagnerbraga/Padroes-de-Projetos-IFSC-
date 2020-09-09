package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CityProxy implements Dao<City> {

    private final CityDao cityDao;

    CityProxy(CityDao dao){
        this.cityDao = dao;
    }
    private Map<Integer, City> memory = new HashMap();
    @Override
    public void create(City entity) {
        this.cityDao.create(entity);
        memory.put(entity.getId(), entity);
    }

    @Override
    public void update(City entity) {
        this.cityDao.update(entity);
        memory.put(entity.getId(), entity);
    }

    @Override
    public City get(Integer id) {
        if(this.memory.containsKey(id)){
            System.out.println("Dados da memória");
            return this.memory.get(id);
        }
        City c = this.cityDao.get(id);
        this.memory.put(c.getId(), c);
        return c;
    }

    @Override
    public void remove(Integer id) {
        this.memory.remove(id);
        this.cityDao.remove(id);
    }
}