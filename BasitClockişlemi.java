

import java.util.Scanner;


public class ClockTest {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);//Instantiate Scanner class
        Clock c1=new Clock();//Create a new Clock object
        c1.setName("Local Time Zone");//Set name
        c1.displayTime();
        System.out.print("Enter local hour: ");
        c1.setHours(input.nextInt());//Get hours from user
        System.out.print("Enter local minute: ");
        c1.setMinutes(input.nextInt());//Get minutes from user
        System.out.print("Enter local second: ");
        c1.setSeconds(input.nextInt());//Get seconds from user
        c1.displayTime();
        Clock c2=new Clock(c1);//Instantiate a new Clock object using another constructor
        c2.displayTime();
        c2.incrementHours(2);//Increment hours by 2
        c2.setName("Europe Time Zone");
        c2.displayTime();
        Clock c3=new Clock(c1);
        c3.setName("New York City Time Zone");
        c3.incrementHours(-7);//Decrement hours by 7
        c3.displayTime();        
        Clock c4=new Clock(11, 11, 11);
        c4.setName("Clock 11");
        c4.displayTime();
        c4.incrementSeconds(600);
        c4.displayTime();
        c4.incrementMinutes(800);
        c4.displayTime();
    }    
/*Eğer başka bir sayfada açsaydık classı "private static class" yerine
  "public class" yazacaktık. */ 
private static class Clock { //Classımızı açtık.
    private int hour;        //Değişkenleri private(özel) ile tanıttık. 
    private int minute;   
    private int second;
    private String name;

public Clock(){   //Local Time Zone olarak ilk başta sıfır alarak tanımladık.                         
hour=0;                 
minute=0;
second=0;
}

public void setHours(int h){ //'set'lerle biçim belirledik.
hour=(h>=0&&h<=23)?h:0;     
}
public void setMinutes(int m){
minute=(m>=0&&m<=59)?m:0;
}
public void setSeconds(int s){
second=(s>=0&&s<=59)?s:0;
}

public int getHours(){ //'get'lerle değişkenleri döndüedük methodlara.
return hour;
}
public int getMinutes(){
return minute;
}
public int getSeconds(){
return second;
}


public void setName(String string){
    name=string;
}
public String getName(){
return name;
}

public void setClock(int h,int m,int s){
    setHours(h);          
    setMinutes(m);
    setSeconds(s);
}

public Clock(int h,int m,int s){ //Methodun Biçimi için.
    setClock(h,m,s);
}
public Clock(Clock c){ //Clockları kopyalama işlemi.
setHours(c.getHours());
setMinutes(c.getMinutes());
setSeconds(c.getSeconds());
setName(c.getName());
}

public void displayTime(){ //Görüntüleme.
    System.out.println(name+" --> "+hour+":"+minute+":"+second+" -->");
}

public void incrementHours(int h){ //arttırma veya azaltma için kullanılabilir.
int temp=hour+h;
if(temp>=0) hour=temp%24;
else hour=(temp%24)+24;
}
public void incrementMinutes(int m){
int temp=minute+m;//20-30=-10
if(temp>=0){ minute=temp%60;
incrementHours(temp/60); }
else minute=(temp%60)+60;  
} 

public void incrementSeconds(int s){
int temp=second+s;//20-30=-10
if(temp>=0){ second=temp%60;
incrementMinutes(temp/60);}
else second=(temp%60)+60;
}

}
}
