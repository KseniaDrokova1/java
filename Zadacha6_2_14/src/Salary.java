public class Salary extends MailMessage {
    private Integer salary;
    Salary (String from, String to, Integer salary) {
        super(from, to, null);
        this.salary = salary;
    }
    public Integer getSalary() { return salary; }
    @Override
    public <T> T getValue() { return (T)this.getSalary(); }
}
