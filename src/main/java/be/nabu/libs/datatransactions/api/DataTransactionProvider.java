package be.nabu.libs.datatransactions.api;

import java.util.Date;
import java.util.List;

public interface DataTransactionProvider {
	/**
	 * Starts a new batch with some parameters
	 * All transactions that happen in the same batch should be fetchable with getBatch()
	 */
	public <T> DataTransactionBatch<T> newBatch(ProviderResolver<T> providerResolver, String context, String creatorId, String sourceId, Direction direction, Transactionality transactionality);
	/**
	 * Gets a specific transaction by id
	 */
	public DataTransaction<?> getTransaction(String transactionId);
	/**
	 * Gets a batch of transactions by the batch id
	 */
	public List<DataTransaction<?>> getBatch(String batchId);
	/**
	 * Retrieves the _possibly_ pending transactions
	 * For three phase transactions all transactions are guaranteed to be pending.
	 * For both two phase and one phase transactions it is possible that already finished transactions are sent back.
	 * The "from" date you enter will limit how far back these false matches can go.
	 * It is imperative that you do further checking on all transactions -except three phase- that they are _actually_ pending.
	 * Note that the "from" timestamp is only used for transactions of dubious state. 
	 * If you have a pending three phase transaction before the "from" timestamp, it will still be returned. 
	 */
	public List<DataTransaction<?>> getPendingTransactions(String creatorId, Date from);
	/**
	 * Get a handle on a transaction
	 */
	public DataTransactionHandle getHandle(String transactionId);
}
