package service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Produtorepository;

@Service

public class Produtoservice {
    
    @Autowired
    private Produtorepository produtorepository;
    public List<Produto> findAll() {
        return Produtorepository.findAll();
    }

    public static Produto save(Produto produto) {
        return Produtorepository.save(produto);
    }

    public static Optional<Object> findById(Long id) {
        return Produtorepository.findById(id);
    }

    public static void deleteById(Long id) {
        Produtorepository.deleteById(id);
    }
}

