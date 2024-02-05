import java.util.*;

public class PaiDui {

    //牌堆队列
    private Deque deque;

    public PaiDui(){

        this.deque = new ArrayDeque();
        List list = new ArrayList();

        //牌堆总共160张牌
        //黑色杀包括雷杀总共30张
        int i = 0;
        while(i<30){
            list.add(new Pai(0,1));
            i++;
        }

        //红色杀包含火杀总共14张
        i = 0;
        while(i<14){
            list.add(new Pai(1,1));
            i++;
        }

        //闪24张
        i = 0;
        while(i<36){
            list.add(new Pai(1,2));
            i++;
        }
        //桃12张
        i = 0;
        while(i<12){
            list.add(new Pai(1,14));
            i++;
        }
        //酒5张 默认黑色
        i = 0;
        while(i<5){
            list.add(new Pai(0,3));
            i++;
        }

        //南蛮3张
        i = 0;
        while(i<3){
            list.add(new Pai(0,4));
            i++;
        }

        //万箭1张
        list.add(new Pai(1,5));

        //无懈可击 7张 4黑 3红
        i = 0;
        while(i<4){
            list.add(new Pai(0,6));
            i++;
        }
        i = 0;
        while(i<3){
            list.add(new Pai(1,6));
            i++;
        }


        //顺手牵羊 5张 默认全黑使用
        i = 0;
        while(i<4){
            list.add(new Pai(0,7));
            i++;
        }

        //过河拆桥 6张 5黑 1红
        i = 0;
        while(i<5){
            list.add(new Pai(0,8));
            i++;
        }
        list.add(new Pai(1,8));

        //无中生有 4张
        i = 0;
        while(i<4){
            list.add(new Pai(1,9));
            i++;
        }

        //铁锁连环 6张
        i = 0;
        while(i<6){
            list.add(new Pai(0,10));
            i++;
        }

        //决斗3张 2黑 1红
        i = 0;
        while(i<2){
            list.add(new Pai(0,11));
            i++;
        }
        list.add(new Pai(1,11));

        //诸葛连弩 2张 一黑一红
        list.add(new Pai(0,12));
        list.add(new Pai(1,12));

        //剩余其他牌 总共 16红 23黑，红色牌关羽全当红杀，黑色牌无用
        i = 0;
        while(i<16){
            list.add(new Pai(1,13));
            i++;
        }
        i = 0;
        while(i<23){
            list.add(new Pai(0,13));
            i++;
        }

        //打乱牌堆
        Collections.shuffle(list);

        this.deque.addAll(list);


    }

    @Override
    public String toString() {
        return this.deque.toString();
    }

    public Deque getDeque() {
        return deque;
    }

    public void setDeque(Deque deque) {
        this.deque = deque;
    }
}
/**
 * 牌
 */
class Pai{

    //颜色 0为黑 1为红
    private int color;

    //牌类型
    // 杀1 闪桃2 酒3 4南蛮 5万箭 6无邪 7顺手 8过拆 9无中 10铁锁 11决斗 12连弩 13无用
    private int type;

    public Pai(int color,int type){

        this.color = color;
        this.type = type;

    }

    /**
     *
     * @return
     */
    public String getTypeName(){

        if(this.type == 1){
            return "杀";
        }
        if(this.type == 2){
            return "闪";
        }
        if(this.type == 14){
            return "桃";
        }
        if(this.type == 3){
            return "酒";
        }
        if(this.type == 4){
            return "南蛮";
        }
        if(this.type == 5){
            return "万箭";
        }
        if(this.type == 6){
            return "无懈可击";
        }
        if(this.type == 7){
            return "顺手牵羊";
        }
        if(this.type == 8){
            return "过河拆桥";
        }
        if(this.type == 9){
            return "无中生有";
        }
        if(this.type == 10){
            return "铁锁连环";
        }
        if(this.type == 11){
            return "决斗";
        }
        if(this.type == 12){
            return "连弩";
        }
        if(this.type == 13){
            return "无用";
        }
        return null;
    }

    public String getColorName(){
        if(this.color == 0)
            return "黑";
        return "红";
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getColorName() + getTypeName() ;
    }
}
