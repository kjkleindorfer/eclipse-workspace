package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListPet;

public class ListPetHelper {
	static EntityManagerFactory	emfactory = Persistence.createEntityManagerFactory("ConsolePet");
	
	public void insertItem(ListPet	li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ListPet> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<ListPet> allPets = em.createQuery("SELECT i FROM ListPet i").getResultList();
		return	allPets;
		}
	
	public void deleteItem(ListPet toDelete)	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListPet>typedQuery = em.createQuery("select li from ListPet li where li.name = :selectedPet and li.owner = :selectedOwner", ListPet.class);
		//Substitute	parameter	with	actual	data	from	the	toDelete	item
		typedQuery.setParameter("selectedName", toDelete.getName());
		typedQuery.setParameter("selectedOwner",	toDelete.getOwner());
		//we	only	want	one	result
		typedQuery.setMaxResults(1);
		//get	the	result	and	save	it	into	a	new	list	item
		ListPet result = typedQuery.getSingleResult();
		//remove	it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ListPet> searchForItemByPetName(String	ownerName)	{
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListPet>	typedQuery	=	em.createQuery("select li from ListPet li where li.name = :selectedName and li.owner = :selectedOwner", ListPet.class);
		typedQuery.setParameter("selectedName",	ownerName);
		List<ListPet>	foundItems	=	typedQuery.getResultList();
		em.close();
		return	foundItems;
	}
	
	public List<ListPet> searchForItemByOwnerName(String ownerName)	{
		EntityManager em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListPet>	typedQuery	=	em.createQuery("select li from ListPet li where li.name = :selectedName and li.owner = :selectedOwner",	ListPet.class);
		typedQuery.setParameter("selectedOwner",	ownerName);
		List<ListPet>	foundItems	=	typedQuery.getResultList();
		em.close();
		return	foundItems;
	}
	
	public ListPet searchForItemByType(String	typeToEdit)	{
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		ListPet	found	=	em.find(ListPet.class,	typeToEdit);
		em.close();
		return	found;
	}
	
	public void updateItem(ListPet	toEdit)	{
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	
	public void cleanUp(){
		emfactory.close();
	}
}
