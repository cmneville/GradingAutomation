import java.util.*;
import java.io.*;

class Checker{
   public static void main(String[] args){
      
      
      //*********************************Define Student Names   Change as needed****************************************
      String[] block1 = {};
      String[] block2 = {};
      String[] block3 = {};
      String[] block4 = {};
      String[] block5 = {};
      String[] block6 = { "","SChiang" , "QDavidson" , "NKamencik" , "FKim" , "BLeimberger", "JLesley" ,
                                 "SMabry" , "LMayer" , "LMcenhimer" , "BMosavello" , "SPendyal" ,
                                 "SSreekesh" , "STaylor" , "DVizdos" , "EXie"};
      String[] block7 = { "AAnand" , "SChaterjee" , "KDuong" , "MFarag" , "BHallocksolomon" , "CLarkin" ,
                                 "SLarochelle" , "JLu" , "ERozario" ,"NTracey", "TShezad" , "RVanderzee" , "PWalters",
                                 "QWang" , "CWomack"};
                                 
      //2d array of students.  Each array is a class, each element is a name
      String[][] classes = {block1 , block2 , block3 , block4 , block5 , block6 , block7};//change the size of the array to fit how many classes you have
      //****************************************************************************************************************
      
      String projName = "";//Define project name here
      for(int j = 0; j < classes.length; j++){
         String block = "Block" + j;
         for(int i = 0; i < classes[j].length; i++){
            try{
               String corrPath = projName + "//out.txt";//change to wherever the correct output is located
               String stuOutPath = "Outs\\" + block + "\\" + classes[j][i] + "Out.txt";//change to wherever the student output is located
               File out = new File("Grades\\" + block + classes[j][i] + "grade.txt");
               File in = new File(stuOutPath);
               File correct = new File(corrPath);
               Scanner stuScan = new Scanner(in);
               Scanner corrScan = new Scanner(correct);
               PrintStream output = new PrintStream(out);
               
               //***********************************Compare the correct txt file with the student's below***************
               output.println("Fill in comparison logic");
               //*******************************************************************************************************
               
            }catch(Exception e){
               System.out.println(classes[j][i] + " Something went wrong!!!");
               System.out.println(e);
            }
         }
      }
   }
}