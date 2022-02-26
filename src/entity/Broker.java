package entity;
/**
 * 
 * @author MOLEK
 * Broker entity
 */
public class Broker {
	private String broker_id = null;
	private String platform_id = null;
	private String broker_name = null;
	private String platform_name = null;
	
	public Broker(String broker_id, String platform_id, String broker_name, String platform_name) {
		this.broker_id = broker_id;
		this.platform_id = platform_id;
		this.broker_name = broker_name;
		this.platform_name = platform_name;
	}
	
	public String getBroker_id() {
		return broker_id;
	}
	public String getPlatform_id() {
		return platform_id;
	}
	public String getBroker_name() {
		return broker_name;
	}
	public String getPlatform_name() {
		return platform_name;
	}

	@Override
	public String toString() {
		return "Broker [broker_id=" + broker_id + ", platform_id=" + platform_id + ", broker_name=" + broker_name
				+ ", platform_name=" + platform_name + "]";
	}
	
}
