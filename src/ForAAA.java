public class ForAAA {
    public static void main(String[] args) {

        String str,asr="Java is java in everywhere is Java uuy java gfbug bukygb ukyg bukygb ukyg bnukyg bu java     ";
        asr=asr.trim();
        int count=0,co=0;
        for (int i = 0; i <= asr.length()-4; i++) {
            str=asr.substring(i,i+4);
            if(str.equalsIgnoreCase("java")){
                count++;
            }
            if (asr.charAt(i)==' '){
                co++;
            }

        }
       co++;
        System.out.println(count);
        System.out.println(co);

        String a="Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&"
;
        String b="";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '.') {
                if ((a.charAt(i) < 123 && a.charAt(i) > 96) || (a.charAt(i) > 64 && a.charAt(i) < 91) || a.charAt(i) == ' ') {
                    b=b+a.charAt(i);
                }
        }
        }
        System.out.println(b);





    }
}
