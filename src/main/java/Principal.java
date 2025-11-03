import com.servico.MensagemServicoImpl;
import javax.xml.ws.Endpoint;

public class Principal {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/MensagemServico", new MensagemServicoImpl());
        System.out.println("Servico publicado em http://localhost:8080/MensagemServico?wsdl");
    }
}