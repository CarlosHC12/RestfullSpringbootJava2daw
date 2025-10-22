package es.etg.daw.dawes.java.rest.restfull.productos.application.usecase;
import es.etg.daw.dawes.java.rest.restfull.productos.application.command.DeleteProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.command.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.error.ProductoNotFoundException;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class DeleteProductoUseCase {

    private final ProductoRepository productoRepository;
    
    public Producto delete(EditProductoCommand comando){
        Producto producto = productoRepository.getById(comando.delete())
            .orElseThrow(() -> new ProductoNotFoundException(command.getId()));
        productoRepository.delete(producto);
        return producto;

    }

}