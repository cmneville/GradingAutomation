import java.io.*;
import java.util.*;


class Runner{
   public static void main(String[] args)throws Exception{
      
      
      
      
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
      
      /*****************************************************************************************************************
      *The line below will set a text file that will act as StdIn if necessary. Default config is to provide input file
      through the command line args.  If the program is supposed to read from StdIn, then uncomment this line and be sure
      that there is a file called in.txt in this directory.
      */
      //File in = new File("in.txt");
      
      
      //*******************************************Define Project Name**************************************************
      String projName = "";//project name goes in this string
      //****************************************************************************************************************
      
      for(int j = 0; j < classes.length; j++){
         String block = "Block" + j;
         for(int i = 0; i < classes[j].length; i++){
            String dir = "Projects\\" + block + "\\" + classes[j][i] + projName;//defines the working directory
            String[] cmd = {"javac", dir + "\\" + projName + ".java"};//defines the compile command
            try{
               Runtime.getRuntime().exec(cmd).waitFor();//executes the compile command
               
               //Uncomment if you want to redirect project output from StdOut
               //File out = new File("Outs\\" + block + "\\" + classes[j][i] + "Out.txt");               
               
               ProcessBuilder pb = new ProcessBuilder("java",dir + classes[j][i] + projName, "SampleTestFile.txt");
               File direct = new File(dir);
               pb.directory(direct);//sets pb's working directory
               
               /*********************************************************************************************************
               *These lines redirect StdIn and StdOut for the process we are creating.  If you would like to redirect
               *StdIn and StdOut, uncomment these lines.  Be sure that you have uncommented the lines above that 
               *correspond to this.
               */
               //pb.inheritIO();
      		   //pb.redirectInput(in);
      		   //pb.redirectOutput(out);
               //********************************************************************************************************
               
               Process p = pb.start();
               int exitVal = p.waitFor();
               System.out.println(classes[j][i] + " Exited with error code "+exitVal);
            }catch(Exception e){
               System.out.println("\t" + classes[j][i] + " Something went wrong!");
               System.out.println("\t\t"+ e);
            }   
         }
      }
   }
}