package HackerRank;

public class ConvertTime {
    
    public static String convertTime(String s){
        String result = "";
        if(s.charAt(8)=='P'){
            System.out.println("I AM HERE===>");
            String portion=s.substring(0,8);
            String[] time=portion.split(":");
            if(time[0].matches("12")){
                System.out.println(time[0]+":"+time[1]+":"+time[2]);
                result = time[0]+":"+time[1]+":"+time[2];
            }else{
                time[0]=String.valueOf(Integer.valueOf(time[0])+12);
                System.out.println(time[0]+":"+time[1]+":"+time[2]);
                result = time[0]+":"+time[1]+":"+time[2];
            }
        }else{
            String portion=s.substring(0,8);
            String[] time=portion.split(":");
            if(time[0].matches("12")){
                time[0]="00";
                System.out.println(time[0]+":"+time[1]+":"+time[2]);
                result = time[0]+":"+time[1]+":"+time[2];
            }else{
                System.out.println(portion);
                result = portion;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String time = "12:45:54PM";
        convertTime(time);
    }
}
