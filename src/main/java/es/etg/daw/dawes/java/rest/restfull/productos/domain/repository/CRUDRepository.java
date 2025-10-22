package es.etg.daw.dawes.java.rest.restfull.productos.domain.repository;

import java.util.List;
import java.util.Optional;

import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;

public interface CRUDRepository<T, ID> {
    
    public T save(T t);
    public List<T> getAll();
    public Optional<T> getById(long id);
    public void deteteById(ID id);
    Optional<Producto> getById(Integer id);

}
