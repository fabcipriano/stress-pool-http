package br.com.facio.labs.stress.pool.http.service;

import br.com.facio.labs.stress.pool.http.models.QueryAssetsRequestMessage;
import br.com.facio.labs.stress.pool.http.models.QueryAssetsResponseMessage;
import br.com.facio.labs.stress.pool.http.utils.XMLUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 *
 * @author fabianocp
 */
@Service
public class ProductSOAService extends WebServiceGatewaySupport implements ProductService {
    private static Logger LOG = LoggerFactory.getLogger(ProductSOAService.class);
    
    @Override
    public void queryAssets(String id, String target) {
        QueryAssetsRequestMessage request = new QueryAssetsRequestMessage();
        request.setDocumentNumber(id);
        request.setTargetCRM(target);
        request.setOption("2");

        LOG.info("Requesting queryAssets with params: {}", "teste", "abc");

        QueryAssetsResponseMessage response = (QueryAssetsResponseMessage) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8666/", request, new SoapActionCallback(
                        "http://www.algartelecom.com.br/SOA/Service/ManageProductInformationAppMobileReqCS/queryAssets"));

        LOG.info("Response for queryAssets with: [{}]", XMLUtil.toXml(response));
    }
}
