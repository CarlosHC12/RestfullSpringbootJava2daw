package es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.etg.daw.dawes.java.rest.restfull.productos.application.service.CreateProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.service.EditProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.service.FindProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.CreateProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.EditProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.FindProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ProductoConfig {


    public final ProductoRepository productoRepository;
    
    @Bean
    public CreateProductoUseCase createProductoUseCase() {
        return new CreateProductoUseCase(productoRepository);
    }
    @Bean
    public CreateProductoService createProductoService(){
        return new CreateProductoService(createProductoUseCase());
    }

    @Bean
    public FindProductoUseCase findProductoUseCase(){
        return new FindProductoUseCase(productoRepository);
    }

    @Bean
    public FindProductoService findProductoService(){
        return new FindProductoService(findProductoUseCase());
    }


    @Bean
    public EditProductoUseCase editProductoUseCase() {
        return new EditProductoUseCase(productoRepository);
    }
    
    @Bean
    public EditProductoService editProductoService(){
        return new EditProductoService(editProductoUseCase());
    }

    
    
} //hola esto es un comentario de prueba