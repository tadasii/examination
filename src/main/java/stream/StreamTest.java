package stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 实现 deleteStudents,getDistinctStudents，getMaleStudents，sumScore，sortByScore，filterByScore六个方法
 * 注意：不要重写Student类的equals和hashCode方法
 */
public class StreamTest {
    /**
     * 测试方法，写完后可以打开注释测试一下
     * @param args
     */
    public static void main(String[] args) {
        List<Student> studentList= getStudents();
//        deleteStudents(studentList);
//        studentList=  getDistinctStudents(studentList);
//        studentList=   getMaleStudents(studentList);
//        long sum= sumScore(studentList);
//        System.out.println(sum);
//        studentList= sortByScore(studentList);
//        studentList=  filterByScore(600,studentList);
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.println("id=="+student.getId()+"male==="+student.getSex()+"score==="+student.getScore());
        }
    }

    /**
     * 删除 students中 name 等于 "bb" 的学生
     * @param students
     */
    public static void deleteStudents(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student  student = iterator.next();
            if("bb".equals(student.getName())){
                iterator.remove();
            }
        }
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


    public static List<Student> getStudents(){
        List<Student> students =   new ArrayList<>();
        students.add( new Student("1","张三","男","1班",600));
        students.add( new Student("2","李四","女","1班",620));
        students.add( new Student("0","bb","男","1班",400));
        students.add( new Student("0","bb","男","1班",400));
        students.add( new Student("3","王五","男","2班",500));
        students.add( new Student("4","赵六","男","2班",530));
        students.add( new Student("5","田七","女","1班",700));
        students.add( new Student("1","张三","男","1班",600));
        students.add( new Student("2","李四","女","1班",620));
        students.add( new Student("6","钱八","女","2班",430));
        students.add( new Student("7","吴九","男","2班",300));
        students.add( new Student("8","铁十","男","1班",400));
        return students;
    }
}
