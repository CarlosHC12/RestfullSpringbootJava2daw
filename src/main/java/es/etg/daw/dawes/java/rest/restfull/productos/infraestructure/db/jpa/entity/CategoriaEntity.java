package es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.db.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "CATEGORIAS")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // --- Constructores ---

    public CategoriaEntity() {
    }

    public CategoriaEntity(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
} 
