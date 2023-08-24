public class loopsUndArray {
    public static void main(String[] args) {

        int [] zahlen= new int[10];
        for(int i=0;i< zahlen.length; i++){
            zahlen[i]=i+1;
        }

        //das array zahlen[10] wurde gestellt ,jetzt kann man Methoden für es aufrufen.
        System.out.println("Das Array zahlen ist: ");
        printtheArray(zahlen);
        printtheSummeOfArray(zahlen);
        findTheLargestValueInTheMatrix(zahlen);

        //Erstelle ein zweites Array mit den Zahlen von 11 bis 20
        int [] zahlen2= new int[10];
        for(int i=0;i< zahlen2.length; i++){
            zahlen2[i]=i+11;
        }
        System.out.println("Das Array zahlen2 ist: ");
        printtheArray(zahlen2);
        System.out.println("Das Array sumOfTwoArrays, die beide Arrays zahlen und zahlen2 berechnet, ist: ");
        printtheArray(sumOfTwoMatrices(zahlen,zahlen2));


    }


    /////////////////////////////////////////////////////METHODEN/////////////////////////////////////////////////


    // gib die Elemente des Arrays aus
    public static void printtheArray(int [] zahlen){
        System.out.print('[');
        for (int i=0;i< zahlen.length; i++){
            System.out.print(zahlen[i]);
            if(i<(zahlen.length -1)){
                System.out.print(',');
            }

        }
        System.out.println(']');

    }

    //Berechne die Summe aller Zahlen im Array und gib das Ergebnis auf der konsole aus

    public static void printtheSummeOfArray(int [] zahlen){
        int summe=0;
        for (int i=0;i< zahlen.length; i++){
            summe=summe+zahlen[i];
        }
        System.out.println("Die Summe des Arrays ist: " + summe);
    }

    //Finde die größte Zahl im Array und gib sie auf der Konsole aus
    public static void findTheLargestValueInTheMatrix(int [] zahlen){
        int größtewerte=zahlen[0];
        for(int i=1;i< zahlen.length; i++){
            if(zahlen[i]>größtewerte)
            {
                größtewerte=zahlen[i];
            }
            else {
                continue;
            }

        }
        System.out.println("Der größte wert im array ist: " + größtewerte);

    }

    //Führe eine elementweise Addition beider Arrays durch, und speichere das Ergebnis in einem dritten Array .Gib das Ergebnis-Array auf der Konsole aus.

    public static int[] sumOfTwoMatrices(int [] zahlen, int [] zahlen2){
        int [] sumOfTwoArrays= new int[10];
        for(int i=0;i<zahlen.length;i++)
        {
            for(int j=0;j<zahlen2.length;j++){
                if(i==j){
                    sumOfTwoArrays[i]=zahlen[i]+zahlen2[j];
                    break;
                }
                else{
                    continue;
                }
              }

        }
         return sumOfTwoArrays;
    }

}
