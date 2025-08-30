/**
 * @description TODO
 * @author: hatranthienan-24678261
 * @version: 1.0
 * @created:30 thg 8, 202510:53:36 






/**
 * 
 */
package iuh.oop.se;

/**
 * 
 */
public class Course {
	private String id;           // chỉ chứa chữ cái hoặc ký tự số, dài ít nhất 3
    private String title;        // không để trống
    private int credit;          // > 0
    private String department;   // tên khoa phụ trách

    public Course() {}

    public Course(String id, String title, int credit, String department) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }

    // Getter
    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getCredit() { return credit; }
    public String getDepartment() { return department; }

    // Setter
    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCredit(int credit) { this.credit = credit; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return String.format("%-10s %-25s %5d %-15s", id, title, credit, department);
    }
}


