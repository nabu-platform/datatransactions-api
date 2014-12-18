package be.nabu.libs.datatransactions.api;

import java.util.List;

public interface DataTransactionProvider {
	public DataTransactionBatch newBatch(String context, String creatorId, String sourceId, Direction direction, Transactionality transactionality);
	public DataTransaction<?> getTransaction(String transactionId);
	public List<DataTransaction<?>> getBatch(String batchId);
}
