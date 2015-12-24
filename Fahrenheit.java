package Module4_1_3;

public class Fahrenheit {
   private float tempFahr = 44.6f;
   private float fahrToCels;


    Fahrenheit(float tempFahr){
        this.tempFahr = tempFahr;
        this.fahrToCels = Math.round((tempFahr - 32) / 1.8);

    }

    public float getFahrToCels(){
        return fahrToCels;
    }

}



