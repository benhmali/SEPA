package service;

import java.util.List;

import model.Document;

public interface ISepaService {

	public int getStats();

	public List<Document> getAllSepa();

	public Document getSepaById(String id);

	public Document addSepa(Document sepa);

}
