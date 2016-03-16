package server;

import java.util.List;

public class CSVDataReader extends DataReader {
	String csvFilePath;
	List<Person> persons;

	public CSVDataReader(String csvFilePath) {
		this.csvFilePath = csvFilePath;
	}

	public List<Person> getPersons() {
		return persons;
	}

}
