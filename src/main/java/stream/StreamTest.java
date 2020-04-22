package stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 实现 getDistinctStudents，getMaleStudents，sumScore，sortByScore，filterByScore五个方法
 * 注意：不要重写Student类的equals和hashCode方法
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Student> studentList= getStudents();
        studentList= getDistinctStudents(studentList);
        studentList= getMaleStudents(studentList);
        studentList= sortByScore(studentList);
        studentList= filterByScore(500,studentList);
        long sum = sumScore(studentList);
        studentList.forEach( student->{
            System.out.println("id=="+student.getId()+"male==="+student.getSex()+"score==="+student.getScore());
        } );
        System.out.println(sum);
    }

    /** todo
     * id重复的students去重
     * @param students
     * @return 返回去掉重复id的student的list
     */
    public static List<Student> getDistinctStudents(List<Student> students){
        //代码写在这里，并替换掉返回结果
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
           //判断 result 中是否 包含 student
            boolean is = result.stream().anyMatch(item->item.getId().equals(student.getId()));
            if(!is){//如果不包含，则添加该元素
                result.add(student);
            }
        }
        return result ;
    }

    /**todo
     * 找出男同学
     * @param students
     * @return
     */
    public static List<Student> getMaleStudents(List<Student> students){
        //代码写在这里，并替换掉返回结果
        //用lamda表达式，一句话就可以搞定
        students = students.stream().filter(student->student.getSex().equals("男")).collect(Collectors.toList());
        return students;
    }

    /**todo
     * 统计总分数
     * @param students
     * @return
     */
    public static long sumScore(List<Student> students){
        //代码写在这里，并替换掉返回结果
       long sum = students.stream().mapToInt(Student::getScore).sum();
        return  sum;
    }

    /**
     * 按分数从高到低排序
     * @param students
     * @return
     */
    public static List<Student> sortByScore(List<Student> students){
        //代码写在这里，并替换掉返回结果
        List<Student> res = students.stream().sorted((s1,s2)->s2.getScore()-s1.getScore()).collect(Collectors.toList());
        return res;
    }

    /**todo
     * 找出分数大于或者等于score的学生
     * @param score 指定分数
     * @return
     */
    public static List<Student> filterByScore(int score,List<Student> students){
        //代码写在这里，并替换掉返回结果
        students = students.stream().filter(student->student.getScore()>=score).collect(Collectors.toList());
        return students;
    }


    public static List<Student> getStudents(){
        List<Student> students =    Arrays.asList(
                                        new Student("1","张三","男","1班",600),
                                        new Student("2","李四","女","1班",620),
                                        new Student("3","王五","男","2班",500),
                                        new Student("4","赵六","男","2班",530),
                                        new Student("5","田七","女","1班",700),
                                        new Student("1","张三","男","1班",600),
                                        new Student("2","李四","女","1班",620),
                                        new Student("6","钱八","女","2班",430),
                                        new Student("7","吴九","男","2班",300),
                                        new Student("8","铁十","男","1班",400));
        return students;
    }
}
