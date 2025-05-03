package HackerRank;

public class ViralAdvertising {
    
    public static int viralAdvertising(int n){

        int likesPerDay=0;
        int totalLikes = 0;
        int people = 5;
        
        for(int i=1; i<=n;i++){
            likesPerDay = Math.floorDiv(people, 2);
            people = likesPerDay*3;
            totalLikes = totalLikes + likesPerDay;
        }

        System.out.println("TOTAL LIKES====>" + totalLikes);

        return totalLikes;
    }

    public static void main(String[] args) {
        viralAdvertising(3);
    }
}
