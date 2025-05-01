package HackerRank;

public class CatAndMouse {
    
    public static String CatAndMouseChange(int x, int y, int z){
        String result = "";
        int distanceBetweenFirstCatAndMouse =  Math.abs(z-x);
        int distanceBetweenSecondCatAndMouse = Math.abs(z-y);

        if(distanceBetweenSecondCatAndMouse < distanceBetweenFirstCatAndMouse){
            result = "Cat B";
            System.out.println("Cat B");
        }else if(distanceBetweenSecondCatAndMouse > distanceBetweenFirstCatAndMouse){
            result = "Cat A";

            System.out.println("Cat A");
        }else{
            result = "Mouse C";

            System.out.println("Mouse C");
        }

        return result;
    }

    public static void main(String[] args) {
        CatAndMouseChange(1, 3, 2);
    }
}
