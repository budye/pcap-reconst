/*
 * Author(s): Manoj Bharadwaj, Chris Neasbitt
 */

package pcap.reconst.beans;

public class DecodedData extends InputData {
	public DecodedData(byte[] data, Headers headers, TimestampPair ts) {
		super(data, headers, ts);
	}

	public DecodedData(InputData response) {
		super(response.getData(), response.getHeaders(), response
				.getTimestamps());
	}
}