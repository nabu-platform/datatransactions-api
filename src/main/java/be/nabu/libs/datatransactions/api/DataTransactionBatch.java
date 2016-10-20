package be.nabu.libs.datatransactions.api;

import java.io.IOException;
import java.net.URI;

public interface DataTransactionBatch<T> {
	/**
	 * The reason that the provider is an object instead of a string is because the provider implementation itself usually doesn't know its name
	 * Meaning, it starts a transaction but doesn't know how the outside world refers to him
	 * For this reason the data batch itself is usually created with a resolver that can transform it to an id
	 */
	public <P> DataTransactionHandle start(T provider, P properties, URI request) throws IOException;
	public String getId();
}