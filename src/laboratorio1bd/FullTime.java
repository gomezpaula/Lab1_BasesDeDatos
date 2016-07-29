/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1bd;

import java.util.Date;

/**
 *
 * @author Labing
 */
public class FullTime extends Professor{
    private float salary;

    public FullTime(Date hiringDate, String id, String name) {
        super(hiringDate, id, name);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public float paySalary() {
        if(this.salary == salary)
       return 1500000;
    
    }
}
