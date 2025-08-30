package iuh.oop.se;
import java.util.*;
public class CourseList {
	private Course[] courses;
    private int count;

    public CourseList(int n) {
        courses = new Course[n];
        count = 0;
    }

    public Course[] getCourses() {
        return courses;
    }

    public boolean isFull() {
        return count == courses.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean exists(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id))
                return true;
        }
        return false;
    }

    public boolean addCourse(Course c) {
        if (isFull()) {
            System.out.println("Danh sách đã đầy!");
            return false;
        }
        if (exists(c.getId())) {
            System.out.println("Mã khóa học đã tồn tại!");
            return false;
        }
        courses[count++] = c;
        return true;
    }

    public boolean removeCourse(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++)
                    courses[j] = courses[j + 1];
                courses[--count] = null;
                return true;
            }
        }
        System.out.println("Không tìm thấy khóa học để xóa!");
        return false;
    }

    public Course searchCourseById(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id))
                return courses[i];
        }
        return null;
    }

    public Course[] searchCourseByTitle(String title) {
        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getTitle().toLowerCase().contains(title.toLowerCase()))
                result.add(courses[i]);
        }
        return result.isEmpty() ? null : result.toArray(new Course[0]);
    }

    public Course[] searchCourseByDepartment(String department) {
        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getDepartment().equalsIgnoreCase(department))
                result.add(courses[i]);
        }
        return result.isEmpty() ? null : result.toArray(new Course[0]);
    }

    public Course[] sortCoursesByTitle() {
        Course[] sorted = Arrays.copyOf(courses, count);
        Arrays.sort(sorted, Comparator.comparing(Course::getTitle));
        return sorted;
    }

    public Course[] findMaxCreditCourses() {
        if (isEmpty()) return null;
        int maxCredit = courses[0].getCredit();
        for (int i = 1; i < count; i++)
            if (courses[i].getCredit() > maxCredit)
                maxCredit = courses[i].getCredit();

        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++)
            if (courses[i].getCredit() == maxCredit)
                result.add(courses[i]);

        return result.toArray(new Course[0]);
    }

    public Course[] findMaxDepartmentCourses() {
        if (isEmpty()) return null;
        Map<String, Integer> freq = new HashMap<>();
        for (int i = 0; i < count; i++)
            freq.put(courses[i].getDepartment(),
                     freq.getOrDefault(courses[i].getDepartment(), 0) + 1);

        int max = Collections.max(freq.values());
        List<String> departments = new ArrayList<>();
        for (Map.Entry<String, Integer> e : freq.entrySet())
            if (e.getValue() == max)
                departments.add(e.getKey());

        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++)
            if (departments.contains(courses[i].getDepartment()))
                result.add(courses[i]);

        return result.toArray(new Course[0]);
    }
}

