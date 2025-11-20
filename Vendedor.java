package controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Entity
@Data 
@NoArgsConstructor 
@AllArgsConstructor

public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String cpf;
    private String nome;
    private String email;
    
}
public class Vendedor_controller {
    @Autowired
    private Vendedorrepository Vendedorrepository;
    private Vendedorservice Vendedorservice;

    @GetMapping
    public List<Vendedor> listarTodos() {
        return Vendedorservice.findAll();
    }

    @PostMapping
    public Vendedor criarVendedor(@RequestBody Vendedor vendedor) {
        return Vendedorservice.save(vendedor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> buscarPorId(@PathVariable Long id) {
        return Vendedorrepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vendedor createVendedor(@RequestBody Vendedor Vendedor) {
        return Vendedorservice.save(Vendedor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVendedor(@PathVariable Long id) {
        if (Vendedorservice.findById(id).isPresent()) {
            Vendedorservice.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
