package Week1.Variables;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StillUsingVariables {
    public static void main(String[] args) {
        String name = "Ezequias Guerra";
        try {
            Date dategrad = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
            String result = String.format("My name is %s and I'll graduate in %s", name, dategrad.getYear()+1900);

            System.out.println(result);
        }
            catch (ParseException e) {
            e.printStackTrace();
        }


    }



}
