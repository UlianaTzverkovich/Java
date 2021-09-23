package ThirteenLesson;

import ThirteenLesson.listener.IListener;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    private static final String WIKIURL = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Запрос поиска:");
        String searchQuery = in.next();
        if (searchQuery == null) {
            throw new Error("Введен пустой запрос");
        }

        String uri = WIKIURL + URLEncoder.encode(searchQuery.trim(), StandardCharsets.UTF_8);
        sendAsyncRequest(uri, WikiDTO.class, new WikiListener());
    }


    private static <L> void sendAsyncRequest(final String uri, Class<L> dtoClass, IListener<L> httpListener) {
        new Thread("request-sender") {
            @Override
            public void run() {
                try {
                    L object;
                    ObjectMapper mapper = new ObjectMapper();
                    try (CloseableHttpClient client = HttpClients.createDefault()) {
                        HttpGet request = new HttpGet(uri);
                        request.setConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build());
                        object = client.execute(request, httpResponse -> mapper.readValue(httpResponse.getEntity().getContent(), dtoClass));
                    }
                    httpListener.onSuccess(object);
                } catch (Exception exp) {
                    httpListener.onFailure();
                }
            }
        }.start();
    }
}
