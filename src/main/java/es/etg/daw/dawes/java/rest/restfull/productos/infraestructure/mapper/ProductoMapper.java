
package es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.mapper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.CreateProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.command.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.web.dto.ProductoRequest;
import es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.web.dto.ProductoResponse;

public class ProductoMapper {

	public static CreateProductoCommand toCommand(ProductoRequest productoRequest){
		return new CreateProductoCommand(productoRequest.nombre(), productoRequest.precio());
	}

	public static ProductoResponse toResponse(Producto producto){
		return new ProductoResponse(producto.getId(),
									producto.getNombre(),
									producto.getPrecio(),
									producto.getCreatedAt());
	}
	

	public static EditProductoCommand toCommand(int id, ProductoRequest productoRequest){
		return new EditProductoCommand(id, productoRequest.nombre(), productoRequest.precio());
	}

	// Método que captura los errores y devuelve un mapa con el campo que no cumple la validación y un mensaje de error.
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
