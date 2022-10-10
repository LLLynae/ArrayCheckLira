import java.util.Random;

public class ArrayLoop {

    int higherNumber = 101;
    int lowerNumber = -1;
    int arrayAmount = 100;
    int array [] = new int[10];

    public ArrayLoop(){
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * arrayAmount);
        }
        
        printTheStrings();
    }

    public int getArray(int index) {
        return array[index];
    }
    public int getHighNum(){
        return higherNumber;
    }

    public void printTheStrings(){

        System.out.println("Here is your array\n"+printArray()+"\n");
        System.out.println("Your average of the numbers in this array is "+average()+"\n");
        System.out.println("Your lowest: "+lowestNumber());
        System.out.println("Your highest: "+highestNumber());
        System.out.println("Here is your array in reverse \n"+reversal());
        System.out.println("Here is your first element: "+firstElement());
        System.out.println("Here is your last element: "+lastElement());
        System.out.println("Here are the odd indexes: \n"+OddIndexes());
        System.out.println("Here are the odd numbers in your array: \n"+OddNumbers());
    
    }
    
    public String printArray(){
        String arrayString = "";
        for(int array: array) {
            arrayString += array + "\n ";
        }
        return arrayString;
    }

    public String lowestNumber(){
        String arrayString = "";
        int lowNum = arrayAmount;
        int lowestIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < lowNum){
                lowNum = array[i];
                lowestIndex = i;
            }
        }
        this.lowerNumber = lowNum;
        arrayString += "Your lowest number is " +lowNum+ " at the index "+lowestIndex;
        return ""+arrayString+"\n";
    }

    public String highestNumber(){
        String arrayString = "";
        int highNum = 0;
        int highestIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > highNum){
                highNum = array[i];
                highestIndex = i;
            }
        }
        this.higherNumber = highNum;
        arrayString += "Your highest number is " + highNum + " at the index " + highestIndex + "\n";
        return ""+arrayString+"\n";
    }

    public String average(){
        double arraySum = 0;
        double averageNum = 0;
        for(int i = 0; i < array.length; i++){
            arraySum += (double)array[i];
            averageNum = arraySum/array.length;
        }
        return ""+averageNum;
    }

    public String reversal(){
        String arrayString = "";
        for(int i = array.length - 1; i >= 0; i--){
            arrayString += array[i] + "\n";
        }
        return arrayString;
    }

    public String firstElement(){
        return "" + array[0]+"\n";
    }

    public String lastElement(){
        return "" + array[array.length - 1] + "\n";
    }

    public String OddIndexes(){
        String arrayString = "";
        for(int i = 0; i < array.length; i+=2) {
            arrayString += array[i] + "\n";
        }
        return "" + arrayString;
    }

    public String OddNumbers(){
        String arrayString = "";
        for(int i = 0; i < array.length; ){
            if (array[i]%2 != 0){
                arrayString += array[i] +"\n";
            }
        }
        return "" + arrayString+ "\n";
    }

    

}
