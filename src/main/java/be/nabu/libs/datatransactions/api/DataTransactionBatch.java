package be.nabu.libs.datatransactions.api;

import java.io.IOException;
import java.net.URI;

public interface DataTransactionBatch<T> {
	public <P> DataTransactionHandle start(T provider, P properties, URI request) throws IOException;
	public String getId();
}