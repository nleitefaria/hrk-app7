package com.example.application.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.application.entity.Customer;
import com.example.application.enu.CustomerStatus;
import com.example.application.repository.CustomerRepository;

@Service
public class CustomerService {
	
	
	private static final Logger LOGGER = Logger.getLogger(CustomerService.class.getName());
	private CustomerRepository customerRepository;

	private final HashMap<Long, Customer> contacts = new HashMap<>();
	private long nextId = 0;

	public CustomerService(CustomerRepository customerRepository) {	
		this.customerRepository = customerRepository;
	}


	/**
	 * @return all available Customer objects.
	 */
	public synchronized List<Customer> findAll() {
		return customerRepository.findAll();
	}

	/**
	 * Finds all Customer's that match given filter.
	 *
	 * @param stringFilter
	 *            filter that returned objects should match or null/empty string
	 *            if all objects should be returned.
	 * @return list a Customer objects
	 */
	
	public synchronized List<Customer> findAll(String stringFilter)
	{		
		if(stringFilter.length() == 0)
		{
			return this.findAll();
			
		}
		else
		{
			return customerRepository.findByFirstName(stringFilter);			
		}
	}
	

	/**
	 * Finds all Customer's that match given filter and limits the resultset.
	 *
	 * @param stringFilter
	 *            filter that returned objects should match or null/empty string
	 *            if all objects should be returned.
	 * @param start
	 *            the index of first result
	 * @param maxresults
	 *            maximum result count
	 * @return list a Customer objects
	 */
	/*
	public synchronized List<Customer> findAll(String stringFilter, int start, int maxresults) {
		ArrayList<Customer> arrayList = new ArrayList<>();
		for (Customer contact : contacts.values()) {
			try {
				boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
						|| contact.toString().toLowerCase().contains(stringFilter.toLowerCase());
				if (passesFilter) {
					arrayList.add(contact.clone());
				}
			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		Collections.sort(arrayList, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return (int) (o2.getId() - o1.getId());
			}
		});
		int end = start + maxresults;
		if (end > arrayList.size()) {
			end = arrayList.size();
		}
		return arrayList.subList(start, end);
	}
	*/

	/**
	 * @return the amount of all customers in the system
	 */
	public synchronized long count() {
		return contacts.size();
	}

	/**
	 * Deletes a customer from a system
	 *
	 * @param value
	 *            the Customer to be deleted
	 */
	public synchronized void delete(Customer value) {
		contacts.remove(value.getId());
	}

	/**
	 * Persists or updates customer in the system. Also assigns an identifier
	 * for new Customer instances.
	 *
	 * @param entry
	 */
	/*
	public synchronized void save(Customer entry) {
		if (entry == null) {
			LOGGER.log(Level.SEVERE,
					"Customer is null. Are you sure you have connected your form to the application as described in tutorial chapter 7?");
			return;
		}
		if (entry.getId() == null) {
			entry.setId(nextId++);
		}
		try {
			entry = (Customer) entry.clone();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		contacts.put(entry.getId(), entry);
	}
	*/

	/**
	 * Sample data generation
	 */
	/*
	public void ensureTestData() {
		if (findAll().isEmpty()) {
			final String[] names = new String[] { "Gabrielle Patel", "Brian Robinson", "Eduardo Haugen",
					"Koen Johansen", "Alejandro Macdonald", "Angel Karlsson", "Yahir Gustavsson", "Haiden Svensson",
					"Emily Stewart", "Corinne Davis", "Ryann Davis", "Yurem Jackson", "Kelly Gustavsson",
					"Eileen Walker", "Katelyn Martin", "Israel Carlsson", "Quinn Hansson", "Makena Smith",
					"Danielle Watson", "Leland Harris", "Gunner Karlsen", "Jamar Olsson", "Lara Martin",
					"Ann Andersson", "Remington Andersson", "Rene Carlsson", "Elvis Olsen", "Solomon Olsen",
					"Jaydan Jackson", "Bernard Nilsen" };
			Random r = new Random(0);
			for (String name : names) {
				String[] split = name.split(" ");
				Customer c = new Customer();
				c.setFirstName(split[0]);
				c.setLastName(split[1]);
				c.setStatus(CustomerStatus.values()[r.nextInt(CustomerStatus.values().length)]);
				c.setBirthDate(LocalDate.now().minusDays(r.nextInt(365*100)));
				save(c);
			}
		}
	}
	*/
	
	@PostConstruct 
	public void populateTestData() {
		
		if (customerRepository.count() == 0) {
			//TODO FINISH THIS
			
			final String[] names = new String[] { "Gabrielle Patel", "Brian Robinson", "Eduardo Haugen",
					"Koen Johansen", "Alejandro Macdonald", "Angel Karlsson", "Yahir Gustavsson", "Haiden Svensson",
					"Emily Stewart", "Corinne Davis", "Ryann Davis", "Yurem Jackson", "Kelly Gustavsson",
					"Eileen Walker", "Katelyn Martin", "Israel Carlsson", "Quinn Hansson", "Makena Smith",
					"Danielle Watson", "Leland Harris", "Gunner Karlsen", "Jamar Olsson", "Lara Martin",
					"Ann Andersson", "Remington Andersson", "Rene Carlsson", "Elvis Olsen", "Solomon Olsen",
					"Jaydan Jackson", "Bernard Nilsen" };
			Random r = new Random(0);
			for (String name : names) {
				String[] split = name.split(" ");
				Customer c = new Customer();
				c.setFirstName(split[0]);
				c.setLastName(split[1]);
				c.setStatus(CustomerStatus.values()[r.nextInt(CustomerStatus.values().length)]);
				c.setBirthDate(LocalDate.now().minusDays(r.nextInt(365*100)));
				customerRepository.save(c);
			
			
			}
		}
	}
}
