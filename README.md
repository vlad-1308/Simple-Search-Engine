# Simple-Search-Engine
My first pet project with JetBrains Academy tutorial
This is a console application that will help you find the necessary information from a file (the name of which must be specified in the application's launch options).
At the development stage, data of the following format were taken as the basis for information: Name, Surname, Email. 
But, there is no rigid binding to the type of information.

You can interact with the search engine through the menu:
1. Find a person (optional, this will not necessarily be people's data).
2. Output all lines from the target file.
0. Exit the program.

Three search strategies have been implemented.
Any : The program will return all lines that contain each word from the search query.
All : the program will return only those lines in which the entire expression for the search query is present.
None : The program will return all lines that do NOT contain any of the words from the search query.
