
public class Reviw01 {

    public static void main(String[] args) {
        double zeinuki = 300.0;
        double zei = 0.1;
         
        double result;
        result  = tax(zeinuki,zei); 
        
        String tax;
        System.out.println(zeinuki+"の税込み価格は" + (zeinuki + result)+ "円" +("消費税は"+result +"円")+"です");
               
    }

    private static double tax(double zeinuki,double zei) {
        return  zeinuki * zei;
    }
  
}
