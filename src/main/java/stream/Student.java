package stream;

public class Student {
    private String id; //编号
    private String name; //姓名
    private String sex;  //性别
    private String classId; //班级id
    private int score;  //考试分数

    public Student(String id, String name, String sex, String classId, int score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.classId = classId;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
