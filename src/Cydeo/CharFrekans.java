package Cydeo;

public class CharFrekans {
    public static void main(String[] args) {
        String a,b="", str="aaabbcccddddd";
        boolean control=false;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            a=str.substring(i,i+1);
            for (int j = 0; j < i; j++) {
                if (a.equals(str.substring(j,j+1))){
                    control=true;
                }
            }
            if (!control) {
                for (int j = i; j < str.length(); j++) {
                    if (a.equals(str.substring(j, j + 1))) {
                        count++;
                    }
                }
            }
           if (count!=0){
                b=b+a+count;
            }
            count=0;
            control=false;
        }
        System.out.println(b);
    }
}
