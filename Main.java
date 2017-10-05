package pro.lecture_2.Yahoo;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String urlStr = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";
        String path = "E:\\JAVA\\Projects\\OOP\\src\\pro\\lecture_2\\Yahoo\\file.xml";
        try {
           String xmlString  = new ReaderURL().readURLToString(urlStr);
           new ConverterXML().createXMLDoc(xmlString,path);
           Query query = new ConverterXML().createQuery(path);
           System.out.println(query.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

