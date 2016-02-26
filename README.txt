AUTOMATED GRADING SYSTEM
Written by Chris Neville - Deep Run High School

CONTENTS
I   - Introduction
II  - Description of Directory structure and included files.
III - Naming Conventions

This is a template Directory that contains all the framework required to automate grading.  

In order for the system to function correctly, many specific requirements must be met.  The requirements as well as
the meanings of that various files and SubDirectories in this framework are explained below.  This framework and the
code included is designed to be versatile and can be modified to work with any java project.  The Directory 
structure also can be put organized to work with a variety of different schedules.  It is important that you do not 
change the directory structure except as outlined in this guide otherwise it is possible that the grading programs 
will not work correctly.

II - Description of Directory structure and included files.

There are two java files with accompanying .class files: Runner and Checker.  These arrays both contain a two 
dimensional array named "classes".  You should fill this array with the names of your students by filling in the
block arrays located just above the declaration of "classes".  A more complete description of the names you should 
use for this step is included in Section III.  

Runner executes and (optionally) redirects output of all of each project in the Projects Directory.  

Checker reads the outputs of the projects and then compares those outputs to a text file with correct output. The
correct output must be put in the ProjName directory and (by default) should be named out.txt.  Due to the 
dynamic nature of programming projects, the logic for comparing the correct file to the student outputs is not
defined by default so you will need to fill this section before grading.  To do this, simply fill in the labeled
section of code.  Scanners have already been instanciated to read from the text files.  The correct output is read
from "corrScan" and the student output is read from "stuScan".  Additionally, you can output your result from the 
comparison using the PrintStream "output" which will print that result to a student-specific text file for you to
use later.

In addition to these files, there are several SubDirectories in the framework.  By default, the SubDirectories 
do not contain any files but they do contain some additional SubDirectories when necessary.  The SubDirectories will
be introduced in this section and discussed in more detail in sections following.  They are: Grades, Misc, Outs, 
Projects, and ProjName.

Grades contains additional subdirectories for each Block period so the programs remain organized by block.  It is 
ok if some of these block directories do not get used, they are simply there to ensure that the Checker program 
does not return an error; the program will use only the directories needed and leave the others empty.  Checker will
print its results in text files in the appropriate directories based on the student names defined in "classes"
arrays.  

Misc is by default an empty directiory.  Here you can put any test cases or other supporting files that you choose.
This directory is never referenced by the Runner or Checker classes and is simply a place for you to keep anything
to avoid clutter.

Outs is where, by default, the Runner class redirects output from the student programs and where, by default, the 
Checker class looks to find student output.

Projects is where you should store the students' code.  After the recommended submission method, the code should be
moved to this directory and unzipped into folders using the naming conventions outlined in Section III.

ProjName is most importantly where the Checker program looks to find the correct output file.  You can also,
optionally, use this directory to store your solution to the project for reference, although that could also go in 
the Misc folder.  The name of this Directory should be changed the the proper Project Name using the naming 
conventions outlined in Section III.

III - Naming Conventions.

It is recommended that you choose a naming convention to identify your students.  This is not defined or strictly 
enforced in the framework and you can use any convention you like.  An example of an appropriate naming convention 
for student identifiers is:
<firstInitial><lastName> - with firstInitial and the first letter of lastName being capitalized
So for example, CNeville.  Your students should then turn in zip files named using the same naming convention with
the projectName concatenated to the end. Example:
<firstInitial><lastName><projName>.zip
Using the name from above and the project HelloWorld, you would expect CNevilleHelloWorld.zip.  It is very important
that the naming conventions are followed strictly or the program will not be able to find the student files.

Inside the student's zip file should be all project work including both .java and .class files.  It is important
that they include the .class files as the Runner class will only compile the main class by default.  All supporting
classes should be included in the zip file and the class which contains the main method should be given a specific
project name.  This project name is the name that defines the project in general and is referred to in the framework
as ProjName or projName.  