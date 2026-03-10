public class zeroday6_DSA5 {
    public static void main(String[] args) {
        int [] arr={-5,1,5,0,-7};
        int largestAltitude= 0;
        int currentAltitude = 0;
        int maxAltitude = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currentAltitude = currentAltitude + arr[i];
            
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        System.out.println(maxAltitude);
    }
}
