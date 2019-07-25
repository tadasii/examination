package print;

public class ObjectTest {

    //todo  写出打印结果
    //
    public static void main(String[] args) {
        int i = 1;
        changeInteger(i);
        System.out.println(i); //

        String str = new String("a");
        changeString(str);
        System.out.println(str);//

        StringBuffer sb = new StringBuffer("a");
        changeStringBuffer(sb);
        System.out.println(sb);//


        Person person = new Person("a");
        changePerson(person);
        System.out.println(person.getName());//

        Person person2 = new Person("a");
        changePerson2(person2);
        System.out.println(person2.getName());//


    }

    public static void changeInteger(int i){
        i = i+1;
    }

    public static void changeString(String str){
        str = "b";
    }

    public static void changeStringBuffer(StringBuffer sb){
        sb= sb.append("b");
    }

    public static void changePerson(Person person){
        person.setName("b");
    }

    public static void changePerson2(Person person){
        person = new Person("b");
    }






}
