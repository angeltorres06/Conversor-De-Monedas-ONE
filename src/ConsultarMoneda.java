import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget, double cantidad) {

        String clave = "b09aaf580ca32c7b9daf785e";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + clave + "/pair/" + monedaBase +
                "/" + monedaTarget + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("Hemos tenido un error buscando la moneda... :(");
        }
    }
}
