package proxy;

import java.util.List;

interface Dao<T> {
    public void create(T entity);
    public void update(T entity);
    public T get(Integer id);
    public void remove(Integer id);
}
