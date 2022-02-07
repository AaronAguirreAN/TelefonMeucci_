import java.util.Scanner;

public class TelefonMeucci {
    static int contador=0;
    static String fr="";
    static String[] set1 = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        while(t.hasNext()){
            contador = 0;
            fr=t.next();
            if(!fr.contains("I")&&!fr.contains("V")) {
                contador++;
            }else {
                comprova(fr);
            }
            System.out.println(contador);
        }
    }

    private static void comprova(String f) {
        for(int i=1;i<5&&i<=f.length();i++){
            boolean trobat=false;
            for(int j=0;j<10;j++){
                if(f.substring(0,i).equals(set1[j]))
                    trobat=true;
            }
            if(trobat){
                String res=f.substring(i,f.length());
                if(res.length()>0)
                    comprova(res);
                else if(res.length()==0){
                    contador++;
                    return;
                }
            }
        }
    }
}