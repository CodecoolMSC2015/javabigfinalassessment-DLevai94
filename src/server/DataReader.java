package server;

import java.util.HashSet;
import java.util.Set;

public class DataReader {
	String searchCriteria;
	SearchType searchType;

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}

	public Set<Person> getPersons(String searchCriteria, SearchType searchType){
		Set<Person> persons = new HashSet<>();
		return persons;
	}

}
