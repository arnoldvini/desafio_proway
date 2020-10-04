
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnold Vinicius Fontoura
 */
public class SistemaTest {
    
    public SistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testGerenciarMenu() {
        System.out.println("gerenciarMenu");
        Sistema instance = new Sistema();
        instance.gerenciarMenu();
        
    }

    /**
     * Test of menuDados method, of class Sistema.
     */
    @Test
    public void testMenuDados() {
        System.out.println("menuDados");
        Sistema instance = new Sistema();
        instance.menuDados();
        
    }

    /**
     * Test of solicitarOpcaoMenu method, of class Sistema.
     */
    @Test
    public void testSolicitarOpcaoMenu() {
        System.out.println("solicitarOpcaoMenu");
        Sistema instance = new Sistema();
        int expResult = 0;
        int result = instance.solicitarOpcaoMenu();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of insercao method, of class Sistema.
     */
    @Test
    public void testInsercao() {
        System.out.println("insercao");
        Sistema instance = new Sistema();
        instance.insercao();
        
        
    }

    /**
     * Test of consulta method, of class Sistema.
     */
    @Test
    public void testConsulta() {
        System.out.println("consulta");
        Sistema instance = new Sistema();
        instance.consulta();
        
    }

    /**
     * Test of coordenarMenu method, of class Sistema.
     */
    @Test
    public void testCoordenarMenu() {
        System.out.println("coordenarMenu");
        int opcao = 0;
        Sistema instance = new Sistema();
        instance.coordenarMenu(opcao);
        
    }
    
}
