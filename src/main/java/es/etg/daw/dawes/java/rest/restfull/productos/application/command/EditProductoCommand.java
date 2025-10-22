package es.etg.daw.dawes.java.rest.restfull.productos.application.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

//Esta clase tiene los datos necesarios para editar un Producto
@Getter
@AllArgsConstructor
@Accessors(fluent = true) // Así los getters no llevan prefijo get
public class EditProductoCommand {
	
	private int id;
	private String nombre;
	private double precio;
	public int getId() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getId'");
	}
    public Object getDescripcion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescripcion'");
    }
}