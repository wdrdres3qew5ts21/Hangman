
package javaapplication42;

public class JavaApplication42 {

    public static void main(String[] args) {
        // TODO code application logic here
        String word[]=new String[4];//เก็บศัพท์ได้ 10 คำ
        word[0]="sophisticate";//เป็นตัวอย่างของฐานข้อมูลว่าจะสุ่มเลือกคำไหนมาดี
        word[1]="conclave";
        word[2]="inept";
        word[3]="wither";
        int randomWord=(int)((Math.random()*(3-0+1)));//สุ่มว่าจะเลือก คำที่เท่าไหร่ดี       
        int wordLength=word[randomWord].length();//ความยาวของคำที่เราสุ่มมาได้
        char subWord[]=new char[wordLength];//นำความยาวของอักษีที่ได้มาตัด **************เราใช้ตัวนี้ในการเทียบช่องว่าง
        
        for(int i=0;i<wordLength;i++){//นำคำไปเก็บเช่นจาก String hhuawe- >>>char h u a w e i เก็บใน array ช่อง 0 ถึง 5
            subWord[i]=word[randomWord].charAt(i);//ใส่คำลงไป
        }
        //ถ้าคำมากกว่า 10 ตัดเหลือ 4 ตัวอักษร
        //เริ่มการสุ่มมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมมม
        if(word[randomWord ].length()>=10){//เข้า if มาเช็คความยาวตัวอักษรด้วย .length()          
            int keepWordAtPosition1;//เราประกาศตัวแปลไว้ใช้ในการสุ่มเก้บค่าตำแหน่งเลขจนกว่าโปรแกรมจะวน loop true แล้วเช็คว่าเลขไม่ซ้ำกันเลย
            int keepWordAtPosition2;
            int keepWordAtPosition3;
            int keepWordAtPosition4;
            int arrayDistinctPosition[]=new int[4];//สร้าง array มาเก้บตำแหน่งข้างบน
            while(true){
                keepWordAtPosition1=(int)(Math.random()*(wordLength-1+0+1))+0;//สุ่มำแหน่งของตัวอักษรที่จะล็อคเอาไว้
                keepWordAtPosition2=(int)(Math.random()*(wordLength-1+0+1))+0;
                keepWordAtPosition3=(int)(Math.random()*(wordLength-1+0+1))+0;
                keepWordAtPosition4=(int)(Math.random()*(wordLength-1+0+1))+0;
       
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
            
            //ถ้ามี 5 ตัวต้องสุ่มไม่ซ้ำกัน 4 ครั้ง
            System.out.println("Your word : "+word[randomWord]);//ใช้แค่ให้แสดงว่าปริ้นถูกรึเปล่า
            for(int i=0;i<subWord.length;i++){//ให้วนลูปถ้าเกิดไม่ใช่ตำแหน่งที่เราล็อคไว้ช่องนั้นจะกลวงๆ _
                if(subWord[i]==subWord[keepWordAtPosition1]){//ถ้าเป้นคำที่เราสุ่มมาก็คือนำตัวอักษรนั้นมาลง
                    System.out.print(subWord[keepWordAtPosition1]+" ");                   
                }
                else if(subWord[i]==subWord[keepWordAtPosition2]){//ถ้าคำแรกยังไม่ใช่อีกก็มาคำสอง
                    System.out.print(subWord[keepWordAtPosition2]+" ");//ถ้าใช่ก็นำมา print
                }
                else if(subWord[i]==subWord[keepWordAtPosition3]){
                    System.out.print(subWord[keepWordAtPosition3]+" ");//ถ้าคำสองยังไม่ใช่อีกก็มาคำสาม
                }
                else if(subWord[i]==subWord[keepWordAtPosition4]){
                    System.out.print(subWord[keepWordAtPosition4]+" ");//ยังมีใช่อีกก็มาคำสุดท้าย
                }
                else{
                    System.out.print("_ ");//ไม่มีเลยสักคำก็ทำ _ ไป
                }
            }
            System.out.println("\nEnter Word : ");
            
                
        }
        
        //ถ้าคำมากกว่า 8 คำตัดเหลือ 3 ตัวอักษร
        else if(word[randomWord].length()>=8){//เข้า if มาเช็คความยาวตัวอักษรด้วย .length()
            int keepWordAtPosition1;
            int keepWordAtPosition2;
            int keepWordAtPosition3;
            while(true){
                keepWordAtPosition1=(int)(Math.random()*(wordLength-1+0+1))+0;
                keepWordAtPosition2=(int)(Math.random()*(wordLength-1+0+1))+0;
                keepWordAtPosition3=(int)(Math.random()*(wordLength-1+0+1))+0;
                int arrayDistinctPosition[]=new int[3];//สร้าง array มาเก้บตำแหน่งข้างบน     
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
                if(subWord[i]==subWord[keepWordAtPosition1]   ){//ถ้าไม่ใช่คำที่เราล็อคไว้ที่ตำแหน่งนั้นจะกลาวงหใ้ขีด  _ _ _
                    System.out.print(subWord[keepWordAtPosition1]+" ");                   
                }
                else if(subWord[i]==subWord[keepWordAtPosition2]){
                    System.out.print(subWord[keepWordAtPosition2]+" ");
                }
                else if(subWord[i]==subWord[keepWordAtPosition3]){
                    System.out.print(subWord[keepWordAtPosition3]+" ");
                }
                else{
                    System.out.print("_ ");//ถ้าใช่ก็นำมา print
                }
            }
           
                
        }
        
        //ถ้าคำนมากกว่ากว่า 6 ตำเหลือ 2 ตัวอักษร
        else if(word[randomWord].length()>=6){//เข้า if มาเช็คความยาวตัวอักษรด้วย .length()
                int keepWordAtPosition1;
                int keepWordAtPosition2;
            while(true){
                keepWordAtPosition1=(int)(Math.random()*(wordLength-1+0+1))+0;
                keepWordAtPosition2=(int)(Math.random()*(wordLength-1+0+1))+0;             
                int arrayDistinctPosition[]=new int[3];//สร้าง array มาเก้บตำแหน่งข้างบน     
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
                if( (subWord[i]==subWord[keepWordAtPosition1]) ){//ถ้าไม่ใช่คำที่เราล็อคไว้ที่ตำแหน่งนั้นจะกลาวงหใ้ขีด  _ _ _
                    System.out.print(subWord[keepWordAtPosition1]+" ");                   
                }
                else if((subWord[i]==subWord[keepWordAtPosition2])){
                    System.out.print(subWord[keepWordAtPosition2]+" ");
                }
                else{
                    System.out.print("_ ");//ถ้าใช่ก็นำมา print
                }
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
            //System.out.println(subWord[keepWordAtPosition]);
        }
        
       
     
    }
    
}
