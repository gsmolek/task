package task;

public class ApiImitation {
	/**
	 * simulating an API
	 * @param string
	 * @return API response
	 */
	public static String GET(String string)
	{
		String result = "{\r\n"
				+ "  \"broker-data\": {\r\n"
				+ "      \"id\": \"broker_1\",\r\n"
				+ "      \"name\": \"broker1\"\r\n"
				+ "  },\r\n"
				+ "  \"platform-data\": {\r\n"
				+ "      \"id\": \"platform_1\",\r\n"
				+ "      \"name\": \"platform1\"\r\n"
				+ "  }\r\n"
				+ "}";
		return result;

	}
}
