package configuration;

import java.util.List;

import javax.persistence.Query;

import model.Document;
import service.EntityManagerConnectionService;

public class SepaDaoImpl implements ISepaDao {

	public SepaDaoImpl() {
		EntityManagerConnectionService.getInstance();
	}

	@Override
	public int getStats() {
		return getAllSepa().size();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<model.Document> getAllSepa() {
		EntityManagerConnectionService.getInstance().getTransaction().begin();
		Query query = EntityManagerConnectionService.getInstance().createQuery("select s from Document s");
		EntityManagerConnectionService.getInstance().getTransaction().commit();
		return query.getResultList();
	}

	@Override
	public model.Document getSepaById(String id) {
		EntityManagerConnectionService.getInstance().getTransaction().begin();
		Document sepa = EntityManagerConnectionService.getInstance().find(Document.class, id);
		EntityManagerConnectionService.getInstance().getTransaction().commit();
		return sepa;
	}

	@Override
	public Document addSepa(model.Document sepa) {
		try {
			EntityManagerConnectionService.getInstance().getTransaction().begin();
			EntityManagerConnectionService.getInstance().persist(sepa);
			EntityManagerConnectionService.getInstance().flush();
			EntityManagerConnectionService.getInstance().getTransaction().commit();
			return sepa;
		} catch (Exception e) {
			EntityManagerConnectionService.getInstance().getTransaction().rollback();
			return null;
		}

	}

}
