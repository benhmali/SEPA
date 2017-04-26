package configuration;

import java.util.List;
import model.Document;

public interface ISepaDao {
	
	public int getStats();
	
	public List<Document> getAllSepa();
	
	public Document getSepaById(String id);
	
	public Document addSepa(Document sepa);
}
