
public class Reviw01 {

    public static void main(String[] args) {
        double zeinuki = 300;
        double zei = 0.1;
        
        int i =(int)zeinuki;
        
        double result;
        result  = tax(zeinuki,zei); 
        
        int r = (int)result;
            
        
                
        
        String tax;
        System.out.println(i+"の税込み価格は" + (i + r)+ "円" +("消費税は"+r +"円")+"です");
               
    }

    private static double tax(double zeinuki,double zei) {
        return  zeinuki * zei;
    }
  
}
