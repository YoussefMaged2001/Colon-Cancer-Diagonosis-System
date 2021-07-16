# Colon Cancer Diagnosis System:
A Java based OOP System that Detects whether the Inputted Colon Cell is a Malignant or a Benign Tumor Colon Cell, Based on the Registered Cells Previously Diagnosed.

## Dataset Setup Consists of:
1- Number of Patients.<br>
2- Number of Genes.<br>
3- Number of Trained Patients.<br>
4- Number of Tested Patients.<br>
5- Dataset File Path.<br> <br>
<img src = "Setup.jpg" alt = "Dataset Setup">


## System Features:
1- **Show Graph**: Shows a Pie Graph of the Sample Accuracy and the Percentage of Predicted Conditions.<br>
2- **Add**: Adds a Patient's Inforamtion to the System.<br>
3- **Search**: Searches for a Patient in the System to Show the Actual and Predicted Value using the Nearest Neighbour Classification Method.<br> <br>
<img src = "Features.jpg" alt = "Main Menu Features">

## **Nearest Neighbour** Classification Mehtod:
- **First**: Calculate Euclidiean Distance between a Patient from Test Patients and Each Patient in Tratining Patients.<br>
- **Second**: Pick the Smallest Euclidiean Distance Which refers to the Highest Similatirty.<br>
- **Third**: If the Patient with Lowest Distance and Highest Similarity is Cancered, then the Tested Patient is also Predicted to be Cancered. And if not, then the Teseted Patient is not Predicted to be Cancered.<br>
