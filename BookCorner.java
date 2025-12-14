
/**
 * Write a description of class fi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookCorner{
    public static void main(String[] args){
        String[] categories= {"Fiction","Nepali"};
        String[][] titles= new String[2][1];
        double[][] prices= new double[2][1];
        titles[0][0] ="Inception";
        titles[1][0] ="Yogmaya";
        prices[0][0] = 415.0;
        prices[1][0] = 312.0;
       
        for(int i=0; i<categories.length; i++){
            System.out.println("Category:"+categories[i]);
            for(int j=0; j<titles[i].length; j++){
                if ( titles[i][j]!= null){
                    System.out.println("Title: "+ titles[i][j]);
                    System.out.println("Price: "+ prices[i][j]);
                }
                System.out.println();
            }
        }
       
    }
}