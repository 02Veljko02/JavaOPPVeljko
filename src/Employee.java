public class Employee extends Person {
    private int employeeId;
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

  public Employee(){

  }
    public Employee(int employeeId){
        super(50);
        setEmployeeId(employeeId);
        System.out.println("Employee");
    }

    @Override
    public void govor() {
        System.out.println("Zaposleni govori sta mu sef kaze");;
    }
}
