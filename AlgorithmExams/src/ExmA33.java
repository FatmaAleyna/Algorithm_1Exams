public class ExmA33 {
    // tek boyutlu string dizisindeki n uzun stringi ekrana yazan pr

    public static void main(String[] args) {

        String myarray[]={"jsdh","dsıa","jdfkdd","fatmaaleynadogan"};
        String enu=myarray[0];

        for (int i = 0; i < myarray.length ; i++) {
            if (myarray[i].length()>enu.length()){
                enu=myarray[i];
            }
        }
        System.out.println("verilen dizideki en uzun string: "+enu);
    }
}
