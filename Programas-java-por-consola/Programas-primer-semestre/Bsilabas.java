
 class Main {
public static void main(String argv[]){
String cad="transtorno";
int x=1;
System.out.print(cad.charAt(0));
while(x<cad.length()){
if(!isVocal(cad.charAt(x))&& isVocal(cad.charAt(x-1)))
System.out.println();
System.out.print(cad.charAt(x++));
}
}
public static boolean isVocal(char c){
String v="aeiou";
if(v.indexOf(c)!=-1)
return true;
else
return false;
}
}

