package task;
import java.io.IOException;

import entity.Broker;

public class Main {

	public static void main(String[] args) {
		try {
			
			BrokerStatusProcessor brokerStatusProcessor = new BrokerStatusProcessor();
			
			//path to the JSON file
			String filePath = "src/task/home_task_brokers_input.json";
			
			//First task : The method returns a list of two brokers from the JSON file
			Broker[] brokersArray = brokerStatusProcessor.getFromFile(filePath);
			
			//Second task : The method returns the broker data from API response
			String request = "GET api.com/platforms/platform_1/broker_1";//The API Request
			Broker brokerApi = brokerStatusProcessor.getFromURL(request);
			
			System.out.println("Brokers Array from a json file:\n");
			for(Broker broker : brokersArray)
			{
				System.out.println("	"+broker);
			}
			System.out.println("\nBroker from API request:\n\n" +"	" + brokerApi +"\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
