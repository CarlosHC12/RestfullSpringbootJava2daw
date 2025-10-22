package es.etg.daw.dawes.java.rest.restfull.productos.application.service;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.EditProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EditProductoService {

	public final EditProductoUseCase EditProductoUseCase;

	public Producto EditProducto(EditProductoCommand comando){
		Producto producto = EditProducto(comando);
		return producto;
	}

	public static Producto update(EditProductoCommand comando) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}
	
}