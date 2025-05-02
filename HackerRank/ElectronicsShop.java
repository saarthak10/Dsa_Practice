package HackerRank;

public class ElectronicsShop {
    
    public static int getMoneySpent(int[] keyboards, int[] usbDrives, int b){
        int result=-1;
        for(int i=0; i< keyboards.length; i++){
            for(int j =0 ; j< usbDrives.length;j++){
                int currentPrice = keyboards[i] + usbDrives[j];
                if(currentPrice > result && currentPrice <=b){
                    result = currentPrice;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] keyboards = new int[]{40,50,60};
        int[] usbDrives = new int[]{5,8,12};
        int b= 60;
        getMoneySpent(keyboards, usbDrives, b);
    }
}
