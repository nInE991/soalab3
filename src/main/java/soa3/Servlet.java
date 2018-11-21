package soa3;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
@WebServlet("/servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {

            URL url = new URL("http://www.nbkr.kg/XML/daily.xml");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.addRequestProperty("User-Agent", "Mozilla/4.76");
            InputStream is = http.getInputStream();
//           File file = new File("simple.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CurrencyRates.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            CurrencyRates currencyRates = (CurrencyRates) jaxbUnmarshaller.unmarshal(is);
            req.setAttribute("date", currencyRates.getDate());
            req.setAttribute("currencyList", currencyRates.getCurrencyList());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
