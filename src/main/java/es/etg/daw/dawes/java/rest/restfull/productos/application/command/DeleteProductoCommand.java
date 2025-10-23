package es.etg.daw.dawes.java.rest.restfull.productos.application.command;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

//Esta clase tiene los datos necesarios para editar un Producto
@Getter
@AllArgsConstructor
@Accessors(fluent = true) // Así los getters no llevan prefijo get
public class DeleteProductoCommand {
	
	private long id;

    // Método para obtener el ID del producto a eliminar
	
}
