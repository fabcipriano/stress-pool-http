package br.com.facio.labs.stress.pool.http.utils;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class XMLUtil {
    private static Logger LOG = LoggerFactory.getLogger(XMLUtil.class);

    private XMLUtil() {

    }

    public static String toXml(Object object) {

        String xml = "";

        try {

            StringWriter stringWriter = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            JAXBIntrospector introspector = context.createJAXBIntrospector();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
            if (null == introspector.getElementName(object)) {
                JAXBElement rootElement = new JAXBElement(new QName("Root"), Object.class, object);
                marshaller.marshal(rootElement, stringWriter);
            } else {
                marshaller.marshal(object, stringWriter);
            }

            xml = stringWriter.toString();

        } catch (JAXBException e) {

            LOG.error("Exception ocurred: ", e);
        }

        return xml;

    }
}
