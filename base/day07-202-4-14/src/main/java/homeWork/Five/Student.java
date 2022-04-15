package homeWork.Five;

/**
 * @author: zcl
 * @create: 2022/4/14 16:49
 */
public class Student {
    private String name;
    private int age;
    private String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }
}
