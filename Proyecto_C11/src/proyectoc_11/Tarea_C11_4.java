package proyectoc_11;

import java.util.List;
import java.util.ArrayList;

public class Tarea_C11_4 {
	public static void main(String[] args) {
		List<String> persons = new ArrayList<String>();

		String[] employee = { "Alex", "Thomas", "Bob", "Yohan" };

		for (int i = 0; i < employee.length; i++) {
			persons.add(employee[i]);
		}

		System.out.println(persons);
	}
}
