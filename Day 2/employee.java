public class employee {
    String name;
    class pEmployee extends  employee{
        void calculateSalary(double salary){
            double bonous = salary * 0.5;
            double totalSalary = salary+bonous;
            System.out.println("Permanent EMP Salary: "+totalSalary);
        }
    }
    class cEmployee extends  employee{
        void calculateSalary(double salary){
            double bonous = salary * 0.2;
            double totalSalary = salary+bonous;
            System.out.println("Temporary EMP Salary: "+totalSalary);
        }
    }
    public static void main(String[] args) {
        employee e = new employee();
        pEmployee pe = e.new pEmployee();
        cEmployee ce = e.new cEmployee();
        pe.name = "Jeysri";
        ce.name = "kai";
        System.out.println(pe.name);
        pe.calculateSalary(10000);
        System.out.println(ce.name);
        ce.calculateSalary(10000);
    }
    
}
