```java 
A)

(1) Auto meinAuto; 
(2) meinAuto = new Auto();
(3) meinAuto.schalteGangAuf(4);  
(4) System.out.println(meinAuto.gebNamen());

B)

public class Auto{
    double hoege;
    String name;
    int aktuellerGang;

    gebeNamen(){
        return name; 
    }
    schalteGangauf(int pGaenge){
        aktuellerGang = pGaenge; 
    }

}