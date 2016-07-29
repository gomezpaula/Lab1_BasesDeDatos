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
public class Undergrad extends Student {
    private int weekHours;

    public Undergrad(String deparment, Date hiringDate, String id, String name) {
        super(deparment, hiringDate, id, name);
    }
    

    public int getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int weekHours) {
        this.weekHours = weekHours;
    }
    @Override
    public float paySalary() {
      if (this.weekHours == 6){
          return (685000/3);
         }else if (this.weekHours ==12){
             return (2*685000/3);
         }else{
      }
    
}
}



      

