package ca.cranelks.stocks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PricePuller {
//	public static void main(String[] args) throws IOException, InterruptedException {
//		HttpRequest request = HttpRequest.newBuilder()
//				.uri(URI.create("https://yahoo-finance166.p.rapidapi.com/api/stock/get-price?region=CA&symbol=CNQ"))
//				.header("X-RapidAPI-Host", "yahoo-finance166.p.rapidapi.com")
//				.header("X-RapidAPI-Key", "931056fd50mshb8c305e50694d82p101866jsncb56ac16d088")
//				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
//
//		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//		
//		Price price = new ObjectMapper().readValue(response.body().getBytes(), Price.class);
//		
//		System.out.println(price.getQuoteSummary().getResult().getFirst().getPrice().getRegularMarketPrice().getRaw());
//	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
				String s = "	3.71	," + 
				"	3.78	," + 
				"	3.56	," + 
				"	3.59	," + 
				"	3.59	," + 
				"	495,000	\n" + 
				"	3.35	," + 
				"	3.66	," + 
				"	3.35	," + 
				"	3.65	," + 
				"	3.65	," + 
				"	1,230,400	\n" + 
				"	3.31	," + 
				"	3.34	," + 
				"	3.25	," + 
				"	3.28	," + 
				"	3.28	," + 
				"	295,800	\n" + 
				"	3.22	," + 
				"	3.38	," + 
				"	3.2	," + 
				"	3.31	," + 
				"	3.31	," + 
				"	818,300	\n" + 
				"	3.12	," + 
				"	3.21	," + 
				"	3.09	," + 
				"	3.15	," + 
				"	3.15	," + 
				"	386,800	\n" + 
				"	3.24	," + 
				"	3.24	," + 
				"	3.11	," + 
				"	3.11	," + 
				"	3.11	," + 
				"	648,200	\n" + 
				"	3.32	," + 
				"	3.36	," + 
				"	3.2	," + 
				"	3.27	," + 
				"	3.27	," + 
				"	451,200	\n" + 
				"	3.31	," + 
				"	3.43	," + 
				"	3.19	," + 
				"	3.21	," + 
				"	3.21	," + 
				"	489,900	\n" + 
				"	3.25	," + 
				"	3.35	," + 
				"	3.22	," + 
				"	3.31	," + 
				"	3.31	," + 
				"	337,000	\n" + 
				"	3.25	," + 
				"	3.28	," + 
				"	3.1	," + 
				"	3.22	," + 
				"	3.22	," + 
				"	325,700	\n" + 
				"	3.39	," + 
				"	3.43	," + 
				"	3.2	," + 
				"	3.24	," + 
				"	3.24	," + 
				"	371,000	\n" + 
				"	3.23	," + 
				"	3.41	," + 
				"	3.22	," + 
				"	3.35	," + 
				"	3.35	," + 
				"	794,100	\n" + 
				"	3.29	," + 
				"	3.42	," + 
				"	3.15	," + 
				"	3.17	," + 
				"	3.17	," + 
				"	669,200	\n" + 
				"	2.96	," + 
				"	3.03	," + 
				"	2.87	," + 
				"	3.03	," + 
				"	3.03	," + 
				"	497,400	\n" + 
				"	3.06	," + 
				"	3.12	," + 
				"	2.95	," + 
				"	2.95	," + 
				"	2.95	," + 
				"	467,700	\n" + 
				"	3.1	," + 
				"	3.13	," + 
				"	2.99	," + 
				"	3.05	," + 
				"	3.05	," + 
				"	200,100	\n" + 
				"	3.18	," + 
				"	3.22	," + 
				"	3.12	," + 
				"	3.12	," + 
				"	3.12	," + 
				"	159,900	\n" + 
				"	3.06	," + 
				"	3.29	," + 
				"	3.06	," + 
				"	3.18	," + 
				"	3.18	," + 
				"	276,300	\n" + 
				"	3.28	," + 
				"	3.28	," + 
				"	3.04	," + 
				"	3.06	," + 
				"	3.06	," + 
				"	440,100	\n" + 
				"	3.58	," + 
				"	3.58	," + 
				"	3.26	," + 
				"	3.32	," + 
				"	3.32	," + 
				"	883,100	\n" + 
				"	3.46	," + 
				"	3.56	," + 
				"	3.43	," + 
				"	3.51	," + 
				"	3.51	," + 
				"	317,500	\n" + 
				"	3.53	," + 
				"	3.54	," + 
				"	3.36	," + 
				"	3.42	," + 
				"	3.42	," + 
				"	557,100	\n" + 
				"	3.67	," + 
				"	3.68	," + 
				"	3.55	," + 
				"	3.58	," + 
				"	3.58	," + 
				"	272,700	\n" + 
				"	3.74	," + 
				"	3.76	," + 
				"	3.63	," + 
				"	3.73	," + 
				"	3.73	," + 
				"	243,800	\n" + 
				"	3.66	," + 
				"	3.84	," + 
				"	3.63	," + 
				"	3.68	," + 
				"	3.68	," + 
				"	517,300	\n" + 
				"	3.8	," + 
				"	3.86	," + 
				"	3.58	," + 
				"	3.62	," + 
				"	3.62	," + 
				"	427,800	\n" ;
		
				
				System.out.println(s.replaceAll("\\\\t", ""));
				
		//		WebDriver driver = new ChromeDriver();
		
//		driver.get(null);
	}

}
