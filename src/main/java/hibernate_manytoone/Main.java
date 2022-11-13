package hibernate_manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("umsgs");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        
        Employee e=new Employee();
        e.setName("sasi");
        e.setEmail("sasi@gmail.com");
        e.setAddress("usilampatti");
        
        Office office=new Office();
        office.setName("UMSGS");
        office.setAddress("madura");
        
        office.setE(e);

        Office office1=new Office();
        office1.setName("SGS");
        office1.setAddress("Usilapatti");
        
        office1.setE(e);
        
        et.begin();
        em.persist(e);
        em.persist(office);
        em.persist(office1);
        et.commit();
       

	}

}
