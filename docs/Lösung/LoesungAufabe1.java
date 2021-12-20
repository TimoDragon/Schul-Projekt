public class LoesungAufabe1 {
    public static void main(String[] args) {
        double rabatt; 
         int preis = 421;
        if(preis>100){
            if(preis>500){
                rabatt=0.50;
            }else{
                if(preis>300){
                    rabatt=0.3;
                }else{
                    if(preis>200){
                        rabatt= 0.25;
                    }else{
                        rabatt=0.2;
                    }
                }
            }
            
        }  else if(preis>50){
                if(preis>75){
                    rabatt=0.1;
                }else{
                    rabatt = 0.07;
                }
            }else{
                rabatt = 0.05;
            }
            double geldWeniger = preis*rabatt; 
            double neuPreis= preis-geldWeniger; 
            System.out.println(neuPreis);
                
     }
}