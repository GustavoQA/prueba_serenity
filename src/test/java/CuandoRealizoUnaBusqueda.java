import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CuandoRealizoUnaBusqueda {

    @Steps
    UsuarioDogpile lucas;

    @Managed
    WebDriver driver;

    @Test
    public void deberiamos_ver_resultados_relevamtes(){


    }

}
