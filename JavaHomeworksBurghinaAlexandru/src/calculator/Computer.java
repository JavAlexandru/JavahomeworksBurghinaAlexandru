/*
 * My computer
 */
package calculator;

/**
 * This computer is composed from a list of 20 buttons
 * @author gheorgheaurelpacurar
 */
public class Computer {
    
    Button[] computerBoard = {new Button("+"),new Button("1"),new Button("7"),new Button("=")};
    int result = 0;
    String lastOperand = "";
    
    public void doOperation(String operation){
    
        if(null != operation)switch (operation) {
            case "+":
                computerBoard[0].operation();
                lastOperand="+";
                break;
            case "=":
                computerBoard[3].operation();
                System.out.println(result);
                result=0;
                break;
            case "1":
                computerBoard[1].operation();
                if("+".equals(lastOperand))
                    result++;
                else if("".equals(lastOperand))
                    result=1;
                break;
            case "7":
                computerBoard[2].operation();
                if("+".equals(lastOperand))
                    result = result+7;
                 else if("".equals(lastOperand))
                    result=7;
                break;
            default:
                break;
        }        
    } 
}
