public class Exm2 {

    // iki boyutlu bir string dizisini birleştirip
    // a. tek bir string yapan
    // b. satırları birleştirip tek bir string yapan
    // c. sütunları birleştirip tek bir string yapan

    public static void main(String[] args) {

        String b="";
        String c="";
        String d="";
        String a[][] = {{"a","b"},{"c","d"}};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                b =a[0][0]+a[0][1]+a[1][0]+a[1][1];
                c=a[0][0]+a[0][1];
                d=a[1][0]+a[1][1];
            }

        }
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
