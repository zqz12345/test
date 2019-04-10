import java.util.Scanner;

public class Text{
    public void pay(String dayPrice,double weight) throws ArrayIndexOutOfBoundsException{
        String message = "西红柿" + dayPrice + "元/500克";
        String[] strArr = message.split(":");
        String unitPriceStr = strArr[2].substring(0,4);
        double unitPriceDou = Double.parseDouble(unitPriceStr);
        System.out.println(message + "" + weight + "克的西红柿，须支付" + (float) (weight / 500 * unitPriceDou) + "元");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天的西红柿单价（单价格式为“3.00”）：");
        String dayPrice = sc.next();
        if(dayPrice.length() == 4){
            double weight = 650;
            try{
                Text tomato = new Text();
                tomato.pay(dayPrice,weight);
            }catch (ArrayIndexOutOfBoundsException aiobe){
                System.out.println("pay方法抛出数组元素下标越界异常！");
            }finally{
                sc.close();
                System.out.println("控制台输入对象被关闭。");
            }
        }else{
            System.out.println("违规操作：" + "输入西红柿单价时小数点后必须保留两位有效数字（如3.00）！");
        }
    }
}