package task;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import entity.Broker;
import entity.Response;
import java.io.FileReader;
import java.io.IOException;

public class BrokerStatusProcessor implements StatusProcessor{
	
	private JsonReader reader = null;
	
	/**
	 * Extracts brokers information from a JSON file
	 * @param Path of the JSON file. 
	 * @return Array of Brokers
	 * @throws IOException
	 */
	@Override
	public Broker[] getFromFile(String path) throws IOException {
			reader = new JsonReader(new FileReader(path));
	        Broker[] broker = new Gson().fromJson(reader, Broker[].class);
	        reader.close();
	        return broker;
	}
	/**
	 * Extracts a broker information from an API response
	 * @param API Request
	 * @return Broker information 
	 * @throws JsonSyntaxException 
	 */
	@Override
	public Broker getFromURL(String request) throws JsonSyntaxException {
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject data = parser.parse(ApiImitation.GET(request)).getAsJsonObject();
		Response brokerData = gson.fromJson(data.get("broker-data"), Response.class);
		Response platformData = gson.fromJson(data.get("platform-data"), Response.class);
		Broker broker = new Broker(brokerData.getId(), platformData.getId(), brokerData.getName(), platformData.getName());
		return broker;
	}
	
	
}
