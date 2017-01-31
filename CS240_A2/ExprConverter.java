public class ExprConverter {


	public static String printPostFix(String str){

        ArrayStack stack = new ArrayStack();
        String postfix = "";
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                postfix = postfix + c;

            }
            else if(c == '('){
                continue;
            }
            else if(c == ')'){
                postfix = postfix + ((Character)stack.pop()).toString();

            }
            else{
                stack.push(c);

            }
        }
        return postfix;

    }


    public static String printPreFix(String str){

        ArrayStack stack = new ArrayStack();
        String prefix = "";
        for(int i=str.length()-1; i > =0; i--){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                prefix = ((Character)c).toString() + prefix;
            }
            else if(c == '('){
                prefix = ((Character)stack.pop()).toString() + prefix;
            }
            else if(c == ')'){
                continue;
            }
            else{
                stack.push(c);
            }
        }
        return prefix;
    }

}

