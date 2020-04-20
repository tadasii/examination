package stream;

import java.util.*;

/**
 * 实现 getDistinctStudents，getMaleStudents，sumScore，sortByScore，filterByScore五个方法
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Student> studentList= getStudents();
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
        //代码写在这里，并替换掉返回结果
        return null ;
    }

    /**todo
     * 找出男同学
     * @param students
     * @return
     */
    public static List<Student> getMaleStudents(List<Student> students){
        //代码写在这里，并替换掉返回结果
        return null;
    }

    /**todo
     * 统计总分数
     * @param students
     * @return
     */
    public static long sumScore(List<Student> students){
        //代码写在这里，并替换掉返回结果
        return  0;
    }

    /**
     * 按分数从高到低排序
     * @param students
     * @return
     */
    public static List<Student> sortByScore(List<Student> students){
        //代码写在这里，并替换掉返回结果
        return null;
    }

    /**todo
     * 找出分数大于或者等于score的学生
     * @param score 指定分数
     * @return
     */
    public static List<Student> filterByScore(int score,List<Student> students){
        //代码写在这里，并替换掉返回结果
        return null;
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
