package work2;

public class App {
    public static void main(String[] args) {
       String[][] arr= new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "s"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try{
        StrMass(arr);
        }catch (MyArrayDataException e){
            System.out.println("Ошибка в: ");
        }
    }

    public static void StrMass(String[][] str) throws NumberFormatException{
        int summ =0;
        if (str.length!=4 && str[0].length!=4){
            throw new MyArraySizeException();
        }
        else {
            for (int i=0;i<str.length;i++){
                for (int j=0;j<str[0].length;j++){

                    summ+=Integer.parseInt(str[i][j]);

                }
            }
            System.out.println(summ);
        }
    }
}
