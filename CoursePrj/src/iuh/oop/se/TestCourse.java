package iuh.oop.se;

public class TestCourse {
	public static void initData(CourseList cl) {
        cl.addCourse(new Course("C01", "Lap trinh Java", 3, "CNTT"));
        cl.addCourse(new Course("C02", "Co so du lieu", 4, "CNTT"));
        cl.addCourse(new Course("C03", "Kinh te vi mo", 2, "KinhTe"));
        cl.addCourse(new Course("C04", "Triet hoc", 3, "XaHoi"));
        cl.addCourse(new Course("C05", "He dieu hanh", 4, "CNTT"));
    }

    public static void main(String[] args) {
        CourseList cl = new CourseList(10);
        initData(cl);

        System.out.println("Danh sách khóa học:");
        for (Course c : cl.getCourses()) {
            if (c != null) System.out.println(c);
        }

        System.out.println("\nTìm theo mã C03:");
        System.out.println(cl.searchCourseById("C03"));

        System.out.println("\nTìm các khóa học có tín chỉ lớn nhất:");
        for (Course c : cl.findMaxCreditCourses())
            System.out.println(c);

        System.out.println("\nSắp xếp theo tên:");
        for (Course c : cl.sortCoursesByTitle())
            System.out.println(c);

        System.out.println("\nTìm khoa phụ trách nhiều khóa học nhất:");
        for (Course c : cl.findMaxDepartmentCourses())
            System.out.println(c);
    }
}

