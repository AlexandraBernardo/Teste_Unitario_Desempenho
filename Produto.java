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

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String nome;
    private Double preco;
    private Integer estoque;
}
public class Produto_controller {
    @Autowired
    private Produtorepository Produtorepository;
    private service Produtoservice;

    @GetMapping
    public List<Produto> listarTodos() {
        return Produtorepository.findAll();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return Produtorepository.save(produto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return Produtorepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return Produtoservice.save(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable Long id) {
        if (Produtoservice.findById(id).isPresent()) {
            Produtoservice.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
