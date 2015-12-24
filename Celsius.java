package Module4_1_3;

public class Celsius {

   private int tempCels;
   private float celsToFahr;


    Celsius(int tempCels){
        this.tempCels = tempCels;
        this.celsToFahr = 32+(1.8f * tempCels);

            }

    public float getCelsToFahr(){
        return this.celsToFahr;
    }

}
