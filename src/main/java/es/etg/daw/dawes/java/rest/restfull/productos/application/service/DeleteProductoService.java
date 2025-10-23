package es.etg.daw.dawes.java.rest.restfull.productos.application.service;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.DeleteProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.command.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.DeleteProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.EditProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DeleteProductoService {

	public final  DeleteProductoUseCase EditProductoUseCase;


	public Producto Delete(DeleteProductoCommand comando) {
		Producto producto = DeleteProductoUseCase.delete(comando);
		return producto;
	}
	
}