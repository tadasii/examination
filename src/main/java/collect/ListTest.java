package collect;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 删除list中值为 "bb" 的元素
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("bb");
        list.add("ccc");
        list.add("ccc");
        list.add("ccc");
        //代码写在下面
        System.out.println("原来的list:"+list);
        //通过迭代器删除元素，不会引起指针问题
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if("bb".equals(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println("删除后的list:"+list);
    }

}
