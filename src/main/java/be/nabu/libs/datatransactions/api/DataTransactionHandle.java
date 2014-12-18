package be.nabu.libs.datatransactions.api;

import java.io.IOException;
import java.net.URI;

public interface DataTransactionHandle {
	public DataTransaction<?> getTransaction();
	public void commit(URI response) throws IOException;
	public void done() throws IOException;
	public void fail(String message) throws IOException;
}
