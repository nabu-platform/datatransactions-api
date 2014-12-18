package be.nabu.libs.datatransactions.api;

import java.io.IOException;
import java.net.URI;

public interface DataTransactionBatch {
	public <T> DataTransactionHandle start(String providerId, T properties, URI request) throws IOException;
	public String getId();
}