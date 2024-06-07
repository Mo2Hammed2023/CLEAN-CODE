package digital.clocke;

import java.util.Scanner;

public class DigitalClocke {
    public static void main(String[] args) {
   Scanner in=new Scanner (System.in);
  int Opration;
  do{           
System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
System.out.println("أدخل الى الساعة-1");
System.out.println("أدخل الى المؤقت-2");
System.out.println("أدخل المنبة-3");
System.out.println("خروج -4");
System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
System.out.println("أختار العملية المراد تنفيذها ");
System.out.println("\033[h\033[2j");
System.out.flush();
Opration =in.nextInt();
switch(Opration){
case 1:
    System.out.println("الساعة");
    System.out.println("أدخل الساعة");
    int Hour=in.nextInt();
    System.out.println("أدخل الدقائق");
    int Minute=in.nextInt();                  
      while (true) {
    for (int counter_days = 1;counter_days <= 1; counter_days--) {
    for (int counter_hours = Hour; counter_hours < 24; counter_hours++) {
    for (int counter_minutes = Minute; counter_minutes < 60; counter_minutes++) {
    for (int counter_second = 0; counter_second < 60;counter_second++) {
       if(Minute==59)
          Minute=1;
       if(Hour==24)
          Hour=1;
         try{
      Thread.sleep(1000);
 }catch(InterruptedException e){}
System.out.println("\033[h\033[2j");
System.out.flush();     
System.out.println(counter_hours+":"+counter_minutes+":"+counter_second);    

    }}}}}                       
 case 2:
     System.out.println("المؤقت");
     int totalTime = 0;
     int maxTime = 100;
     while (totalTime < maxTime) {
   for (int counter_days = 1; counter_days <= 1; counter_days--) {
for (int counter_hours = 0; counter_hours < 100; counter_hours++) {
for (int counter_minutes = 0; counter_minutes < 60; counter_minutes++) {
for (int counter_second=0;counter_second<60;counter_second++) {
    try{
    Thread.sleep(100);
}catch(InterruptedException e){}
  System.out.println("\033[h\033[2j");
System.out.flush();
for (int q = 0; q <= 99; q++) {
    try{
    Thread.sleep(1000);
}catch(InterruptedException e){}
System.out.println("\033[h\033[2j");
System.out.flush();
System.out.println(counter_hours+":"+counter_minutes+":"+counter_second);
totalTime++;
}}}}}}
case 3:
    System.out.println("المنبة الذكي");

    int currentHour, currentMinute;
    int alarmHour, alarmMinute;

    System.out.println("أدخل الساعة الحالية");
    currentHour = in.nextInt();
    System.out.println("أدخل الدقائق الحالية");
    currentMinute = in.nextInt();
    System.out.println("أدخل ساعة التنبية");
    alarmHour = in.nextInt();
    System.out.println("أدخل دقيقة التنبية");
    alarmMinute = in.nextInt();
    while (true) {
        for (int counter_hours = currentHour; counter_hours < 24; counter_hours++) {
            for (int counter_minutes = currentMinute; counter_minutes < 60; counter_minutes++) {
                for (int counter_second = 0; counter_second < 60; counter_second++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    System.out.println("\033[h\033[2j");
                    System.out.flush();
                    System.out.println(counter_hours + ":" + counter_minutes + ":" + counter_second);

                    if (counter_hours == alarmHour && counter_minutes == alarmMinute) {
                        System.out.println("تنبية");
                    }}}}}
                    case 4:{
                        System.out.println("شكرا لإستخدام تبطبيقنا");
                       break;}
                    default:
                        System.out.println("Error.Try again");}
  }while(Opration !=4);
        System.out.println("Thanks");
 
        }
 }
        
 
           
        
