package service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Produtorepository;

@Service
public class Vendedorservice {
    @Autowired
    private Vendedorrepository vendedorrepository;
    public List<Vendedor> findAll() {
        return vendedorrepository.findAll();
    }
    public Vendedor save(Vendedor vendedor) {
        return vendedorrepository.save(vendedor);
    }
    public Optional<Vendedor> findById(Long id) {
        return vendedorrepository.findById(id);
    }
    public void deleteById(Long id) {
        vendedorrepository.deleteById(id);
    }
    
    
}
