package server;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import person.Person;

public class CSVDataReader extends DataReader {
	String csvFilePath;
	List<Person> persons;

	public CSVDataReader(String csvFilePath) {
		this.csvFilePath = csvFilePath;
	}

	public Set<Person> getPersons() {
		Set<Person> persons = new HashSet<>();
		return persons;
	}

}
