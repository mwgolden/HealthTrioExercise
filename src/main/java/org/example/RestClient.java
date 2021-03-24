package org.example;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RestClient  {
    private String url;

    public RestClient(String url){
        this.url = url;
    }
    public String get() throws IOException {
        return this.apiGet(this.url);
    }
    public String get(Map<String, String> params )  throws IOException  {
        String request = this.url;
        for(Map.Entry<String, String>e: params.entrySet()){
            request += String.format("&%s=%s",e.getKey(), e.getValue());
        }
        return this.apiGet(request);
    }
    private String apiGet(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(url);
            
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            String responseBody = httpClient.execute(httpget, responseHandler);

            return responseBody;
        }
        finally {
            httpClient.close();
        }
    }
}
