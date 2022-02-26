package task;
import entity.Broker;

/**
 * 
 * @author MOLEK
 * An Interface that specifies the behavior of the application 
 *
 */
public interface StatusProcessor {
	
	public Object[] getFromFile(String path) throws Exception;
	
	public Broker getFromURL(String request) throws Exception;
	
}
