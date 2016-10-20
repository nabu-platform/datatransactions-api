package be.nabu.libs.datatransactions.api;

import java.net.URI;
import java.util.Date;

public interface DataTransaction<T> {
	/**
	 * The id of the data transaction
	 */
	public String getId();
	/**
	 * The id of the batch it belongs to
	 */
	public String getBatchId();
	/**
	 * Any contextual information about the run
	 */
	public String getContext();
	/**
	 * When the transaction was started
	 */
	public Date getStarted();
	/**
	 * When the transaction was committed
	 */
	public Date getCommitted();
	/**
	 * When the transaction was done
	 */
	public Date getDone();
	/**
	 * The id of provider that generated this transaction
	 * It might be needed to retry the transaction
	 */
	public String getProviderId();
	/**
	 * The properties for this specific data transaction
	 */
	public T getProperties();
	/**
	 * The request for this transaction
	 */
	public URI getRequest();
	/**
	 * The response for this transaction
	 */
	public URI getResponse();
	/**
	 * The state of this transaction
	 */
	public DataTransactionState getState();
	/**
	 * A message explaining the state, mostly used for errors
	 */
	public String getMessage();
	/**
	 * If this is an outgoing transaction, it could have been started by something in another system, this field can contain the id of that origin entity (if any)
	 */
	public String getSourceId();
	/**
	 * The id of the entity that created this transaction (in general the server name)
	 * This is mainly used for recovery purposes
	 */
	public String getCreatorId();
	/**
	 * Each transaction must have a single handler that can be resolved for recovery purposes
	 */
	public String getHandlerId();
	/**
	 * The direction of the data transaction
	 */
	public Direction getDirection();
	/**
	 * The transactionality of this data transaction
	 */
	public Transactionality getTransactionality();
}
