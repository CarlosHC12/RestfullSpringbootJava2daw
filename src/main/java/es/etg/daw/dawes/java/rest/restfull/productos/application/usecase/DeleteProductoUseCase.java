package es.etg.daw.dawes.java.rest.restfull.productos.application.usecase;

import es.etg.daw.dawes.java.rest.restfull.productos.domain.error.ProductoNotFoundException;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteProductoUseCase {

    private final ProductoRepository productoRepository;

    public void delete(int id) {
        // Usamos la versión Optional getById(Integer) para comprobar existencia
        productoRepository.getById(Integer.valueOf(id))
            .ifPresentOrElse(
                p -> productoRepository.deleteById(Integer.valueOf(id)),
                () -> { throw new ProductoNotFoundException(id); }
            );
    }
}