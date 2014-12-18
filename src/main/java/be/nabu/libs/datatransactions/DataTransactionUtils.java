package be.nabu.libs.datatransactions;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DataTransactionUtils {
	public static final String CREATOR_ID = "be.nabu.libs.datatransactions.creatorId";
	
	public static String generateCreatorId() {
		String id = System.getProperty(CREATOR_ID);
		if (id == null) {
			try {
				id = InetAddress.getLocalHost().getHostName();
			}
			catch (UnknownHostException e) {
				throw new RuntimeException("Can not generate creator id", e);
			}
		}
		return id;
	}
}
