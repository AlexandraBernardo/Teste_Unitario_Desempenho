@InjectMocks
@Mock
public class ProdutoServiceTest {
   @ExtendWith(MockitoExtension.class) 
   
   @Test
void buscarPorId_DeveRetornarProduto() {
    // 1. Arrange (Preparação)
    Produto produto = new Produto(1L, "Livro", 50.0, 10);

    // Simular o comportamento do Repository [cite: 19]
    Mockito.when(repository.findById(1L)).thenReturn(Optional.of(produto));

    // 2. Act (Ação) - Chamar o método do Service
    Produto resultado = service.buscarPorId(1L);

    // 3. Assert (Verificação)
    Assertions.assertNotNull(resultado);
    Assertions.assertEquals("Livro", resultado.getNome());

    // Verificar se o método findById foi chamado no Repository [cite: 19]
    Mockito.verify(repository, Mockito.times(1)).findById(1L);
}
}
