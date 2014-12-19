package be.nabu.libs.datatransactions.api;

public interface ProviderResolver<T> {
	public String getId(T provider);
	public T getProvider(String id);
}
