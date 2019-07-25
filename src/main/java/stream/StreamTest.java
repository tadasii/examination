package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Student> studentList= getStudents();
//        studentList =getDistinctStudents(studentList);
//        studentList =getMaleStudents(studentList);
//       long  score =sumScore(studentList);
        studentList = sortByScore(studentList);
//        System.out.println(score);
        studentList.forEach( student->{
            System.out.println("id=="+student.getId()+"male==="+student.getSex()+"score==="+student.getScore());
        } );

    }

    /** todo
     * id重复的students去重
     * @param students
     * @return 返回去掉重复id的student的list
     */
    public static List<Student> getDistinctStudents(List<Student> students){

        return null ;
    }

    /**todo
     * 找出男同学
     * @param students
     * @return
     */
    public static List<Student> getMaleStudents(List<Student> students){

        return null;
    }

    /**todo
     * 统计总分数
     * @param students
     * @return
     */
    public static long sumScore(List<Student> students){



        return  0;
    }

    /**
     * 按分数从高到低排序
     * @param students
     * @return
     */
    public static List<Student> sortByScore(List<Student> students){

        return null;
    }

    /**todo
     * 找出分数大于或者等于指定分数的学生
     * @param score
     * @return
     */
    public static List<Student> filterByScore(int score,List<Student> students){

        return null;
    }


    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("1","张三","男","1班",600);
        Student student2 = new Student("2","李四","女","1班",620);
        Student student3 = new Student("3","王五","男","2班",500);
        Student student4 = new Student("4","赵六","男","2班",530);
        Student student5 = new Student("5","田七","女","1班",700);
        Student student6 = new Student("6","钱八","女","2班",430);
        Student student7 = new Student("7","吴九","男","2班",300);
        Student student8 = new Student("8","铁十","男","1班",400);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student1);
        students.add(student2);
        return students;
    }
}
