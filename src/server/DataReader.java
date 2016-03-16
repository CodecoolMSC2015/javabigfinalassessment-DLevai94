package server;

import java.util.HashSet;
import java.util.Set;

import person.Person;

public abstract class DataReader {
	String searchCriteria;
	SearchType searchType;

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}

	public Set<Person> getPersons() {
		Set<Person> persons = new HashSet<>();
		return persons;
	}

}
