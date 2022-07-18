public class pat2 {
    static int[] aRow = new int[]{1,1,9,6};
    static int[] bRow = new int[]{8,20,62,65};
    static int[] cRow = new int[]{65,34,20,8};
    static int[] dRow = bRow;
    
    public static void main(String[] args) {
    for (int i = 0 ; i<4; i++) {
    
    prnMyText('J', aRow[i], 4);
    prnMyText('a', bRow[i], 7);
    prnMyText('v', cRow[i], 7);
    prnMyText('a', bRow[i], 7);
    System.out.print("\n");
    }
    }
    
    public static void prnMyText(char myChar, int myRow, int length){
    String myJ = "";
    for (int i=0; i< length ;i++) {
    
    myJ = (myRow % 2 == 0 ? " " : myChar) + myJ;
    myRow = myRow / 2;
    
    }
    System.out.print(myJ);
    }
    }