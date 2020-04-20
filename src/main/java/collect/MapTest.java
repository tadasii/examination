package collect;
import java.util.*;

/**
 * 找出 map中 value == 5 的 key,并打印出来;
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map =  getRandomMap();
        //找出 map中 value == 5 的 key,并打印出该key和value;
        //todo 代码写在下面
    }

    /**
     *  生成 value在0-9的 随机map
     * @return
     */
    public static HashMap<Integer,Integer> getRandomMap(){
        HashMap<Integer,Integer> map = new HashMap();
        Random random = new Random();
        for(int i=0;i<100;i++){
            int value = random.nextInt(10);
            map.put(i,value);
        }
        return map;
    }

}
