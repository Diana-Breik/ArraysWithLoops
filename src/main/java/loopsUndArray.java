public class loopsUndArray {
    public static void main(String[] args) {
        int [] zahlen= new int[10];
        zahlen[0]=0;
        int summe=0;
        for(int i=0;i< zahlen.length; i++){
            zahlen[i]=i+1;
            summe=summe+zahlen[i];
           // System.out.println(zahlen[i]);
        }
        System.out.println("Summe ist:"+summe);
        int größtewerte=zahlen[0];
        for(int i=1;i< zahlen.length; i++){
            if(zahlen[i]>größtewerte)
            {
                größtewerte=zahlen[i];
            }
            else
            {
                continue;
            }

        }
        System.out.println("der größte wert im array ist:"+größtewerte);

        ///////////////////////////////////////
        int [] zahlen2= new int[10];
        for(int i=0;i< zahlen.length; i++){
            zahlen[i]=i+1;
            summe=summe+zahlen[i];
            // System.out.println(zahlen[i]);
        }

    }
}
