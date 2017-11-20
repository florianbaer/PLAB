package ch.hslu.plab.CyberDojoNov;



import java.util.ArrayList;

public class BracketsEvaluator {

    private ArrayList<BracketsPair> pairs = new ArrayList<BracketsPair>();

    public boolean isBalanced(String input) {
        for(char character :input.toCharArray()) {
           if(character == '{' ||character == '[' ||character == '('){
               char end;
               if(character == '{'){
                   end = '}';
               }
               else if(character == '('){
                   end = ')';
               }
               else if(character == '['){
                   end = ']';
               }
               else{
                   throw new IllegalArgumentException("pli");
               }
               BracketsPair pair = new BracketsPair(character, end);
               pairs.add(pair);
           }
           else if(character == '}' ||character == ')' ||character == ']'){
               if(pairs.get(pairs.size() - 1).canClose(character)){
                   pairs.get(pairs.size() - 1).Close();
               }
               else{
                   return false;
               }
           }
           else{
               throw new IllegalArgumentException("Contains illegal characters " + character );
           }
            if(!pairs.get(pairs.size() - 1).isOpen()){
               pairs.remove(pairs.get(pairs.size() - 1));
            }
        }

        return true;
    }
}
