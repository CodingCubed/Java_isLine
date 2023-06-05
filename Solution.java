public class Solution{
    public boolean straightLine(int[][] coords){
        boolean isLine=true;
        if (coords.length==0){throw new IllegalArgumentException("Parameter 'coords' cannot be empty");}
        if (coords.length==1){throw new IllegalArgumentException("Cannot determine if isLine with 1 coordinate pair");}
        if (coords.length==2){return true;}
        double commonSlope;
        if (coords[1][0]-coords[0][0]==0){
            commonSlope=0.0;
        }else {
            commonSlope=(coords[1][1]-coords[0][1])/(coords[1][0]-coords[0][0]);
        }
        for (int i=0; i<coords.length-1; i++) {
            int[] nextArray=coords[i+1];
            int[] currArray=coords[i];
            if (nextArray[0]-currArray[0]==0){
                continue;
            } else {
                if (((nextArray[1]-currArray[1])/(nextArray[0]-currArray[0]))==commonSlope){
                    continue;
                } else {
                    isLine=false;
                }
            }
        }
        return isLine;
    }
}