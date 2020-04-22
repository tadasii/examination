package print;

public class StringTest {
    /**
     * 注意不要运行程序，直接写出打印结果
     * @param args
     */
    public static void main(String[] args) {
        String str = "a";
        dealString(str);
        System.out.println(str); //此行的打印结果写在这里：
    }

    public static void dealString(String str){
        for (int i = 0; i <3 ; i++) {
            str = str + i;
        }
        System.out.println(str); //此行的打印结果写在这里：
    }
}
