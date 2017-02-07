
package javaapplication42;
import java.util.*;
public class JavaApplication42 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb=new Scanner(System.in);
        String word[]=new String[4];//เก็บศัพท์ได้ 10 คำ โดยจะนำไปต่อกับ data base ภายหลัง
  
        
        int deadCounter=0;//ถ้า counter เพิ่มจนนถึง 0 คือ ขึ้นว่าแพ้เกม
        word[0]="sophisticate";
        word[1]="conclave";
        word[2]="inept";
        word[3]="wither";
        int randomWord=(int)((Math.random()*(3-0+1)));//สุ่มว่าจะเลือก คำที่เท่าไหร่ดี       
        int wordLength=word[randomWord].length();//ความยาวของคำที่เราสุ่มมาได้
        String subWord[]=new String[wordLength];//นำความยาวของอักษีที่ได้มาตัด **************เราใช้ตัวนี้ในการเทียบช่องว่าง
        
        for(int i=0;i<wordLength;i++){//นำคำไปเก็บเช่นจาก String hhuawe- >>>char h u a w e i เก็บใน array ช่อง 0 ถึง 5
            subWord[i]=word[randomWord].charAt(i)+"";//ใส่คำลงไป
        }
        //ถ้าคำมากกว่า 10 ตัดเหลือ 4 ตัวอักษร
        //เริ่มการสุ่มมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมม
        if(word[randomWord ].length()>=10){//เข้า if มาเช็คความยาวตัวอักษรด้วย .length()          

            int arrayDistinctPosition[]=new int[wordLength];//สร้าง array มาเก้บตำแหน่งข้างบน
            while(true){
     
                for(int i=0;i<arrayDistinctPosition.length;i++){//สุ่มค่าให้ตำแหน่งวนไปทั้งหมดจา่กนั้นเราค่อยไปเช็คอีกทีว่าซ้ำหรือไม่
                    arrayDistinctPosition[i]=(int)(Math.random()*(wordLength-1+0+1))+0; 
                    //คำที่ 0 เก้บเลขสุ่มไรไม่รู้ วนไปคำที่ 1 2 3...
                }
                int duplicate=0;// สมมติว่ามี 4 ตัวเราจะเช็คกัน 3 ตัวที่ไม่ซ้ำข้างๆมัน และเราจะไม่เช็คตัวมันเอง เช็คเริ่มจากตัวที่ 0
                for(int i=0;i<arrayDistinctPosition.length;i++){// i คือตำแหน่งหลักที่จะยึด
                    for(int j=0;j<arrayDistinctPosition.length;j++){
                        if(i!=j){//ไม่ใช่ตำแหน่งเดียวกันเราจึงจะเช็ค
                            if(arrayDistinctPosition[i]==arrayDistinctPosition[j] ){
                                duplicate++;//ถ้าเกิดหลักสองตัวนั้นค่าซ้ำกันก็จะถูกเพิ่มค่าการซ้ำ
                            }                          
                        }
                    }

                }
                if(duplicate==0){//ไม่ซ้ำเลยสักตัวก็จะ break;
                    break;
                }
                //ถ้าไม่ break แสดงว่ายังมีสักตัวที่ซ้ำ                          
                
            }
            //จุดช่วงการสุ่มมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมม
                     
            System.out.println("Your word : "+word[randomWord]);//ใช้แค่ให้แสดงว่าปริ้นถูกรึเปล่า
            for(int i=0;i<subWord.length;i++){//ให้วนลูปถ้าเกิดไม่ใช่ตำแหน่งที่เราล็อคไว้ช่องนั้นจะกลวงๆ _
                if(i==arrayDistinctPosition[0]){//ถ้าเป้นคำที่เราสุ่มมาก็คือนำตัวอักษรนั้นมาลง
                    System.out.print(subWord[arrayDistinctPosition[0]]+" ");                   
                }
                else if(i==arrayDistinctPosition[1]){//ถ้าคำแรกยังไม่ใช่อีกก็มาคำสอง
                    System.out.print(subWord[arrayDistinctPosition[1]]+" ");//ถ้าใช่ก็นำมา print
                }
                else if(i==arrayDistinctPosition[2]){
                    System.out.print(subWord[arrayDistinctPosition[2]]+" ");//ถ้าคำสองยังไม่ใช่อีกก็มาคำสาม
                }
                else if(i==arrayDistinctPosition[3]){
                    System.out.print(subWord[arrayDistinctPosition[3]]+" ");//ยังมีใช่อีกก็มาคำสุดท้าย
                }
                else{
                    System.out.print("_ ");//ไม่มีเลยสักคำก็ทำ _ ไป
                }
                
            }
            String afterSetWordPosition[]=new String [wordLength];//มีจำนวนช่องเหมือนกับคำที่เราสุ่มมาได้เปะเๆลยเพียงแต่ตัวนี้จะมีช่องว่างๆกลวงๆไว้เช่น S_ O_ P
            
            for(int i=0;i<afterSetWordPosition.length;i++){//เติมทุกช่องเป้นขีดก่อน
                afterSetWordPosition[i]="_";
            }
            
            for(int i=0;i<arrayDistinctPosition.length;i++){//เขียนทับลงไป
                afterSetWordPosition[arrayDistinctPosition[i]]=subWord[arrayDistinctPosition[i]];
                
            }

            while(true){
                int checkFinish=0;//เช็คว่ายังมีตัว _ อีกไหม ถ้ายังมีอีกแสดงว่าคำยังเติมไม่ครบแต่ถ้า indexOf คืนค่าเป้น -1 แสดงว่าหา _ ไม่เจอแล้ว
                String wordCompound="";
                System.out.print("\nEnter Word : ");
                String inputWord=(kb.next().charAt(0))+"";//ใส่คำเข้าไปว่าจะเดาตัวไหน
                for(int i=0;i<afterSetWordPosition.length;i++){
                    if( inputWord.equalsIgnoreCase(subWord[i])  ){
                        afterSetWordPosition[i]=inputWord;//ใส่ถูกก็แสดงว่านำคำเข้าไปได้
                        
                        //ตัวเทสเช็คบั้คยังไม่ต้องลบโค้ดก็ได้นะ
                                                                      
                    }
                    else{//ใส่ผิด
                        deadCounter++;
                    }
                }
                for(int j=0;j<afterSetWordPosition.length;j++){
                    System.out.println("dEbug:");
                    wordCompound=wordCompound+afterSetWordPosition[j];
                }
                checkFinish=wordCompound.indexOf("_");//ให้เอาคำที่เราประกอบรวมกันไปหาว่ายังมี _ อีกไหม ถ้ายังมีแสดงว่าคำยังไม่สมบูรณ์แต่ถ้า
                //indexOf คืนค่าออกมาเป็น -1 แสดงว่าโปรแกรมเราคำครบแล้ว จากนั้นจะไปเข้า if เช็คถ้า indexOf==-1 โปรแกรมจะหยุดให้ใส่คำ
                        
                System.out.println("compund :"+wordCompound);
                if(checkFinish==-1){
                    break;//มีคำครบตามจำนวนที่ต้องการแล้วไม่จุดประๆ _ อีกต่อไป
                }
                if(deadCounter==10){//ทายไม่ถูกจนครบสิบครั้งก็แพ้ไปนะจ้ะ
                    System.out.println("Your dead game over !!!");
                    break;
                }
                for(String a:afterSetWordPosition){
                    System.out.print(a+" ");
                }
                
                System.out.println();
                
            }
         
//            System.out.println("\nEnter Word : ");              
//            String inputWord=kb.next();    
        }
        
        //ถ้าคำมากกว่า 8 คำตัดเหลือ 3 ตัวอักษร
        else if(word[randomWord].length()>=8){//เข้า if มาเช็คความยาวตัวอักษรด้วย .length()
            int arrayDistinctPosition[]=new int[3];//สร้าง array มาเก้บตำแหน่งข้างบน  
            
            while(true){                   
                for(int i=0;i<arrayDistinctPosition.length;i++){//สุ่มค่าให้ตำแหน่งวนไปทั้งหมดจา่กนั้นเราค่อยไปเช็คอีกทีว่าซ้ำหรือไม่
                    arrayDistinctPosition[i]=(int)(Math.random()*(wordLength-1+0+1))+0; 
                    //คำที่ 0 เก้บเลขสุ่มไรไม่รู้ วนไปคำที่ 1 2 3...
                }
                int duplicate=0;// สมมติว่ามี 4 ตัวเราจะเช็คกัน 3 ตัวที่ไม่ซ้ำข้างๆมัน และเราจะไม่เช็คตัวมันเอง เช็คเริ่มจากตัวที่ 0
                for(int i=0;i<arrayDistinctPosition.length;i++){// i คือตำแหน่งหลักที่จะยึด
                    for(int j=0;j<arrayDistinctPosition.length;j++){
                        if(i!=j){//ไม่ใช่ตำแหน่งเดียวกันเราจึงจะเช็ค
                            if(arrayDistinctPosition[i]==arrayDistinctPosition[j] ){
                                duplicate++;//ถ้าเกิดหลักสองตัวนั้นค่าซ้ำกันก็จะถูกเพิ่มค่าการซ้ำ
                            }                          
                        }
                    }

                }
                if(duplicate==0){//ไม่ซ้ำเลยสักตัวก็จะ break;
                    break;
                }
            }
            System.out.println("Your word : "+word[randomWord]);
            for(int i=0;i<subWord.length;i++){//ให้วนลูปถ้าเกิดไม่ใช่ตำแหน่งที่เราล็อคไว้ช่องนั้นจะกลวงๆ _
                if(i==arrayDistinctPosition[0]){//ถ้าเป้นคำที่เราสุ่มมาก็คือนำตัวอักษรนั้นมาลง
                    System.out.print(subWord[arrayDistinctPosition[0]]+" ");                   
                }
                else if(i==arrayDistinctPosition[1]){//ถ้าคำแรกยังไม่ใช่อีกก็มาคำสอง
                    System.out.print(subWord[arrayDistinctPosition[1]]+" ");//ถ้าใช่ก็นำมา print
                }
                else if(i==arrayDistinctPosition[2]){
                    System.out.print(subWord[arrayDistinctPosition[2]]+" ");//ถ้าคำสองยังไม่ใช่อีกก็มาคำสาม
                }                
                else{
                    System.out.print("_ ");//ไม่มีเลยสักคำก็ทำ _ ไป
                }
            }
            
            String afterSetWordPosition[]=new String [wordLength];//มีจำนวนช่องเหมือนกับคำที่เราสุ่มมาได้เปะเๆลยเพียงแต่ตัวนี้จะมีช่องว่างๆกลวงๆไว้เช่น S_ O_ P
            
            for(int i=0;i<afterSetWordPosition.length;i++){//เติมทุกช่องเป้นขีดก่อน
                afterSetWordPosition[i]="_";
            }
            
            for(int i=0;i<arrayDistinctPosition.length;i++){//เขียนทับลงไป
                afterSetWordPosition[arrayDistinctPosition[i]]=subWord[arrayDistinctPosition[i]];
                
            }

            while(true){
                int checkFinish=0;//เช็คว่ายังมีตัว _ อีกไหม ถ้ายังมีอีกแสดงว่าคำยังเติมไม่ครบแต่ถ้า indexOf คืนค่าเป้น -1 แสดงว่าหา _ ไม่เจอแล้ว
                String wordCompound="";
                System.out.print("\nEnter Word : ");
                String inputWord=(kb.next().charAt(0))+"";//ใส่คำเข้าไปว่าจะเดาตัวไหน
                System.out.println("Dead"+deadCounter);
                for(int i=0;i<afterSetWordPosition.length;i++){
                    if( inputWord.equalsIgnoreCase(subWord[i])  ){
                        afterSetWordPosition[i]=inputWord;//ใส่ถูกก็แสดงว่านำคำเข้าไปได้
                        
                        //ตัวเทสเช็คบั้คยังไม่ต้องลบโค้ดก็ได้นะ
                                                                      
                    }
                    else if( !(inputWord.equalsIgnoreCase(subWord[i]))  ){//ใส่ผิด
                        deadCounter++;
                    }
                }
                for(int j=0;j<afterSetWordPosition.length;j++){
                    
                    wordCompound=wordCompound+afterSetWordPosition[j];
                }
                checkFinish=wordCompound.indexOf("_");//ให้เอาคำที่เราประกอบรวมกันไปหาว่ายังมี _ อีกไหม ถ้ายังมีแสดงว่าคำยังไม่สมบูรณ์แต่ถ้า
                //indexOf คืนค่าออกมาเป็น -1 แสดงว่าโปรแกรมเราคำครบแล้ว จากนั้นจะไปเข้า if เช็คถ้า indexOf==-1 โปรแกรมจะหยุดให้ใส่คำ
                        
                System.out.println("compund :"+wordCompound);
                if(checkFinish==-1){
                    break;//มีคำครบตามจำนวนที่ต้องการแล้วไม่จุดประๆ _ อีกต่อไป
                }
                if(deadCounter==10){//ทายไม่ถูกจนครบสิบครั้งก็แพ้ไปนะจ้ะ
                    System.out.println("Your dead game over !!!");
                    break;
                }
                for(String a:afterSetWordPosition){
                    System.out.print(a+" ");
                }
                
                System.out.println();
                
            }
            
        }
        
        
        //ถ้าคำนมากกว่ากว่าเท่ากับ 6 ตำเหลือ 2 ตัวอักษร
        else if(word[randomWord].length()>=6){//เข้า if มาเช็คความยาวตัวอักษรด้วย .length()
                int arrayDistinctPosition[]=new int[wordLength];//สร้าง array มาเก้บตำแหน่งข้างบน  
                
            while(true){                                 
                for(int i=0;i<arrayDistinctPosition.length;i++){//สุ่มค่าให้ตำแหน่งวนไปทั้งหมดจา่กนั้นเราค่อยไปเช็คอีกทีว่าซ้ำหรือไม่
                    arrayDistinctPosition[i]=(int)(Math.random()*(wordLength-1+0+1))+0; 
                    //คำที่ 0 เก้บเลขสุ่มไรไม่รู้ วนไปคำที่ 1 2 3...
                }
                int duplicate=0;// สมมติว่ามี 4 ตัวเราจะเช็คกัน 3 ตัวที่ไม่ซ้ำข้างๆมัน และเราจะไม่เช็คตัวมันเอง เช็คเริ่มจากตัวที่ 0
                for(int i=0;i<arrayDistinctPosition.length;i++){// i คือตำแหน่งหลักที่จะยึด
                    for(int j=0;j<arrayDistinctPosition.length;j++){
                        if(i!=j){//ไม่ใช่ตำแหน่งเดียวกันเราจึงจะเช็ค
                            if(arrayDistinctPosition[i]==arrayDistinctPosition[j] ){
                                duplicate++;//ถ้าเกิดหลักสองตัวนั้นค่าซ้ำกันก็จะถูกเพิ่มค่าการซ้ำ
                            }                          
                        }
                    }

                }
                if(duplicate==0){//ไม่ซ้ำเลยสักตัวก็จะ break;
                    break;
                }
            }
            
            System.out.println("Your word : "+word[randomWord]);
            for(int i=0;i<subWord.length;i++){//ให้วนลูปถ้าเกิดไม่ใช่ตำแหน่งที่เราล็อคไว้ช่องนั้นจะกลวงๆ _
                if(i==arrayDistinctPosition[0]){//ถ้าเป้นคำที่เราสุ่มมาก็คือนำตัวอักษรนั้นมาลง
                    System.out.print(subWord[arrayDistinctPosition[0]]+" ");                   
                }
                else if(i==arrayDistinctPosition[1]){//ถ้าคำแรกยังไม่ใช่อีกก็มาคำสอง
                    System.out.print(subWord[arrayDistinctPosition[1]]+" ");//ถ้าใช่ก็นำมา print
                }                              
                else{
                    System.out.print("_ ");//ไม่มีเลยสักคำก็ทำ _ ไป
                }
            }
            
            String afterSetWordPosition[]=new String [wordLength];//มีจำนวนช่องเหมือนกับคำที่เราสุ่มมาได้เปะเๆลยเพียงแต่ตัวนี้จะมีช่องว่างๆกลวงๆไว้เช่น S_ O_ P
            
            for(int i=0;i<afterSetWordPosition.length;i++){//เติมทุกช่องเป้นขีดก่อน
                afterSetWordPosition[i]="_";
            }
            
            for(int i=0;i<arrayDistinctPosition.length;i++){//เขียนทับลงไป
                afterSetWordPosition[arrayDistinctPosition[i]]=subWord[arrayDistinctPosition[i]];
                
            }

            while(true){
                int checkFinish=0;//เช็คว่ายังมีตัว _ อีกไหม ถ้ายังมีอีกแสดงว่าคำยังเติมไม่ครบแต่ถ้า indexOf คืนค่าเป้น -1 แสดงว่าหา _ ไม่เจอแล้ว
                String wordCompound="";
                System.out.print("\nEnter Word : ");
                String inputWord=(kb.next().charAt(0))+"";//ใส่คำเข้าไปว่าจะเดาตัวไหน
                for(int i=0;i<afterSetWordPosition.length;i++){
                    if( inputWord.equalsIgnoreCase(subWord[i])  ){
                        afterSetWordPosition[i]=inputWord;//ใส่ถูกก็แสดงว่านำคำเข้าไปได้
                        
                        //ตัวเทสเช็คบั้คยังไม่ต้องลบโค้ดก็ได้นะ
                                                                      
                    }
                    else{//ใส่ผิด
                        deadCounter++;
                    }
                }
                
                for(int j=0;j<afterSetWordPosition.length;j++){
                    
                    System.out.println("dEbug:");
                    wordCompound=wordCompound+afterSetWordPosition[j];
                }
                checkFinish=wordCompound.indexOf("_");//ให้เอาคำที่เราประกอบรวมกันไปหาว่ายังมี _ อีกไหม ถ้ายังมีแสดงว่าคำยังไม่สมบูรณ์แต่ถ้า
                //indexOf คืนค่าออกมาเป็น -1 แสดงว่าโปรแกรมเราคำครบแล้ว จากนั้นจะไปเข้า if เช็คถ้า indexOf==-1 โปรแกรมจะหยุดให้ใส่คำ
                        
                System.out.println("compund :"+wordCompound);
                if(checkFinish==-1){
                    break;//มีคำครบตามจำนวนที่ต้องการแล้วไม่จุดประๆ _ อีกต่อไป
                }
                if(deadCounter==10){//ทายไม่ถูกจนครบสิบครั้งก็แพ้ไปนะจ้ะ
                    System.out.println("Your dead game over !!!");
                    break;
                }
                for(String a:afterSetWordPosition){
                    System.out.print(a+" ");
                }
                
                System.out.println();
                
            }
      
        }
        
        //ถ้าคำน้อยกว่าเท่ากับ 5 คำ ตัดเหลือตัวอักษรเดียว
        else if(word[randomWord].length()<=5){//เข้า if มาเช็คความยาวตัวอักษรด้วย .length()
            int keepWordAtPosition1=(int)(Math.random()*(wordLength-1+0+1))+0;//คำที่เราล้อคไว้
            System.out.println("Your word : "+word[randomWord]);
            for(int i=0;i<subWord.length;i++){//ให้วนลูปถ้าเกิดไม่ใช่ตำแหน่งที่เราล็อคไว้ช่องนั้นจะกลวงๆ _
                if((subWord[i]!=subWord[keepWordAtPosition1]) ){//ถ้าไม่ใช่คำที่เราล็อคไว้ที่ตำแหน่งนั้นจะกลาวงหใ้ขีด  _ _ _
                    System.out.print("_ ");                   
                }
                else{
                    System.out.print(subWord[keepWordAtPosition1]+" ");//ถ้าใช่ก็นำมา print
                }
            }
            System.out.println(keepWordAtPosition1);
            //System.out.println(subWord[keepWordAtPosition]);
        }
        
       
     
    }
    
}
