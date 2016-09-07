package addTask;

/**
 * Created by user on 07.09.2016.
 */
public class WorkerFixedSalary extends Worker {

    int salaryOfMonth;
    int workingHours;
    int coefficient;
    int workingDaysOfMonth;


    public WorkerFixedSalary(int id, String firstName, String lastName, String position, int salaryOfMonth, int workingHours, int coefficient, int workingDaysOfMonth) {
        super(id, firstName, lastName, position);
        this.salaryOfMonth = salaryOfMonth;
        this.workingHours = workingHours;
        this.coefficient = coefficient;
        this.workingDaysOfMonth = workingDaysOfMonth;
    }

    @Override
    public void avrSalaryWorkers() {



    }
}
