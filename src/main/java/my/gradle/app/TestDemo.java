//package my.gradle.app;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//class Employee {
//
//	String name;
//	int salary;
//
//	Employee(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder("<");
//		sb.append("name: ");
//		sb.append(name);
//		sb.append(" salary: ");
//		sb.append("" + salary + ">");
//		return sb.toString();
//
//	}
//}
//
//class SortByName implements Comparator<Employee> {
//	@Override
//	public int compare(Employee e1, Employee e2) {
//		System.out.println("SortByName");
//		return e1.getName().compareTo(e2.getName());
//	}
//}
//
//class SortBySalary implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee e1, Employee e2) {
//		System.out.println("SortBySalary");
//		return e1.salary - e2.salary;
//	}
//}
//
//class EmployeeInfo {
//	enum SortMethod {
//		BYNAME, BYSALARY;
//	};
//
//	public List<Employee> sort(List<Employee> emps, final SortMethod method) {
//
//		if (method == SortMethod.BYSALARY)
//			Collections.sort(emps, new SortBySalary());
//		else /* if (method == SortMethod.BYNAME) */
//			Collections.sort(emps, new SortByName());
//		return emps;
//	}
//
//	public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
//		Stream<Employee> emp = entities.stream().filter(e -> e.getName().charAt(0) == character.charAt(0));
//		List<Employee> empList = emp.collect(Collectors.toList());
//		if (!(empList.isEmpty()))
//			return true;
//		return false;
//	}
//}
//
//public class TestDemo {
//	public static void main(String[] args) {
//		EmployeeInfo ei = new EmployeeInfo();
//		List<Employee> emps = new ArrayList<>();
//		emps.add(new Employee("Mickey", 100000));
//		emps.add(new Employee("Timmy", 50000));
//		emps.add(new Employee("Annny", 40000));
//		System.out.println("Original " + emps);
//		List<Employee> out = ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
//		List<Employee> output = ei.sort(out, EmployeeInfo.SortMethod.BYSALARY);
//		System.out.println("By name " + out);
//		System.out.println("By Salary " + output);
//		ei.isCharacterPresentInAllNames(emps, "A");
//		boolean characterPresent = ei.isCharacterPresentInAllNames(emps, "A");
//		if (characterPresent)
//			System.out.println(true);
//		else
//			System.out.println(false);
//	}
//
//}