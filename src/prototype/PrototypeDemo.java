package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord(1,"Lam");
        System.out.printf(employeeRecord.toString());
        EmployeeRecord employeeRecord1 = (EmployeeRecord) employeeRecord.getClone();
        System.out.printf(employeeRecord1.toString());
    }
}
