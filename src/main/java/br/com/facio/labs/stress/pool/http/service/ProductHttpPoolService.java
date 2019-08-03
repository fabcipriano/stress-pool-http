package br.com.facio.labs.stress.pool.http.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author fabianocp
 */
@Service
@Primary
public class ProductHttpPoolService implements ProductService {

    private static Logger LOG = LoggerFactory.getLogger(ProductHttpPoolService.class);
    
    @Autowired
    private HttpClient client;

    @Override
    public String queryAssets(String id, String target) {
        long start = System.currentTimeMillis();
        String res_xml = null;
        String xmlRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:man=\"http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + "      <man:QueryAssetsRequestMessage>\n"
                + "         <man:documentNumber>" + id + "</man:documentNumber>\n"
                + "         <man:targetCRM>" + target + "</man:targetCRM>\n"
                + "         <man:option>2</man:option>\n"
                + "      </man:QueryAssetsRequestMessage>\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>";
        try (InputStream bytesRequest = new ByteArrayInputStream(xmlRequest.getBytes())){

            // SOAP request send
            HttpPost post = new HttpPost("http://localhost:8666/");
            post.setEntity(new InputStreamEntity(bytesRequest, xmlRequest.length()));
            post.setHeader("Content-type", "text/xml; charset=UTF-8");
            post.setHeader("SOAPAction", "");
            HttpResponse response = client.execute(post);

            res_xml = EntityUtils.toString(response.getEntity());
        } catch (Exception ex) {
            LOG.error("failed to send SOAP REquest", ex);
        } finally {
            long stop = System.currentTimeMillis();
            LOG.info("queryAssets({}, {}). Time spent.: {} ms", id, target, (stop - start));
        }
        return  res_xml;
    }

}
