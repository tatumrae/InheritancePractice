package inheritancepractice;

/**
 *
 * @author Tatum Thomas
 */
public class Teacher extends Person{
    private String schoolWhereTeaching;
    private int monthsTeachingAtCurrentSchool;
    
    public void teachClass() {
        System.out.println("Teacher is teaching a class now.");
    }
}
