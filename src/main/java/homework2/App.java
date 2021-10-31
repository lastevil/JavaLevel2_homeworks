package homework2;

public class App {
    public static void main(String[] args) {
        String[][] arr= new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "s"},
                {"1", "2", "3", "4"},
        };
        try {
            StrMass(arr);
        }
        catch (MyArraySizeException e){
            System.out.println(e.fillInStackTrace());
        }
        catch (MyArrayDataException d){
            System.out.println(d.fillInStackTrace());
        }
    }

    public static void StrMass(String[][] str) throws MyArraySizeException,MyArrayDataException{
        int summ =0;
        if (str.length!=4){
            throw new MyArraySizeException();
        }else
        for (int i=0; i<str.length;i++){
         if(str[i].length!=4){
            throw new MyArraySizeException();
         }
        }
        for (int i=0;i<str.length;i++){
            for (int j=0;j<str[0].length;j++){
                try{
                    summ+=Integer.parseInt(str[i][j]);
                }catch (NumberFormatException e){
                    throw  new MyArrayDataException("Ошибка в строке "+i+" столбце "+j+" находится "+str[i][j]);
                }
            }
        }
        System.out.println(summ);
    }

}
