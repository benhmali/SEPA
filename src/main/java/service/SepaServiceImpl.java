package service;

import java.util.List;
import configuration.ISepaDao;
import configuration.SepaDaoImpl;
import model.Document;

public class SepaServiceImpl implements ISepaService {

	ISepaDao dao;

	public SepaServiceImpl() {
		dao = new SepaDaoImpl();
	}

	@Override
	public int getStats() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Document> getAllSepa() {
		return dao.getAllSepa();
	}

	@Override
	public Document getSepaById(String id) {
		return dao.getSepaById(id);
	}

	@Override
	public Document addSepa(Document sepa) {
		return dao.addSepa(sepa);
	}

}
