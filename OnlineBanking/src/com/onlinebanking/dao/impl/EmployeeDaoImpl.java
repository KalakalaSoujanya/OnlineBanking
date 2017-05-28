package com.onlinebanking.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.onlinebanking.dao.EmployeeDao;
import com.onlinebanking.dao.CustomerDao;
import com.onlinebanking.entity.Employee;
import com.onlinebanking.entity.Customer;

@Repository
public class EmployeeDaoImpl extends DaoImpl implements EmployeeDao
{	

	@Override
	public Employee findAgentByUsername(String username){
		Session session= sessionFactory.openSession();
		Query qry = session.createQuery("from Employee e where e.emailId='"+username+"'");
		Employee agent = (Employee)qry.getResultList().get(0);
		session.close();			
		return agent;
	}		
@Override
public List<Employee> findAllEmployee(){
	Session session=sessionFactory.openSession();
	Query qry=session.createQuery("from Employee");
	List<Employee> employee=(List<Employee>)qry.getResultList();
	session.close();
	return employee;
} 
public void addingEmployees(Employee employee){
	Session session=sessionFactory.openSession();
	Transaction t=session.beginTransaction();
	session.save(employee);
	t.commit();
	session.close();
	
}
public Employee editingEmployees(int bankId){
	Session session=sessionFactory.openSession();
	Query qry=session.createQuery("from Employee e where e.bankId="+bankId);
	Employee employee=(Employee)qry.getResultList().get(0);
session.close();
return employee;
}
public void updatingEmployees(Employee employee){
	
	Session session=sessionFactory.openSession();
	Transaction t= session.beginTransaction();
    session.update(employee);
	t.commit();
	session.close();
}
public void deletingEmployees(int bankId){
	
	Session session=sessionFactory.openSession();
	Transaction t = session.beginTransaction();
	Query qry= session.createQuery("delete from Employee e where e.bankId="+bankId);
	qry.executeUpdate();
	session.close();

}
public List<Employee> searchingEmployees(String search){
	Session session=sessionFactory.openSession();
Query qry=session.createQuery("from Employee e where upper(e.firstName) like'%"+search.toUpperCase()+"%'");
List<Employee> employees = (List<Employee>)qry.getResultList();
session.close();
return employees;
}
}